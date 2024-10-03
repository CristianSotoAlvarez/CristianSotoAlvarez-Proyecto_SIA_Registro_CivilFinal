
package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelos.Control_registroCivil;
import modelos.Oficina;
import vistas.menuView;


public class controladorOficina implements ActionListener{
    
    private Control_registroCivil RC;
    private Oficina oficina;
    private menuView menu;

    public controladorOficina(Control_registroCivil RC, Oficina oficina, menuView menu) {
        this.RC = RC;
        this.oficina = oficina;
        this.menu = menu;
        
        //Dejo el boton agregar en escucha
        menu.btn_ADDoficina.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == menu.btn_ADDoficina){
            //Verifico si los campos estan vacios
            if(menu.txt_id_off.getText().equals("") || menu.jcb_region_off.getSelectedItem().toString().equals("")
               || menu.txt_comuna_off.getText().equals("") || menu.txt_direc_off.getText().equals(""))
                
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");   
            else{
                oficina.setCodigoOficina(Integer.parseInt(menu.txt_id_off.getText().trim())); // trim para eliminar espacios vacios al principio y final de la cadena
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
    public void vaciarCajas_txt(){
        menu.txt_id_off.setText("");
        menu.txt_direc_off.setText("");
        menu.txt_comuna_off.setText("");
    }
}
