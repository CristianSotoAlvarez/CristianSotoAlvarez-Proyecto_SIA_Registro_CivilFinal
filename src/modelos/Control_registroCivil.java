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
/*
    public boolean buscarOficina(ArrayList<Oficina> lista, int idOficina) {
        for (Oficina oficina : lista) {
            if (oficina.getCodigoOficina() == idOficina) return true;
        }
        return false;
    }
*/
    public boolean VerificarPersona(String rut) {
        return personas.containsKey(rut);
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
    
    public void imprimirOficinas(String region, String comuna) {
        ArrayList<Oficina> listaOficinas = oficinas.get(region);
        if (listaOficinas != null && !listaOficinas.isEmpty()) {
            boolean encontrado = false;
            for (Oficina oficina : listaOficinas) {
                if (oficina.getComuna().equals(comuna)) {
                    System.out.println("Region oficina : " + region);
                    System.out.println("Comuna oficina : " + oficina.getComuna());
                    System.out.println("Direccion Oficina : " + oficina.getDireccion() + "\n");
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("ERROR: No existen oficinas en la comuna especificada para la region.");
            }
        } else {
            System.out.println("ERROR: No existen oficinas para la region especificada.");
        }
    }

    public void imprimirOficinas(String region) {
        ArrayList<Oficina> listaOf = oficinas.get(region);
        if (listaOf != null && !listaOf.isEmpty()) {
            for (Oficina oficina : listaOf) {
                System.out.println("Region oficina : " + region);
                System.out.println("Comuna oficina : " + oficina.getComuna());
                System.out.println("Direccion Oficina : " + oficina.getDireccion() + "\n");
            }
        } else {
            System.out.println("ERROR: No existen oficinas para imprimir");
        }
    }
    /*
    public void imprimirPersonas(String rut) {
        SimpleDateFormat tipo = new SimpleDateFormat("dd-MM-yyyy");
        if (personas.containsKey(rut)) {
            Persona pp = personas.get(rut);
            System.out.println("Datos de la persona :\n");
            pp.mostrar();
            pp.mostrar(pp.getLugarNacimiento(), tipo);
            System.out.println("Estado civil : " + pp.getEstadoCivil());
        }
    }

    public void certNacimiento(String rut) {
        Persona pp = personas.get(rut);
        SimpleDateFormat tipo = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("==================================================");
        System.out.println("           CERTIFICADO DE NACIMIENTO              ");
        System.out.println("==================================================");
        pp.mostrar();
        pp.mostrar(pp.getLugarNacimiento(), tipo);
        System.out.println("--------------------------------------------------");
        System.out.println("Fecha de Emision: " + tipo.format(new Date()));
        System.out.println("==================================================");
        System.out.println("==================================================\n");
    }

    public boolean certMatrimonio(String rut) {
        Persona pp = personas.get(rut);
        String txt = pp.getEstadoCivil().toLowerCase();
        SimpleDateFormat tipo = new SimpleDateFormat("dd-MM-yyyy");
        if (!txt.equals("casado")) return false;
        System.out.println("==================================================");
        System.out.println("           CERTIFICADO DE MATRIMONIO              ");
        System.out.println("==================================================");
        System.out.println("Este es para certificar que :");
        System.out.println("El Sr./Sra. " + pp.getNombre() + " R.U.T " + pp.getRut());
        System.out.println("ha conciliado matrimonio con fecha " + tipo.format(pp.getFechaMatrimonio()));
        System.out.println("--------------------------------------------------");
        System.out.println("Fecha de Emision: " + tipo.format(new Date()));
        System.out.println("==================================================");
        System.out.println("==================================================\n");
        return true;
    }

    public boolean certDefuncion(String rut) {
        Persona pp = personas.get(rut);
        SimpleDateFormat tipo = new SimpleDateFormat("dd-MM-yyyy");
        if (pp.getFechaDefuncion() == null) return false;
        System.out.println("==================================================");
        System.out.println("           CERTIFICADO DE DEFUNCION               ");
        System.out.println("==================================================");
        System.out.println("Este es para certificar que :");
        System.out.println("El Sr./Sra. " + pp.getNombre() + " R.U.T " + pp.getRut());
        System.out.println("ha fallecido con fecha " + tipo.format(pp.getFechaDefuncion()));
        System.out.println("--------------------------------------------------");
        System.out.println("Fecha de Emision: " + tipo.format(new Date()));
        System.out.println("==================================================");
        System.out.println("==================================================\n");
        return true;
    }

    public boolean registrarDef(String rut, Date fecha) {
        Persona pp = personas.get(rut);
        SimpleDateFormat tipo = new SimpleDateFormat("dd-MM-yyyy");
        if (pp.getFechaDefuncion() != null) return false;
        pp.setFechaDefuncion(tipo.format(fecha));
        return true;
    }   
    */
}
