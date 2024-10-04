package modelos;

import excepciones.InvalidFutureDateException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import excepciones.InvalidRUTException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {
    private String rut;
    private String nombre;
    private String fechaNacimiento;
    private String fechaDefuncion;
    private String lugarNacimiento;
    private String estadoCivil;
    private String fechaMatrimonio; 
       
    public void validarFecha(String date, Date fechaActual) throws InvalidFutureDateException, ParseException {
        
        SimpleDateFormat tipo = new SimpleDateFormat("dd-MM-yyyy");
        tipo.setLenient(false);  // Asegura que la fecha se valide estrictamente
        
        Date newfecha = new Date();
        newfecha = tipo.parse(date.trim());
        
        // Si la fecha es futura, lanzamos la excepción personalizada
        if (newfecha.after(fechaActual)) {
            throw new InvalidFutureDateException();
        }
    }        
    
    public  boolean validaRUT(String RUT){
        Pattern pattern = Pattern.compile("^([0-9]{1,3})(\\.\\d{3}){2}\\-(\\d|k|K)$");
	Matcher matcher = pattern.matcher(RUT);
        if (matcher.matches()== false){return false;}
        String [] RUTSeparado = RUT.split("-");
        return RUTSeparado[1].toLowerCase().equals(Persona.validaDV(RUTSeparado[0]));
    } 
        
    public static String validaDV(String rut) {
        
        String rutSinPuntos = rut.replaceAll("\\.", "");

        // Convertir la parte numérica del RUT a un entero
        Integer M = 0, S = 1, T = Integer.parseInt(rutSinPuntos);

        // Algoritmo para calcular el dígito verificador
        for (; T != 0; T = (int) Math.floor(T /= 10)) {
            S = (S + T % 10 * (9 - M++ % 6)) % 11;
        }

        // Devolver el dígito verificador
        return (S > 0) ? String.valueOf(S - 1) : "k";
    }
    
    public void setRut(String rut) throws InvalidRUTException{
        if (!validaRUT(rut)){
            
            throw new InvalidRUTException();
        }
        this.rut = rut;        
    }   
    
    public void setNombre(String nombre) {this.nombre = nombre;}
    
    public void setLugarNacimiento(String lugarNacimiento) {this.lugarNacimiento = lugarNacimiento;}
    
    public void setEstadoCivil(String estadoCivil) {this.estadoCivil = estadoCivil;}

    public void setFechaNacimiento(String fechaNacimientoStr) throws InvalidFutureDateException, ParseException {
        Date fechaActual = new Date();
        validarFecha(fechaNacimientoStr, fechaActual);
        this.fechaNacimiento = fechaNacimientoStr.trim();
    }

    public void setFechaDefuncion(String fechaDefuncion) throws InvalidFutureDateException, ParseException{
        if(fechaDefuncion.equals("NR") || fechaDefuncion.equals("")){
            this.fechaDefuncion = "NR"; 
            return;
        }
        Date fechaActual = new Date();
        validarFecha(fechaDefuncion, fechaActual);
        this.fechaDefuncion = fechaDefuncion;
    }

    public void setFechaMatrimonio(String fechaMatrimonio) throws InvalidFutureDateException, ParseException {
        if(fechaMatrimonio.equals("") || fechaMatrimonio.equals("NR")){
            this.fechaMatrimonio = "NR"; 
            return;
        }
        Date fechaActual = new Date();
        validarFecha(fechaMatrimonio, fechaActual);
        this.fechaMatrimonio = fechaMatrimonio;
    }
  
    @Override
    public String toString() {
        return rut + "," + nombre + "," + fechaNacimiento + "," + fechaDefuncion + "," + lugarNacimiento + "," + estadoCivil + "," + fechaMatrimonio;
    }
    
    public String getRut() {return rut;}

    public String getNombre() {return nombre;}

    public String getFechaNacimiento() {return fechaNacimiento;}

    public String getEstadoCivil() {return estadoCivil;}

    public String getFechaDefuncion() {return fechaDefuncion;}

    public String getLugarNacimiento() {return lugarNacimiento;}

    public String getFechaMatrimonio() {return fechaMatrimonio;} 
}