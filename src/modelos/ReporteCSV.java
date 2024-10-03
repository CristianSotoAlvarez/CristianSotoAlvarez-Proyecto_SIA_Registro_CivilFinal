
package modelos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReporteCSV {

    private String reporte;

    public ReporteCSV(String reporte) {
        this.reporte = reporte;
    }

    public void crearReporte(ArrayList<Persona> personas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(reporte,true))) {
           
            for (Persona persona : personas) {
                writer.write(persona.toString());
                writer.newLine(); 
            }
        } catch (IOException e) {}
    }
}
