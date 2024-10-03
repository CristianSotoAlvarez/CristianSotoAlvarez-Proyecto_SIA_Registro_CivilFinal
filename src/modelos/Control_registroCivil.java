package modelos;

import java.util.*;

public class Control_registroCivil {
   
    private HashMap<String, Persona> personas = new HashMap();
    private HashMap<String, ArrayList<Oficina>> oficinas = new HashMap();
    private Persona_bd bd_pp = new Persona_bd();
    private Oficina_bd bd_off = new Oficina_bd();

    public Control_registroCivil(){
        insercionDatosBase();
    }
    
    public void insercionDatosBase(){
        
        ArrayList<Persona> lista_pp = bd_pp.lectura();
        for(Persona pp : lista_pp)
            addPersona(pp);
        
        ArrayList<Oficina> lista_off = bd_off.lectura();
        for(Oficina off : lista_off)
            addOficina(off);       
    }
    
    public boolean addOficina(Oficina off) {
        ArrayList<Oficina> listaOficinas = oficinas.get(off.getRegion());
        if (listaOficinas == null) {
            listaOficinas = new ArrayList<>();
            oficinas.put(off.getRegion(), listaOficinas);
        } else if (buscarOficina(listaOficinas, off.getComuna()) || buscarOficina(listaOficinas, off.getCodigoOficina())) {
            return false;
        }
        listaOficinas.add(off);
        return true;
    }

    public boolean addPersona(Persona pp) {
        if (personas.containsKey(pp.getRut())) return false;
        personas.put(pp.getRut(), pp);        
        return true;
    }
    
    
    public boolean removePersona (String rutPersona){
        if (personas.containsKey((rutPersona))){
            personas.remove((rutPersona));
            return true;
        }
        return false;
    }
    
    public boolean removeOficina (String idOficina){
        Oficina offID = buscarOficina(idOficina);
        if(offID != null){
            for (Oficina off : oficinas.get(offID.getRegion())){
                if(off.getCodigoOficina().equals(idOficina)){
                    oficinas.get(offID.getRegion()).remove(off);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean buscarOficina(ArrayList<Oficina> lista, String comuna) {
        for (Oficina oficina : lista) {
            if (oficina.getComuna().equals(comuna)) return true;
        }
        return false;
    }
    
    public Oficina buscarOficina(String id){
        
        for(String clave : oficinas.keySet()){
            for(Oficina off : oficinas.get(clave))
                if(off.getCodigoOficina().equals(id)) return off;
        }
        return null;
    }

    public Persona buscarPersona(String rut){
        return personas.get(rut);
    }
    
    public ArrayList<Persona> listar_personas(String rut){
        
        ArrayList<Persona> lista_pp = new ArrayList(); 
        
        if(rut.equals("")){
            for(String ruts : personas.keySet())
               lista_pp.add(personas.get(ruts));
        }else{
            Persona pp = personas.get(rut);
            if(pp != null) lista_pp.add(pp);
        }    
       return lista_pp;     
    }  
    
    public ArrayList<Oficina> listar_oficinas(String id){
        
        ArrayList<Oficina> lista_off = new ArrayList(); 
        
        if(id.equalsIgnoreCase("")){
            for(String IDs : oficinas.keySet())
                lista_off.addAll(oficinas.get(IDs));
                                 
        }else{
            Oficina off = buscarOficina(id);
            if(off != null) lista_off.add(off);
        }    
       return lista_off;     
    } 
    
    public ArrayList<Persona> listar_personas_difuntas(String year){
        // Lo que yo quiero es crear un mostrar filtrado en base al ano de nacimiento que sale en la casilla
        ArrayList<Persona> lista_pp = new ArrayList();
        for (String clave : personas.keySet()){
            Persona pp = personas.get(clave);
            
            if(!pp.getFechaDefuncion().equals("")){
                
                String fechaDefun = pp.getFechaDefuncion();
                String [] partes = fechaDefun.split("-");
                String anioDefun = partes[2];
            
                if(anioDefun.equals(year)){
                    lista_pp.add(pp);
                }
            }    
        }
        return lista_pp;
    }
    
    public void generarReportePorAnio(String year) {
       ArrayList<Persona> personasFiltradas = listar_personas_difuntas(year);
       
       String rutaArchivo = "src/recursos/reportepersonas" + year + ".csv";
       ReporteCSV reporteCSV = new ReporteCSV(rutaArchivo);
       reporteCSV.crearReporte(personasFiltradas);
   }
}