
package modelos;

public class Persona {
    private String rut;
    private String nombre;
    private String fechaNacimiento;
    private String fechaDefuncion;
    private String lugarNacimiento;
    private String estadoCivil;
    private String fechaMatrimonio; 
    
    
    public void setRut(String rut) {this.rut = rut;}
    
    public void setNombre(String nombre) {this.nombre = nombre;}
    
    public void setLugarNacimiento(String lugarNacimiento) {this.lugarNacimiento = lugarNacimiento;}
    
    public void setEstadoCivil(String estadoCivil) {this.estadoCivil = estadoCivil;}
    
    public void setFechaDefuncion(String fechaDefuncion) {this.fechaDefuncion = fechaDefuncion;}
    
    public void setFechaMatrimonio(String fechaMatrimonio) {this.fechaMatrimonio = fechaMatrimonio;}
    
    public void setFechaNacimiento(String fechaNacimiento){ this.fechaNacimiento = fechaNacimiento;} 

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