
package modelos;

public class Oficina {
    private String codigoOficina;
    private String region;
    private String comuna;
    private String direccion;
    
    
    
    public void setRegion(String region) {this.region = region;}
    
    public void setComuna(String comuna) {this.comuna = comuna;}
    
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public void setCodigoOficina(String codigoOficina) { this.codigoOficina = codigoOficina;}

    
    public String getRegion() {return region;}
    
    public String getComuna() {return comuna;}

    public String getDireccion() {return direccion;} 

    public String getCodigoOficina() { return codigoOficina;}

    @Override
    public String toString() {
        return codigoOficina + "," + region + "," + comuna + "," + direccion;
    }
}
