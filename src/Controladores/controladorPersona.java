
package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelos.Persona;
import modelos.Persona_bd;
import vistas.menuView;

public class controladorPersona implements ActionListener{
    
    private Persona_bd bd_pp;
    private Persona persona;
    private menuView menu;

    public controladorPersona(Persona_bd bd_pp, Persona persona, menuView menu) {
        this.bd_pp = bd_pp;
        this.persona = persona;
        this.menu = menu;
        
        //Dejar en escucha al boton agregar
        this.menu.btn_ADDPersona.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        SimpleDateFormat tipo = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaActual = new Date();
        tipo.setLenient(false);
        
        if(e.getSource() == menu.btn_ADDPersona){
            //Verifico si los campos estan vaios
            if(menu.txt_rut.getText().equals("") || menu.txt_name.getText().equals("") || menu.txt_dateNacimiento.getText().equals("")
               || menu.txt_lugNacimiento.getText().equals("") || menu.jcb_eCivil.getSelectedItem().toString().equals("")){
            
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }else{
                persona.setRut(menu.txt_rut.getText().trim()); //El metodo trim para eliminar espacios al principio y final de la cadena
                persona.setNombre(menu.txt_name.getText().trim());
                
                try{
                    Date fechaNacimiento = tipo.parse(menu.txt_dateNacimiento.getText().trim());
                    
                    if (fechaNacimiento.after(fechaActual)){ JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser futura"); return;}
                    else persona.setFechaNacimiento(menu.txt_dateNacimiento.getText().trim());
                    
                }catch(ParseException ez){JOptionPane.showMessageDialog(null, "El formato de la fecha es invalido"); return;}
                             
                persona.setLugarNacimiento(menu.txt_lugNacimiento.getText().trim());
                persona.setEstadoCivil(menu.jcb_eCivil.getSelectedItem().toString().trim());
                
                try {
                    if(bd_pp.escribir(persona)){
                        vaciarCajas_txt();
                        JOptionPane.showMessageDialog(null, "Persona registrada con éxito");
                    }
                } catch (IOException ee) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar la persona");
                }
            }
            
        }
    }
    
    public void vaciarCajas_txt(){
        menu.txt_rut.setText("");
        menu.txt_name.setText("");
        menu.txt_dateNacimiento.setText("");
        menu.txt_lugNacimiento.setText("");
    }
}
