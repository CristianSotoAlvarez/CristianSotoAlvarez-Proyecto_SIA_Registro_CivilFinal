
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelos.Control_registroCivil;
import modelos.Persona;
import vistas.CertificadoDefuncion;
import vistas.CertificadoMatrimonio;
import vistas.CertificadoNacimiento;
import vistas.MenuView;

public class ControladorCertificado implements ActionListener{
    
    private Persona persona;
    private MenuView menu;
    private Control_registroCivil RC;
    

    public ControladorCertificado(Control_registroCivil RC, Persona pp, MenuView menu){
        this.persona = pp;
        this.menu = menu;
        this.RC = RC;
        
        this.menu.btn_generarCert.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == menu.btn_generarCert){
            //Verifico si los campos estan vacios
            if(menu.txt_cert_rut.getText().equals("") || menu.jcb_tipoCert.getSelectedItem().equals("Selecciona una opción.")){
                
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }else{
                persona = RC.buscarPersona(menu.txt_cert_rut.getText());
                
                
                if(persona != null){
                    
                    String item = (String)menu.jcb_tipoCert.getSelectedItem();
                    if(item.equals("Matrimonio") && !persona.getFechaMatrimonio().equals("")){
                        
                        CertificadoMatrimonio view = new CertificadoMatrimonio(persona);
                        view.setVisible(true);                                                           
                    }else if(item.equals("Defunción") && !persona.getFechaDefuncion().equals("")) {
                                
                        CertificadoDefuncion view = new CertificadoDefuncion(persona);
                        view.setVisible(true); 
                    }else if(item.equals("Nacimiento")){
                        
                        CertificadoNacimiento view = new CertificadoNacimiento(persona);
                        view.setVisible(true);                       
                    }else
                        JOptionPane.showMessageDialog(null, "El RUT ingresado no cumple con los requisitos para generar este certificado");
                    
                }else JOptionPane.showMessageDialog(null, "El RUT es invalido");
                
            }
        }
    }   
}
