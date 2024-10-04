
package vistas;

import controladores.ControladorCertificado;
import controladores.ControladorOficina;
import controladores.ControladorPersona;
import modelos.Control_registroCivil;
import modelos.Oficina;
import modelos.Persona;

public class MenuView extends javax.swing.JFrame {
    // Modelos
    private Control_registroCivil RC = new Control_registroCivil();
    private Persona persona = new Persona();
    private Oficina oficina = new Oficina();
    
    public MenuView() {
        initComponents();
        this.setSize(1110, 685);
        this.setResizable(false);
        this.setTitle("Registro civil");
        this.setLocationRelativeTo(null);
        this.repaint();
        
        //Controladores
        ControladorPersona controller_pp = new ControladorPersona(RC, persona, this);
        ControladorOficina controller_off = new ControladorOficina(RC, oficina, this);
        ControladorCertificado controller_cert = new ControladorCertificado(RC, persona, this);
        
        // Oculto todos los Tabbed Pane
        ocultarTBs();
        
        // Opciones segun contexto para los txt y jCombos
        txt_dateMatrimonio.setEnabled(false);
        txt_name_mod.setEditable(false);
        jcb_eCivil_mod.setEnabled(false);
        txt_dateNaci_mod.setEditable(false);
        txt_lugarNaci_mod.setEditable(false);
        txt_dateMatrimonio_mod.setEditable(false);
        
        txt_name_del.setEditable(false);
        txt_eCivil_del.setEditable(false);
        txt_dateNaci_del.setEditable(false);
        txt_lugarNaci_del.setEditable(false);
        
        txt_direcOff_mod.setEditable(false);
        txt_comunaOff_mod.setEditable(false);
        jcb_region_mod.setEnabled(false);
        
        txt_direcOff_del.setEditable(false);
        txt_comunaOff_del.setEditable(false);
        txt_regionOff_del.setEditable(false);
        
        jcb_eCivil_mod.setSelectedIndex(0);
    }
    
