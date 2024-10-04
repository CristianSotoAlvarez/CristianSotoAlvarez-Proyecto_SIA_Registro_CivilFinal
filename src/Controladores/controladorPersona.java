
package controladores;

import excepciones.InvalidFutureDateException;
import excepciones.InvalidRUTException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Control_registroCivil;
import modelos.Persona;
import vistas.MenuView;

public class ControladorPersona implements ActionListener, KeyListener, MouseListener{
    
    private Persona persona;
    private MenuView menu;
    private Control_registroCivil RC;
    DefaultTableModel model = new DefaultTableModel();
    
    public ControladorPersona(Control_registroCivil RC, Persona persona, MenuView menu) {
        this.RC = RC;
        this.persona = persona;
        this.menu = menu;
        
        //Dejo en escucha los botones
        this.menu.btn_ADDPersona.addActionListener(this);
        this.menu.btn_registrar_def.addActionListener(this);
        this.menu.btn_persona_mod.addActionListener(this);
        this.menu.btn_persona_del.addActionListener(this);
        this.menu.btn_search_dif.addActionListener(this);
        this.menu.btn_reporte.addActionListener(this);
        this.menu.btn_guardar.addMouseListener(this);
       
        //Dejo los text f. en escucha
        this.menu.txt_rut_search.addKeyListener(this);
        this.menu.txt_year_searchDif.addKeyListener(this);
        this.menu.txt_rut_mod.addKeyListener(this);
        this.menu.txt_rut_del.addKeyListener(this);
        
        //Dejo el combo box en escucha
        this.menu.jcb_eCivil.addActionListener(this);
        
        
        
        //Dejo el boton mostrar en escucha
        this.menu.btn_mostrar.addMouseListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
                   
        if(e.getSource() == menu.jcb_eCivil){
            
            String item_jcb = (String) menu.jcb_eCivil.getSelectedItem(); 
            if(item_jcb.equals("Casado/a") || item_jcb.equals("Viudo/a"))       
                menu.txt_dateMatrimonio.setEnabled(true);
            else menu.txt_dateMatrimonio.setEnabled(false);
        }
        
        if(e.getSource() == menu.btn_ADDPersona){
            //Verifico si los campos estan vaios
            if(menu.txt_rut.getText().equals("") || menu.txt_name.getText().equals("") || menu.txt_dateNacimiento.getText().equals("")
               || menu.txt_lugNacimiento.getText().equals("") || ((String)menu.jcb_eCivil.getSelectedItem()).equals("Seleccione una opción.")){ 

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }else{                
                if(menu.jcb_eCivil.getSelectedItem().equals("Casado/a") || menu.jcb_eCivil.getSelectedItem().equals("Viudo/a")){
                    if(menu.txt_dateMatrimonio.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "La fecha de matrimonio no puede estar vacia"); return;
                    }
                }       
                try{
                    persona.setRut(menu.txt_rut.getText().trim()); //El metodo trim para eliminar espacios al principio y final de la cadena             
                    persona.setFechaNacimiento(menu.txt_dateNacimiento.getText().trim());
                    persona.setFechaMatrimonio(menu.txt_dateMatrimonio.getText().trim());
                    persona.setFechaDefuncion("");

                }catch(ParseException ez){JOptionPane.showMessageDialog(null, "El formato de la fecha es invalido"); return;   
                }catch(InvalidFutureDateException ez){JOptionPane.showMessageDialog(null, ez.getMessage());return;
                }catch(InvalidRUTException ez){JOptionPane.showMessageDialog(null, ez.getMessage()); return;}



                persona.setNombre(menu.txt_name.getText().trim());
                persona.setLugarNacimiento(menu.txt_lugNacimiento.getText().trim());
                persona.setEstadoCivil(menu.jcb_eCivil.getSelectedItem().toString().trim());
                
                if(RC.addPersona(persona)){
                    vaciarCajas_agregar();
                    JOptionPane.showMessageDialog(null, "Persona registrada con éxito.");
                    persona = new Persona();
                }else{
                    JOptionPane.showMessageDialog(null, "El RUT ya se encuentra inscrito.");
                }                    
            }           
        }else if(e.getSource() == menu.btn_registrar_def){
            //Valido si los campos estan vacios
            if(menu.txt_rut_def.getText().equals("") || menu.txt_date_def.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            }else{

                Persona pp = RC.buscarPersona(menu.txt_rut_def.getText().trim());
                if(pp != null){
                    try{
                        pp.setFechaDefuncion(menu.txt_date_def.getText().trim());
                    
                    }catch(ParseException ez){JOptionPane.showMessageDialog(null, "El formato de la fecha es invalido."); return;   
                    }catch(InvalidFutureDateException ez) {JOptionPane.showMessageDialog(null, ez.getMessage()); return;}       
                    vaciarCajas_defuncion();
                    JOptionPane.showMessageDialog(null, "Registro exitoso."); 
                }else JOptionPane.showMessageDialog(null, "El RUT es invalido.");
            }
        }else if(e.getSource() == menu.btn_persona_mod){
            if(menu.txt_rut_mod.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar el RUT de la persona a modificar");
            }else{
                Persona pp = RC.buscarPersona(menu.txt_rut_mod.getText().trim());
                if(pp != null){
                    
                    pp.setNombre(menu.txt_name_mod.getText());
                    pp.setLugarNacimiento(menu.txt_lugarNaci_mod.getText());
                    vaciarCajas_modificar();
                    JOptionPane.showMessageDialog(null, "Datos modificados con éxito.");
                }
            }
        }else if (e.getSource() == menu.btn_persona_del){
            if(menu.txt_rut_del.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar el RUT de la persona a eliminar.");
            }else{
                if (RC.removePersona(menu.txt_rut_del.getText())){
                    JOptionPane.showMessageDialog(null, "Persona eliminada de forma exitosa.");
                    vaciarCajas_eliminar();
                }else{
                    JOptionPane.showMessageDialog(null, "La persona no existe.");
                }
            }
        }else if(e.getSource() == menu.btn_search_dif){
            
            limpiarTablaDefunciones();
            listarDifuntos();
            
        }else if(e.getSource() == menu.btn_reporte){
            RC.generarReportePorAnio(menu.txt_year_searchDif.getText().trim());
            JOptionPane.showMessageDialog(null, "Reporte generado con éxito.");
        }
              
    }
    
    public void listarTodaPersona(){
        
        ArrayList<Persona> lista_pp = RC.listar_personas(menu.txt_rut_search.getText().trim());
        model = (DefaultTableModel) menu.table_persona.getModel();
        Object[] row = new Object[5];
        
        for(int i = 0; i < lista_pp.size(); i++){
            row[0] = lista_pp.get(i).getRut();
            row[1] = lista_pp.get(i).getNombre();
            row[2] = lista_pp.get(i).getFechaNacimiento();
            row[3] = lista_pp.get(i).getLugarNacimiento();
            row[4] = lista_pp.get(i).getEstadoCivil();
            model.addRow(row);
        }      
    }   
    
    public void listarDifuntos(){
    
        ArrayList<Persona> lista_pp = RC.listar_personas_difuntas(menu.txt_year_searchDif.getText().trim());
        model = (DefaultTableModel) menu.table_personaDif.getModel();        
        Object[] row = new Object[5];
        
        for(int i = 0; i < lista_pp.size(); i++){
            row[0] = lista_pp.get(i).getRut();
            row[1] = lista_pp.get(i).getNombre();
            row[2] = lista_pp.get(i).getFechaNacimiento();
            row[3] = lista_pp.get(i).getLugarNacimiento();
            row[4] = lista_pp.get(i).getFechaDefuncion();
            model.addRow(row);
        } 
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == menu.txt_rut_search){
            limpiarTablaSearchPersonas();
            listarTodaPersona();
            
        }else if(e.getSource() == menu.txt_rut_mod){

            Persona pp = RC.buscarPersona(menu.txt_rut_mod.getText());
            
            if(pp != null){
                menu.txt_name_mod.setText(pp.getNombre());
                menu.txt_dateNaci_mod.setText(pp.getFechaNacimiento());
                menu.txt_lugarNaci_mod.setText(pp.getLugarNacimiento());
                menu.jcb_eCivil_mod.setSelectedItem(pp.getEstadoCivil());
                menu.txt_dateMatrimonio_mod.setText(pp.getFechaMatrimonio());
                
                menu.txt_name_mod.setEditable(true);
                menu.txt_lugarNaci_mod.setEditable(true);
            }
        }else if (e.getSource() == menu.txt_rut_del){
            Persona pp = RC.buscarPersona(menu.txt_rut_del.getText());
            if (pp != null){
                menu.txt_name_del.setText(pp.getNombre());
                menu.txt_dateNaci_del.setText(pp.getFechaNacimiento());
                menu.txt_lugarNaci_del.setText(pp.getLugarNacimiento());
                menu.txt_eCivil_del.setText(pp.getEstadoCivil());
                
            }
        }
    }   
    //Limpieza
    
    public void vaciarCajas_agregar(){
        menu.txt_rut.setText("");
        menu.txt_name.setText("");
        menu.txt_dateNacimiento.setText("");
        menu.txt_lugNacimiento.setText("");
        menu.txt_dateMatrimonio.setText("");
        menu.jcb_eCivil.setSelectedItem("Slecciona una opción");
    }
    
    public void vaciarCajas_defuncion(){
        menu.txt_rut_def.setText("");
        menu.txt_date_def.setText("");
    }
    
    public void vaciarCajas_modificar(){
        menu.txt_rut_mod.setText("");
        menu.txt_name_mod.setText("");
        menu.txt_dateNaci_mod.setText("");
        menu.txt_lugarNaci_mod.setText("");
        menu.txt_dateMatrimonio_mod.setText("");
        menu.jcb_eCivil_mod.setSelectedIndex(0);
    }
       public void vaciarCajas_eliminar(){
        menu.txt_rut_del.setText("");
        menu.txt_name_del.setText("");
        menu.txt_dateNaci_del.setText("");
        menu.txt_lugarNaci_del.setText("");
        menu.txt_eCivil_del.setText("");
    }
    
    public void limpiarTablaSearchPersonas() {
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i); 
        }
    }
     public void limpiarTablaDefunciones() {
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i); 
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == menu.btn_mostrar){
            limpiarTablaSearchPersonas();
            listarTodaPersona();
        }else if(e.getSource() == menu.btn_guardar){    
            RC.actualizarPersona();
            JOptionPane.showMessageDialog(null, "CSV modificado con éxito.");
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
