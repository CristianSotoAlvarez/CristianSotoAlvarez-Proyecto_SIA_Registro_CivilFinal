
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Control_registroCivil;
import modelos.Oficina;
import vistas.MenuView;


public class ControladorOficina implements ActionListener, KeyListener, MouseListener{
    
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
        
        //Dejo en escucha el boton modificar
        this.menu.btn_oficina_mod.addActionListener(this);
        
        //Dejo text de busqueda en escucha
        this.menu.txt_oficina_search.addKeyListener(this);
        
        //Dejo en escucha el boton de mostrar
        this.menu.btn_mostrar.addMouseListener(this);
        
        //Dejo en escucha el boton de eliminar
        this.menu.btn_oficina_del.addActionListener(this);
        
        //Dejo en escucha el text de busqueda para eliminar la oficina
        this.menu.txt_idOff_del.addKeyListener(this);
        
        //Dejo texto en escucha
        this.menu.txt_idOff_mod.addKeyListener(this);
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
                    oficina = new Oficina();
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar la oficina");
                }
            }
        }else if(e.getSource() == menu.btn_oficina_mod){
            if(menu.txt_idOff_mod.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar el ID de la oficina a modificar");
            }else{
                Oficina off = RC.buscarOficina(menu.txt_idOff_mod.getText().trim());
                if(off != null){
                    
                    off.setRegion(((String)menu.jcb_region_mod.getSelectedItem()));
                    off.setComuna(menu.txt_comunaOff_mod.getText());
                    off.setDireccion(menu.txt_direcOff_mod.getText());
                    vaciarCajas_modificar();
                    menu.txt_idOff_mod.setText("");
                    JOptionPane.showMessageDialog(null, "Datos modificados con éxito.");
                }
            }
        }else if (e.getSource()== menu.btn_oficina_del){
            if(menu.txt_idOff_del.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar el ID de la oficina a eliminar");
            }else{
                if(RC.removeOficina(menu.txt_idOff_del.getText().trim())){
                    JOptionPane.showMessageDialog(null, "Oficina eliminada de forma exitosa.");
                    vaciarCajas_eliminar();
                }else{
                    JOptionPane.showMessageDialog(null, "Oficina inexsistente u/o invalida.");
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
        }else if(e.getSource() == menu.txt_idOff_mod){
            vaciarCajas_modificar();
            Oficina off = RC.buscarOficina(menu.txt_idOff_mod.getText());
            
            if(off != null){
                menu.txt_direcOff_mod.setText(off.getDireccion());
                menu.txt_comunaOff_mod.setText(off.getComuna());
                menu.jcb_region_mod.setSelectedItem(off.getRegion());
                
                menu.txt_direcOff_mod.setEditable(true);
                menu.jcb_region_mod.setEnabled(true);
                menu.txt_comunaOff_mod.setEditable(true);
            }
        }else if (e.getSource() == menu.txt_idOff_del){
            Oficina off = RC.buscarOficina(menu.txt_idOff_del.getText());
            if (off != null){
                menu.txt_direcOff_del.setText(off.getDireccion());
                menu.txt_comunaOff_del.setText(off.getComuna());
                menu.txt_regionOff_del.setText(off.getRegion());
                
            }
                    
               

        }
    }
    
    //Limpieza
    
    public void vaciarCajas_modificar(){
        menu.txt_id_off.setText("");
        menu.txt_direc_off.setText("");
        menu.txt_comuna_off.setText("");
        menu.jcb_region_mod.setSelectedIndex(-1);
    }
    
        public void vaciarCajas_eliminar(){
        menu.txt_idOff_del.setText("");
        menu.txt_direcOff_del.setText("");
        menu.txt_comunaOff_del.setText("");
        menu.txt_regionOff_del.setText("");
    }
    
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

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == menu.btn_mostrar){
            limpiarTabla();
            listarTodaOficina();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