    public void ocultarTBs(){       
        TB_agregar.setVisible(false);
        TB_mostrar.setVisible(false);
        TB_certificados.setVisible(false);
        TB_defunciones.setVisible(false);
        TB_modificar.setVisible(false);
        TB_eliminar.setVisible(false);
        TB_funcionalidades.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fondo = new javax.swing.JPanel();
        pnl_titulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        pnl_opciones = new javax.swing.JPanel();
        btn_Agregar = new javax.swing.JButton();
        btn_mostrar = new javax.swing.JButton();
        btn_certificados = new javax.swing.JButton();
        btn_defunciones = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_funcionalidades = new javax.swing.JButton();
        pnl_logo = new javax.swing.JPanel();
        jlabel1 = new javax.swing.JLabel();
        pnl_azul = new javax.swing.JPanel();
        pnl_rojo = new javax.swing.JPanel();
        pnl_TBs = new javax.swing.JPanel();
        TB_agregar = new javax.swing.JTabbedPane();
        pnl_ADDpersona = new javax.swing.JPanel();
        jLabel_1 = new javax.swing.JLabel();
        jLabel_2 = new javax.swing.JLabel();
        jLabel_3 = new javax.swing.JLabel();
        jLabel_4 = new javax.swing.JLabel();
        jLabel_5 = new javax.swing.JLabel();
        jLabel_6 = new javax.swing.JLabel();
        jLabel_7 = new javax.swing.JLabel();
        txt_rut = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_dateNacimiento = new javax.swing.JTextField();
        jcb_eCivil = new javax.swing.JComboBox<>();
        txt_lugNacimiento = new javax.swing.JTextField();
        btn_ADDPersona = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_dateMatrimonio = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        pnl_ADDoficina = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_id_off = new javax.swing.JTextField();
        txt_comuna_off = new javax.swing.JTextField();
        txt_direc_off = new javax.swing.JTextField();
        jcb_region_off = new javax.swing.JComboBox<>();
        btn_ADDoficina = new javax.swing.JButton();
        TB_mostrar = new javax.swing.JTabbedPane();
        pnl_MTpersona = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_rut_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_persona = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pnl_MToficina = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_oficina_search = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_oficina = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        TB_certificados = new javax.swing.JTabbedPane();
        pnl_certif = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_cert_rut = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jcb_tipoCert = new javax.swing.JComboBox<>();
        btn_generarCert = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        TB_defunciones = new javax.swing.JTabbedPane();
        pnl_registro_def = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_rut_def = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_date_def = new javax.swing.JTextField();
        btn_registrar_def = new javax.swing.JButton();
        TB_modificar = new javax.swing.JTabbedPane();
        pnl_MODpersona = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_rut_mod = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_name_mod = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_dateNaci_mod = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_lugarNaci_mod = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jcb_eCivil_mod = new javax.swing.JComboBox<>();
        btn_persona_mod = new javax.swing.JButton();
        txt_dateMatrimonio_mod = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        pnl_MODoficina = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txt_idOff_mod = new javax.swing.JTextField();
        txt_comunaOff_mod = new javax.swing.JTextField();
        txt_direcOff_mod = new javax.swing.JTextField();
        jcb_region_mod = new javax.swing.JComboBox<>();
        btn_oficina_mod = new javax.swing.JButton();
        TB_eliminar = new javax.swing.JTabbedPane();
        pnl_DELpersona = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_rut_del = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt_name_del = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txt_dateNaci_del = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txt_eCivil_del = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        btn_persona_del = new javax.swing.JButton();
        txt_lugarNaci_del = new javax.swing.JTextField();
        pnl_DELoficina = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txt_idOff_del = new javax.swing.JTextField();
        txt_comunaOff_del = new javax.swing.JTextField();
        txt_direcOff_del = new javax.swing.JTextField();
        btn_oficina_del = new javax.swing.JButton();
        txt_regionOff_del = new javax.swing.JTextField();
        TB_funcionalidades = new javax.swing.JTabbedPane();
        pnl_MODoficina1 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txt_year_searchDif = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_personaDif = new javax.swing.JTable();
        btn_search_dif = new javax.swing.JButton();
        btn_reporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_fondo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_titulo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_titulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registro Civil");
        pnl_titulo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 510, 110));

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_titulo.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText(" Guardar");
        pnl_titulo.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, -1));

        pnl_fondo.add(pnl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 870, 110));

        pnl_opciones.setBackground(new java.awt.Color(204, 204, 204));
        pnl_opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Agregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btn_Agregar.setText("  Agregar");
        btn_Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarMouseClicked(evt);
            }
        });
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        pnl_opciones.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 40));

        btn_mostrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrar.png"))); // NOI18N
        btn_mostrar.setText("  Mostrar");
        btn_mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mostrar.setMaximumSize(new java.awt.Dimension(99, 23));
        btn_mostrar.setMinimumSize(new java.awt.Dimension(99, 23));
        btn_mostrar.setPreferredSize(new java.awt.Dimension(99, 23));
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });
        pnl_opciones.add(btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 170, 40));

        btn_certificados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_certificados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        btn_certificados.setText(" Certificados");
        btn_certificados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_certificados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_certificadosActionPerformed(evt);
            }
        });
        pnl_opciones.add(btn_certificados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 170, 40));

        btn_defunciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_defunciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/defunción.png"))); // NOI18N
        btn_defunciones.setText(" Defunciones");
        btn_defunciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_defunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_defuncionesActionPerformed(evt);
            }
        });
        pnl_opciones.add(btn_defunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 170, 40));

        btn_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btn_modificar.setText("  Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        pnl_opciones.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 170, 40));

        btn_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btn_eliminar.setText(" Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        pnl_opciones.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 170, 40));

        btn_funcionalidades.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_funcionalidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/funcionalidades.png"))); // NOI18N
        btn_funcionalidades.setText("Funcionalidades");
        btn_funcionalidades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_funcionalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_funcionalidadesActionPerformed(evt);
            }
        });
        pnl_opciones.add(btn_funcionalidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 170, 40));

        pnl_fondo.add(pnl_opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 520));

        pnl_logo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconChile.png"))); // NOI18N
        pnl_logo.add(jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, 120));

        pnl_fondo.add(pnl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 110));

        pnl_azul.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout pnl_azulLayout = new javax.swing.GroupLayout(pnl_azul);
        pnl_azul.setLayout(pnl_azulLayout);
        pnl_azulLayout.setHorizontalGroup(
            pnl_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        pnl_azulLayout.setVerticalGroup(
            pnl_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        pnl_fondo.add(pnl_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 450, 20));

        pnl_rojo.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout pnl_rojoLayout = new javax.swing.GroupLayout(pnl_rojo);
        pnl_rojo.setLayout(pnl_rojoLayout);
        pnl_rojoLayout.setHorizontalGroup(
            pnl_rojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pnl_rojoLayout.setVerticalGroup(
            pnl_rojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        pnl_fondo.add(pnl_rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 660, 20));

        pnl_TBs.setBackground(new java.awt.Color(255, 255, 255));
        pnl_TBs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_ADDpersona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_1.setText("Ingresa los datos de la persona :");
        pnl_ADDpersona.add(jLabel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel_2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_2.setText("RUT : ");
        pnl_ADDpersona.add(jLabel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel_3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_3.setText("Nombre completo :");
        pnl_ADDpersona.add(jLabel_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel_4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_4.setText("Fecha de nacimiento :");
        pnl_ADDpersona.add(jLabel_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel_5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_5.setText("(formato dd-mm-yyyy)");
        pnl_ADDpersona.add(jLabel_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel_6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_6.setText("Lugar de nacimiento :");
        pnl_ADDpersona.add(jLabel_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel_7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_7.setText("Estado civil :");
        pnl_ADDpersona.add(jLabel_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        pnl_ADDpersona.add(txt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 90, -1));
        pnl_ADDpersona.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 280, -1));
        pnl_ADDpersona.add(txt_dateNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 80, -1));

        jcb_eCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción.", "Casado/a", "Soltero/a", "Viudo/a", "Divorciado/a", "Separado/a", "Conviviente" }));
        jcb_eCivil.setToolTipText("");
        jcb_eCivil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcb_eCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_eCivilActionPerformed(evt);
            }
        });
        pnl_ADDpersona.add(jcb_eCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        txt_lugNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lugNacimientoActionPerformed(evt);
            }
        });
        pnl_ADDpersona.add(txt_lugNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, -1));

        btn_ADDPersona.setText("Agregar");
        btn_ADDPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ADDPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ADDPersonaActionPerformed(evt);
            }
        });
        pnl_ADDpersona.add(btn_ADDPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Fecha de matrimonio :");
        pnl_ADDpersona.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        txt_dateMatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dateMatrimonioActionPerformed(evt);
            }
        });
        pnl_ADDpersona.add(txt_dateMatrimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 80, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("(con puntos y guion)");
        pnl_ADDpersona.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        TB_agregar.addTab("Persona", pnl_ADDpersona);

        pnl_ADDoficina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Ingresa los datos de la oficina :");
        pnl_ADDoficina.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Identificador : ");
        pnl_ADDoficina.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Región : ");
        pnl_ADDoficina.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Comuna :");
        pnl_ADDoficina.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Dirección :");
        pnl_ADDoficina.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txt_id_off.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_ADDoficina.add(txt_id_off, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 120, -1));
        pnl_ADDoficina.add(txt_comuna_off, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 160, -1));
        pnl_ADDoficina.add(txt_direc_off, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 230, -1));

        jcb_region_off.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción.", "Región de Arica y Parinacota", "Región de Tarapacá", "Región de Antofagasta", "Región de Atacama", "Región de Coquimbo", "Región de Valparaíso", "Región Metropolitana", "Región del Libertador General Bernardo O’Higgins", "Región del Maule", "Región de Ñuble", "Región del Biobío", "Región de La Araucanía", "Región de Los Ríos", "Región de Los Lagos", "Región de Aysén del General Carlos Ibáñez del Campo", "Región de Magallanes y de la Antártica Chilena" }));
        jcb_region_off.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcb_region_off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_region_offActionPerformed(evt);
            }
        });
        pnl_ADDoficina.add(jcb_region_off, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        btn_ADDoficina.setText("Agregar");
        btn_ADDoficina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_ADDoficina.add(btn_ADDoficina, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 80, 30));

        TB_agregar.addTab("Oficina", pnl_ADDoficina);

        pnl_TBs.add(TB_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        pnl_MTpersona.setPreferredSize(new java.awt.Dimension(940, 400));
        pnl_MTpersona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Busqueda de personas");
        pnl_MTpersona.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("RUT : ");
        pnl_MTpersona.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        pnl_MTpersona.add(txt_rut_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 100, -1));

        table_persona.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table_persona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUT", "Nombre Completo", "Fecha Nacimiento", "Lugar Nacimiento", "Estado Civil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_persona);

        pnl_MTpersona.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 700, 180));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Resultado de la busqueda : ");
        pnl_MTpersona.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("(con puntos y guion)");
        pnl_MTpersona.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        TB_mostrar.addTab("Persona", pnl_MTpersona);

        pnl_MToficina.setPreferredSize(new java.awt.Dimension(940, 400));
        pnl_MToficina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Busqueda de oficinas");
        pnl_MToficina.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("ID :");
        pnl_MToficina.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        pnl_MToficina.add(txt_oficina_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 100, -1));

        table_oficina.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table_oficina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Región", "Comuna", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_oficina);

        pnl_MToficina.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 700, 180));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Resultado de la busqueda : ");
        pnl_MToficina.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        TB_mostrar.addTab("Oficina", pnl_MToficina);

        pnl_TBs.add(TB_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        pnl_certif.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Solicita tu certificado");
        pnl_certif.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("RUT :");
        pnl_certif.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txt_cert_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cert_rutActionPerformed(evt);
            }
        });
        pnl_certif.add(txt_cert_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 100, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Tipo de certificado :");
        pnl_certif.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jcb_tipoCert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción.", "Matrimonio", "Nacimiento", "Defunción" }));
        jcb_tipoCert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_certif.add(jcb_tipoCert, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        btn_generarCert.setText("Generar");
        btn_generarCert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_certif.add(btn_generarCert, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 80, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("(con puntos y guion)");
        pnl_certif.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        TB_certificados.addTab("Certificados", pnl_certif);

        pnl_TBs.add(TB_certificados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        pnl_registro_def.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Registrar defunción");
        pnl_registro_def.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("RUT difunto :");
        pnl_registro_def.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        pnl_registro_def.add(txt_rut_def, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 110, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Fecha de defunción :");
        pnl_registro_def.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));
        pnl_registro_def.add(txt_date_def, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 90, -1));

        btn_registrar_def.setText("Registrar");
        btn_registrar_def.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_registro_def.add(btn_registrar_def, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 100, 30));

        TB_defunciones.addTab("Defunciones", pnl_registro_def);

        pnl_TBs.add(TB_defunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        pnl_MODpersona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Modifica los datos de la persona");
        pnl_MODpersona.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("RUT :");
        pnl_MODpersona.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txt_rut_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rut_modActionPerformed(evt);
            }
        });
        pnl_MODpersona.add(txt_rut_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 90, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Nombre completo :");
        pnl_MODpersona.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        pnl_MODpersona.add(txt_name_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 280, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("(con puntos y guion)");
        pnl_MODpersona.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Fecha de nacimiento :");
        pnl_MODpersona.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        pnl_MODpersona.add(txt_dateNaci_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 100, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Lugar de nacimiento :");
        pnl_MODpersona.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
        pnl_MODpersona.add(txt_lugarNaci_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 220, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Estado civil :");
        pnl_MODpersona.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jcb_eCivil_mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción", "Casado/a", "Soltero/a", "Viudo/a", "Divorciado/a", "Separado/a", "Conviviente" }));
        pnl_MODpersona.add(jcb_eCivil_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        btn_persona_mod.setText("Modificar");
        btn_persona_mod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_MODpersona.add(btn_persona_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 90, 30));

        txt_dateMatrimonio_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dateMatrimonio_modActionPerformed(evt);
            }
        });
        pnl_MODpersona.add(txt_dateMatrimonio_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 80, -1));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setText("Fecha de matrimonio :");
        pnl_MODpersona.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        TB_modificar.addTab("Persona", pnl_MODpersona);

        pnl_MODoficina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Modifica los datos de la oficina");
        pnl_MODoficina.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Identificador : ");
        pnl_MODoficina.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Región : ");
        pnl_MODoficina.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Comuna :");
        pnl_MODoficina.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Dirección :");
        pnl_MODoficina.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txt_idOff_mod.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_MODoficina.add(txt_idOff_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 120, -1));
        pnl_MODoficina.add(txt_comunaOff_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 160, -1));
        pnl_MODoficina.add(txt_direcOff_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 230, -1));

        jcb_region_mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Región de Arica y Parinacota", "Región de Tarapacá", "Región de Antofagasta", "Región de Atacama", "Región de Coquimbo", "Región de Valparaíso", "Región Metropolitana", "Región del Libertador General Bernardo O’Higgins", "Región del Maule", "Región de Ñuble", "Región del Biobío", "Región de La Araucanía", "Región de Los Ríos", "Región de Los Lagos", "Región de Aysén del General Carlos Ibáñez del Campo", "Región de Magallanes y de la Antártica Chilena" }));
        jcb_region_mod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcb_region_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_region_modActionPerformed(evt);
            }
        });
        pnl_MODoficina.add(jcb_region_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        btn_oficina_mod.setText("Modificar");
        btn_oficina_mod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_MODoficina.add(btn_oficina_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 90, 30));

        TB_modificar.addTab("Oficina", pnl_MODoficina);

        pnl_TBs.add(TB_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        pnl_DELpersona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Eliminar una persona");
        pnl_DELpersona.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("RUT :");
        pnl_DELpersona.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txt_rut_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rut_delActionPerformed(evt);
            }
        });
        pnl_DELpersona.add(txt_rut_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 90, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Nombre completo :");
        pnl_DELpersona.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        pnl_DELpersona.add(txt_name_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 280, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("(con puntos y guion)");
        pnl_DELpersona.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Fecha de nacimiento :");
        pnl_DELpersona.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txt_dateNaci_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dateNaci_delActionPerformed(evt);
            }
        });
        pnl_DELpersona.add(txt_dateNaci_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 100, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("Lugar de nacimiento :");
        pnl_DELpersona.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
        pnl_DELpersona.add(txt_eCivil_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 100, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("Estado civil :");
        pnl_DELpersona.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        btn_persona_del.setText("Eliminar");
        btn_persona_del.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_DELpersona.add(btn_persona_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 90, 30));
        pnl_DELpersona.add(txt_lugarNaci_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 220, -1));

        TB_eliminar.addTab("Persona", pnl_DELpersona);

        pnl_DELoficina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Eliminar una oficina");
        pnl_DELoficina.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("Identificador : ");
        pnl_DELoficina.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setText("Región : ");
        pnl_DELoficina.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("Comuna :");
        pnl_DELoficina.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText("Dirección :");
        pnl_DELoficina.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txt_idOff_del.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_DELoficina.add(txt_idOff_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 120, -1));
        pnl_DELoficina.add(txt_comunaOff_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 160, -1));
        pnl_DELoficina.add(txt_direcOff_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 230, -1));

        btn_oficina_del.setText("Eliminar");
        btn_oficina_del.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_oficina_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oficina_delActionPerformed(evt);
            }
        });
        pnl_DELoficina.add(btn_oficina_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 90, 30));
        pnl_DELoficina.add(txt_regionOff_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 360, -1));

        TB_eliminar.addTab("Oficina", pnl_DELoficina);

        pnl_TBs.add(TB_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        pnl_MODoficina1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("Buscar difuntos por año");
        pnl_MODoficina1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setText("Año :");
        pnl_MODoficina1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txt_year_searchDif.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_MODoficina1.add(txt_year_searchDif, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 80, -1));

        table_personaDif.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table_personaDif.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUT", "Nombre Completo", "Fecha Nacimiento", "Lugar Nacimiento", "Fecha defunción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(table_personaDif);

        pnl_MODoficina1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 700, 180));

        btn_search_dif.setText("Buscar");
        btn_search_dif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_difActionPerformed(evt);
            }
        });
        pnl_MODoficina1.add(btn_search_dif, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        btn_reporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reporte.setText("Generar reporte");
        pnl_MODoficina1.add(btn_reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 210, 30));

        TB_funcionalidades.addTab("Buscar difuntos", pnl_MODoficina1);

        pnl_TBs.add(TB_funcionalidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        pnl_fondo.add(pnl_TBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 940, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarMouseClicked
        ocultarTBs();
        TB_agregar.setVisible(true);       
    }//GEN-LAST:event_btn_AgregarMouseClicked

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        ocultarTBs();
        TB_mostrar.setVisible(true);
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void btn_certificadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_certificadosActionPerformed
        ocultarTBs();
        TB_certificados.setVisible(true);
    }//GEN-LAST:event_btn_certificadosActionPerformed

    private void btn_ADDPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ADDPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ADDPersonaActionPerformed

    private void jcb_region_offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_region_offActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_region_offActionPerformed

    private void txt_lugNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lugNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lugNacimientoActionPerformed

    private void txt_dateMatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dateMatrimonioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dateMatrimonioActionPerformed

    private void jcb_eCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_eCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_eCivilActionPerformed

    private void txt_cert_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cert_rutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cert_rutActionPerformed

    private void btn_defuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_defuncionesActionPerformed
        ocultarTBs();
        TB_defunciones.setVisible(true);
    }//GEN-LAST:event_btn_defuncionesActionPerformed

    private void txt_rut_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rut_modActionPerformed

    }//GEN-LAST:event_txt_rut_modActionPerformed

    private void jcb_region_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_region_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_region_modActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        ocultarTBs();
        TB_modificar.setVisible(true);
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        ocultarTBs();
        TB_eliminar.setVisible(true);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_rut_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rut_delActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rut_delActionPerformed

    private void txt_dateNaci_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dateNaci_delActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dateNaci_delActionPerformed

    private void btn_oficina_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oficina_delActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_oficina_delActionPerformed

    private void txt_dateMatrimonio_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dateMatrimonio_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dateMatrimonio_modActionPerformed

    private void btn_funcionalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_funcionalidadesActionPerformed
      ocultarTBs();
      TB_funcionalidades.setVisible(true);
    }//GEN-LAST:event_btn_funcionalidadesActionPerformed

    private void btn_search_difActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_difActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_search_difActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TB_agregar;
    private javax.swing.JTabbedPane TB_certificados;
    private javax.swing.JTabbedPane TB_defunciones;
    private javax.swing.JTabbedPane TB_eliminar;
    private javax.swing.JTabbedPane TB_funcionalidades;
    private javax.swing.JTabbedPane TB_modificar;
    public javax.swing.JTabbedPane TB_mostrar;
    public javax.swing.JButton btn_ADDPersona;
    public javax.swing.JButton btn_ADDoficina;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_certificados;
    private javax.swing.JButton btn_defunciones;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_funcionalidades;
    public javax.swing.JButton btn_generarCert;
    public javax.swing.JLabel btn_guardar;
    private javax.swing.JButton btn_modificar;
    public javax.swing.JButton btn_mostrar;
    public javax.swing.JButton btn_oficina_del;
    public javax.swing.JButton btn_oficina_mod;
    public javax.swing.JButton btn_persona_del;
    public javax.swing.JButton btn_persona_mod;
    public javax.swing.JButton btn_registrar_def;
    public javax.swing.JButton btn_reporte;
    public javax.swing.JButton btn_search_dif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabel_1;
    public javax.swing.JLabel jLabel_2;
    public javax.swing.JLabel jLabel_3;
    public javax.swing.JLabel jLabel_4;
    public javax.swing.JLabel jLabel_5;
    public javax.swing.JLabel jLabel_6;
    public javax.swing.JLabel jLabel_7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JComboBox<String> jcb_eCivil;
    public javax.swing.JComboBox<String> jcb_eCivil_mod;
    public javax.swing.JComboBox<String> jcb_region_mod;
    public javax.swing.JComboBox<String> jcb_region_off;
    public javax.swing.JComboBox<String> jcb_tipoCert;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JPanel pnl_ADDoficina;
    private javax.swing.JPanel pnl_ADDpersona;
    private javax.swing.JPanel pnl_DELoficina;
    private javax.swing.JPanel pnl_DELpersona;
    private javax.swing.JPanel pnl_MODoficina;
    private javax.swing.JPanel pnl_MODoficina1;
    private javax.swing.JPanel pnl_MODpersona;
    private javax.swing.JPanel pnl_MToficina;
    private javax.swing.JPanel pnl_MTpersona;
    private javax.swing.JPanel pnl_TBs;
    private javax.swing.JPanel pnl_azul;
    private javax.swing.JPanel pnl_certif;
    private javax.swing.JPanel pnl_fondo;
    private javax.swing.JPanel pnl_logo;
    private javax.swing.JPanel pnl_opciones;
    private javax.swing.JPanel pnl_registro_def;
    private javax.swing.JPanel pnl_rojo;
    private javax.swing.JPanel pnl_titulo;
    public javax.swing.JTable table_oficina;
    public javax.swing.JTable table_persona;
    public javax.swing.JTable table_personaDif;
    public javax.swing.JTextField txt_cert_rut;
    public javax.swing.JTextField txt_comunaOff_del;
    public javax.swing.JTextField txt_comunaOff_mod;
    public javax.swing.JTextField txt_comuna_off;
    public javax.swing.JTextField txt_dateMatrimonio;
    public javax.swing.JTextField txt_dateMatrimonio_mod;
    public javax.swing.JTextField txt_dateNaci_del;
    public javax.swing.JTextField txt_dateNaci_mod;
    public javax.swing.JTextField txt_dateNacimiento;
    public javax.swing.JTextField txt_date_def;
    public javax.swing.JTextField txt_direcOff_del;
    public javax.swing.JTextField txt_direcOff_mod;
    public javax.swing.JTextField txt_direc_off;
    public javax.swing.JTextField txt_eCivil_del;
    public javax.swing.JTextField txt_idOff_del;
    public javax.swing.JTextField txt_idOff_mod;
    public javax.swing.JTextField txt_id_off;
    public javax.swing.JTextField txt_lugNacimiento;
    public javax.swing.JTextField txt_lugarNaci_del;
    public javax.swing.JTextField txt_lugarNaci_mod;
    public javax.swing.JTextField txt_name;
    public javax.swing.JTextField txt_name_del;
    public javax.swing.JTextField txt_name_mod;
    public javax.swing.JTextField txt_oficina_search;
    public javax.swing.JTextField txt_regionOff_del;
    public javax.swing.JTextField txt_rut;
    public javax.swing.JTextField txt_rut_def;
    public javax.swing.JTextField txt_rut_del;
    public javax.swing.JTextField txt_rut_mod;
    public javax.swing.JTextField txt_rut_search;
    public javax.swing.JTextField txt_year_searchDif;
    // End of variables declaration//GEN-END:variables
}
