
package modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Persona_bd {
    
    private String csv_pp;

    public Persona_bd() {
        this.csv_pp = "src/recursos/personas.csv";
    }
    
    public ArrayList<Persona> lectura() throws IOException{
        
        String fila;
        ArrayList<Persona> lista_pp = new ArrayList(); 
        
        try (BufferedReader leer = new BufferedReader(new FileReader(csv_pp))){
        
            while((fila = leer.readLine()) != null){
                
                String[] datos = fila.split(",");
                Persona pp = new Persona();
                
                pp.setRut(datos[0]);
                pp.setNombre(datos[1]);
                pp.setFechaNacimiento(datos[2]);
                pp.setFechaDefuncion(datos[3]);
                pp.setEstadoCivil(datos[5]);
                pp.setFechaMatrimonio(datos[6]);
                lista_pp.add(pp);                        
            }
        }catch (IOException e){JOptionPane.showMessageDialog(null, e.toString()); return null;}
        
       return lista_pp;     
    }   
    
    public boolean escribir(Persona pp) throws IOException{
    
        try (BufferedWriter escribir = new BufferedWriter(new FileWriter(csv_pp,true))) {
            escribir.newLine();
            escribir.write(pp.toString());
        }catch (IOException e){return false;}
        
        return true;
    } 
}
