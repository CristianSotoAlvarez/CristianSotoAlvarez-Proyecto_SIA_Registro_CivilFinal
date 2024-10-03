
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Control_registroCivil;
import modelos.Oficina;
import vistas.MenuView;


public class ControladorOficina implements ActionListener, KeyListener{
    
    private Control_registroCivil RC;
    private Oficina oficina;
    private MenuView menu;
    DefaultTableModel model = new DefaultTableModel();

    public ControladorOficina(Control_registroCivil RC, Oficina oficina, MenuView menu) {
        this.RC = RC;
        this.oficina = oficina;
        this.menu = menu;
        
        //Dejo en escucha el boton agregar
        this.menu.btn_ADDoficina.addActionListener(this);
        
        //Dejo text de busqueda en escucha
        this.menu.txt_oficina_search.addKeyListener(this);
        listarTodaOficina();
    }
 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == menu.btn_ADDoficina){
            //Verifico si los campos estan vacios
            if(menu.txt_id_off.getText().equals("") || ((String)menu.jcb_region_off.getSelectedItem()).equals("Seleccione una opción.")
               || menu.txt_comuna_off.getText().equals("") || menu.txt_direc_off.getText().equals(""))
                
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");   
            else{
                oficina.setCodigoOficina(menu.txt_id_off.getText().trim()); // trim para eliminar espacios vacios al principio y final de la cadena
                oficina.setComuna(menu.txt_comuna_off.getText().trim());
                oficina.setDireccion(menu.txt_direc_off.getText().trim());
                oficina.setRegion(menu.jcb_region_off.getSelectedItem().toString().trim());
                
                if(RC.addOficina(oficina)){                   
                    vaciarCajas_txt();
                    JOptionPane.showMessageDialog(null, "Oficina registrada con éxito"); 
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar la oficina");
                }
            }
        }   
    }
    
    public void listarTodaOficina(){
        
        ArrayList<Oficina> lista_off = RC.listar_oficinas(menu.txt_oficina_search.getText());
        model = (DefaultTableModel) menu.table_oficina.getModel();
        Object[] row = new Object[5];
        
        for(int i = 0; i < lista_off.size(); i++){
            row[0] = lista_off.get(i).getCodigoOficina();
            row[1] = lista_off.get(i).getRegion();
            row[2] = lista_off.get(i).getComuna();
            row[3] = lista_off.get(i).getDireccion();
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
        if(e.getSource() == menu.txt_oficina_search){
            limpiarTabla();
            listarTodaOficina();
        }
    }
    //Limpieza
    public void vaciarCajas_txt(){
        menu.txt_id_off.setText("");
        menu.txt_direc_off.setText("");
        menu.txt_comuna_off.setText("");
    }
    
    public void limpiarTabla(){
        for (int i = model.getRowCount() - 1; i >= 0; i--){
            model.removeRow(i); 
        }
    }  
}
