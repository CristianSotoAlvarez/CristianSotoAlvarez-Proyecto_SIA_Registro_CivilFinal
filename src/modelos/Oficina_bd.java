
package modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Oficina_bd {
    
    private String csv_off;

    public Oficina_bd() {
        this.csv_off = "src/recursos/oficinas.csv";
    }
    
    public ArrayList<Oficina> lectura(){
        
        String fila;
        ArrayList<Oficina> lista_off = new ArrayList(); 
        
        try (BufferedReader leer = new BufferedReader(new FileReader(csv_off))){
            
            while((fila = leer.readLine()) != null){

                Oficina off = new Oficina();
                String[] datos = fila.split(",");

                off.setCodigoOficina(datos[0]);
                off.setRegion(datos[1]);
                off.setComuna(datos[2]);
                off.setDireccion(datos[3]);
                lista_off.add(off);                        
            }  
        }catch (IOException e){JOptionPane.showMessageDialog(null, e.toString()); return null;}
        
       return lista_off;     
    } 
    
    public boolean escritura(Oficina off){

        try (BufferedWriter escribir = new BufferedWriter(new FileWriter(csv_off,true))) {
            escribir.newLine();
            escribir.write(off.toString());
        }catch (IOException e){return false;}

        return true;
    }    
}
