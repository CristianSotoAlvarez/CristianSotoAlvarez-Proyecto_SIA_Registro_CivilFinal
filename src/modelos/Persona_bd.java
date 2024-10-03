
package modelos;

import excepciones.InvalidFutureDateException;
import excepciones.InvalidRUTException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Persona_bd {
    
    private String csv_pp;

    public Persona_bd() {
        this.csv_pp = "src/recursos/personas.csv";
    }
    
    public ArrayList<Persona> lectura(){
        
        String fila;
        ArrayList<Persona> lista_pp = new ArrayList(); 
        
        try (BufferedReader leer = new BufferedReader(new FileReader(csv_pp))){
                       
            while((fila = leer.readLine()) != null){

                Persona pp = new Persona();
                String[] datos = fila.split(",");

                pp.setRut(datos[0]);
                pp.setNombre(datos[1]);
                pp.setFechaNacimiento(datos[2]);
                pp.setFechaDefuncion(datos[3].replace("\"", ""));
                pp.setLugarNacimiento(datos[4]);
                pp.setEstadoCivil(datos[5]);
                pp.setFechaMatrimonio(datos[6].replace("\"", ""));
                lista_pp.add(pp);                        
            } 
        }catch (IOException e){JOptionPane.showMessageDialog(null, e.toString()); return null;
        }catch(InvalidRUTException ez){JOptionPane.showMessageDialog(null, ez.getMessage()); return null;        
        }catch(ParseException ez){JOptionPane.showMessageDialog(null, ez.getMessage()); return null;
        }catch(InvalidFutureDateException ez){JOptionPane.showMessageDialog(null, ez.getMessage()); return null;}  
        
        
       return lista_pp;     
    } 
    public boolean escritura(Persona pp){
    
        try (BufferedWriter escribir = new BufferedWriter(new FileWriter(csv_pp,true))) {
            escribir.newLine();
            escribir.write(pp.toString());
        }catch (IOException e){return false;}
        
        return true;
    } 
}
