
package vistas;

import Controladores.controladorOficina;
import Controladores.controladorPersona;
import modelos.Oficina;
import modelos.Persona;
import modelos.Persona_bd;

public class menuView extends javax.swing.JFrame {
    // Modelos
    Persona_bd bd_pp = new Persona_bd();
    Persona persona = new Persona();
    Oficina oficina = new Oficina();
    
    public menuView() {
        initComponents();
        this.setSize(1110, 650);
        this.setResizable(false);
        this.setTitle("Registro civil");
        this.setLocationRelativeTo(null);
        this.repaint();
        
        //Controladores
        controladorPersona controller_pp = new controladorPersona(bd_pp, persona, this);
        //controladorOficina controller_off = new controladorOficina(RC, oficina, this);
        
        // Oculto todos los Tabbed Pane
        TB_agregar.setVisible(false);
        TB_mostrar.setVisible(false);
        TB_certificados.setVisible(false);
    }
    
    public void ocultarTBs(){       
        TB_agregar.setVisible(false);
        TB_mostrar.setVisible(false);
        TB_certificados.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fondo = new javax.swing.JPanel();
        pnl_titulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnl_opciones = new javax.swing.JPanel();
        btn_Agregar = new javax.swing.JButton();
        btn_mostrar = new javax.swing.JButton();
        btn_certificados = new javax.swing.JButton();
        btn_defunciones = new javax.swing.JButton();
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
        pnl_AGoficina = new javax.swing.JPanel();
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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_infoPersona = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        pnl_MToficina = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_infoPersona1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        TB_certificados = new javax.swing.JTabbedPane();
        pnl_certif = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_fondo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_titulo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_titulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registro Civil");
        pnl_titulo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 110));

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
        pnl_opciones.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, 40));

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
        pnl_opciones.add(btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 170, 40));

        btn_certificados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_certificados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        btn_certificados.setText(" Certificados");
        btn_certificados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_certificadosActionPerformed(evt);
            }
        });
        pnl_opciones.add(btn_certificados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 170, 40));

        btn_defunciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_defunciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/defunción.png"))); // NOI18N
        btn_defunciones.setText("Defunciones");
        pnl_opciones.add(btn_defunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 170, 40));

        pnl_fondo.add(pnl_opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 490));

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
        pnl_ADDpersona.add(jLabel_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel_4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_4.setText("Fecha de nacimiento :");
        pnl_ADDpersona.add(jLabel_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel_5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_5.setText("(formato dd-mm-yyyy)");
        pnl_ADDpersona.add(jLabel_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel_6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_6.setText("Lugar de nacimiento :");
        pnl_ADDpersona.add(jLabel_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel_7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_7.setText("Estado civil :");
        pnl_ADDpersona.add(jLabel_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        pnl_ADDpersona.add(txt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 90, -1));
        pnl_ADDpersona.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 280, -1));
        pnl_ADDpersona.add(txt_dateNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 80, -1));

        jcb_eCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casado/a", "Soltero/a", "Viudo/a", "Divorciado/a", "Separado/a", "Conviviente" }));
        pnl_ADDpersona.add(jcb_eCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));
        pnl_ADDpersona.add(txt_lugNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 180, -1));

        btn_ADDPersona.setText("Agregar");
        btn_ADDPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ADDPersonaActionPerformed(evt);
            }
        });
        pnl_ADDpersona.add(btn_ADDPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 80, 30));

        TB_agregar.addTab("Persona", pnl_ADDpersona);

        pnl_AGoficina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Ingresa los datos de la oficina :");
        pnl_AGoficina.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Identificador : ");
        pnl_AGoficina.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Región : ");
        pnl_AGoficina.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Comuna :");
        pnl_AGoficina.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Dirección :");
        pnl_AGoficina.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txt_id_off.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_AGoficina.add(txt_id_off, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 120, -1));
        pnl_AGoficina.add(txt_comuna_off, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 160, -1));
        pnl_AGoficina.add(txt_direc_off, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 230, -1));

        jcb_region_off.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Región de Arica y Parinacota", "Región de Tarapacá", "Región de Antofagasta", "Región de Atacama", "Región de Coquimbo", "Región de Valparaíso", "Región Metropolitana", "Región del Libertador General Bernardo O’Higgins", "Región del Maule", "Región de Ñuble", "Región del Biobío", "Región de La Araucanía", "Región de Los Ríos", "Región de Los Lagos", "Región de Aysén del General Carlos Ibáñez del Campo", "Región de Magallanes y de la Antártica Chilena" }));
        jcb_region_off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_region_offActionPerformed(evt);
            }
        });
        pnl_AGoficina.add(jcb_region_off, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        btn_ADDoficina.setText("Agregar");
        pnl_AGoficina.add(btn_ADDoficina, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 80, 30));

        TB_agregar.addTab("Oficina", pnl_AGoficina);

        pnl_TBs.add(TB_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        pnl_MTpersona.setPreferredSize(new java.awt.Dimension(940, 400));
        pnl_MTpersona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Busqueda de personas");
        pnl_MTpersona.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("RUT : ");
        pnl_MTpersona.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        pnl_MTpersona.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 100, -1));

        tbl_infoPersona.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbl_infoPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RUT", "Nombre Completo", "Fecha Nacimiento", "Lugar Nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_infoPersona);

        pnl_MTpersona.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 700, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Resultado de la busqueda : ");
        pnl_MTpersona.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        TB_mostrar.addTab("Persona", pnl_MTpersona);

        pnl_MToficina.setPreferredSize(new java.awt.Dimension(940, 400));
        pnl_MToficina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Busqueda de oficinas");
        pnl_MToficina.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Región :");
        pnl_MToficina.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        pnl_MToficina.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 100, -1));

        tbl_infoPersona1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbl_infoPersona1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
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
        jScrollPane2.setViewportView(tbl_infoPersona1);

        pnl_MToficina.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 700, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Resultado de la busqueda : ");
        pnl_MToficina.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        TB_mostrar.addTab("Oficina", pnl_MToficina);

        pnl_TBs.add(TB_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        javax.swing.GroupLayout pnl_certifLayout = new javax.swing.GroupLayout(pnl_certif);
        pnl_certif.setLayout(pnl_certifLayout);
        pnl_certifLayout.setHorizontalGroup(
            pnl_certifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        pnl_certifLayout.setVerticalGroup(
            pnl_certifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        TB_certificados.addTab("Certificados", pnl_certif);

        pnl_TBs.add(TB_certificados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

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
            java.util.logging.Logger.getLogger(menuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TB_agregar;
    private javax.swing.JTabbedPane TB_certificados;
    private javax.swing.JTabbedPane TB_mostrar;
    public javax.swing.JButton btn_ADDPersona;
    public javax.swing.JButton btn_ADDoficina;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_certificados;
    private javax.swing.JButton btn_defunciones;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JComboBox<String> jcb_eCivil;
    public javax.swing.JComboBox<String> jcb_region_off;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JPanel pnl_ADDpersona;
    private javax.swing.JPanel pnl_AGoficina;
    private javax.swing.JPanel pnl_MToficina;
    private javax.swing.JPanel pnl_MTpersona;
    private javax.swing.JPanel pnl_TBs;
    private javax.swing.JPanel pnl_azul;
    private javax.swing.JPanel pnl_certif;
    private javax.swing.JPanel pnl_fondo;
    private javax.swing.JPanel pnl_logo;
    private javax.swing.JPanel pnl_opciones;
    private javax.swing.JPanel pnl_rojo;
    private javax.swing.JPanel pnl_titulo;
    private javax.swing.JTable tbl_infoPersona;
    private javax.swing.JTable tbl_infoPersona1;
    public javax.swing.JTextField txt_comuna_off;
    public javax.swing.JTextField txt_dateNacimiento;
    public javax.swing.JTextField txt_direc_off;
    public javax.swing.JTextField txt_id_off;
    public javax.swing.JTextField txt_lugNacimiento;
    public javax.swing.JTextField txt_name;
    public javax.swing.JTextField txt_rut;
    // End of variables declaration//GEN-END:variables
}
