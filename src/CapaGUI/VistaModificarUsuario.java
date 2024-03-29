/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import CapaDTO.Usuario;
import CapaNegocio.NegocioUsuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class VistaModificarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form VistaModificarUsuario
     */
    public VistaModificarUsuario() {
        initComponents();
        VistaLogin auxVista = new VistaLogin();
        lbl_rut.setText(auxVista.rut_usu);
        VistaUsuario auxUsuario = new VistaUsuario();
        txt_rutUsu.setText(auxUsuario.rut_usu);
        buscarUsuario();
    }
    
    public void buscarUsuario(){
        
        try {
            
            NegocioUsuario auxNegocioUsuario = new NegocioUsuario();
            Usuario auxUsuario = new Usuario();
            auxUsuario.setNombre_usu(auxNegocioUsuario.buscaUsuario(txt_rutUsu.getText()).getNombre_usu());
            auxUsuario.setApellido_usu(auxNegocioUsuario.buscaUsuario(txt_rutUsu.getText()).getApellido_usu());
            auxUsuario.setSueldo_usu(auxNegocioUsuario.buscaUsuario(txt_rutUsu.getText()).getSueldo_usu());
            auxUsuario.setCorreo_usu(auxNegocioUsuario.buscaUsuario(txt_rutUsu.getText()).getCorreo_usu());
            auxUsuario.setContrasena_usu(auxNegocioUsuario.buscaUsuario(txt_rutUsu.getText()).getContrasena_usu());
            auxUsuario.setId_tipo_usu(auxNegocioUsuario.buscaUsuario(txt_rutUsu.getText()).getId_tipo_usu());
            
            txt_nombreUsu.setText(auxUsuario.getNombre_usu());
            txt_apellidoUsu.setText(auxUsuario.getApellido_usu());
            txt_sueldoUsu.setText(String.valueOf(auxUsuario.getSueldo_usu()));
            txt_correoUsu.setText(auxUsuario.getCorreo_usu());
            txt_contrasena.setText(auxUsuario.getContrasena_usu());
            box_rol.setSelectedIndex(auxUsuario.getId_tipo_usu());
            
            
            
            
        } catch (Exception e) {
        }
        
    }
    
    public void modificarUsuario(){
        
        try {
            
            if(txt_nombreUsu.getText().length()==0|| txt_apellidoUsu.getText().length()==0||txt_sueldoUsu.getText().length() ==0
                    || txt_correoUsu.getText().length()==0||txt_contrasena.getText().length()==0||box_rol.getSelectedIndex()==0)
            {
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            }else{
                
                if(JOptionPane.showConfirmDialog(null, "Se modificara un usuario, ¿Desea Continuar?", "Modificar Usuario"
                    ,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                {
                    Usuario auxUsuario = new Usuario();
                    NegocioUsuario auxNegocioUsuario = new NegocioUsuario();

                    auxUsuario.setRut_usu(txt_rutUsu.getText());
                    auxUsuario.setNombre_usu(txt_nombreUsu.getText());
                    auxUsuario.setApellido_usu(txt_apellidoUsu.getText());
                    auxUsuario.setSueldo_usu(Integer.parseInt(txt_sueldoUsu.getText()));
                    auxUsuario.setCorreo_usu(txt_correoUsu.getText());
                    auxUsuario.setContrasena_usu(txt_contrasena.getText());
                    auxUsuario.setId_tipo_usu(box_rol.getSelectedIndex());

                    auxNegocioUsuario.actualizarUsuario(auxUsuario);
                    
                    JOptionPane.showMessageDialog(null, "Los datos fueron guardados con exito");
                    
                }
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombreUsu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        box_rol = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_apellidoUsu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_rutUsu = new javax.swing.JTextField();
        txt_sueldoUsu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_correoUsu = new javax.swing.JTextField();
        bto_guardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_contrasena = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_rut = new javax.swing.JLabel();
        bto_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Rol Usuario");
        jLabel4.setToolTipText("");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));

        txt_nombreUsu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_nombreUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Nombre");
        jLabel5.setToolTipText("");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));

        box_rol.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        box_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Rol", "Cajero/a", "Vendedor/a", "Bodeguero/a", "Admin" }));
        box_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_rolActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Apellido");
        jLabel6.setToolTipText("");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));

        txt_apellidoUsu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_apellidoUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Rut Usuario");
        jLabel7.setToolTipText("");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));

        txt_rutUsu.setEditable(false);
        txt_rutUsu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_rutUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_sueldoUsu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_sueldoUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Sueldo");
        jLabel8.setToolTipText("");
        jLabel8.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Correo");
        jLabel9.setToolTipText("");
        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));

        txt_correoUsu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_correoUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bto_guardar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bto_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        bto_guardar.setText("Guardar");
        bto_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_guardarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel10.setText("Modificar Usuario");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Contraseña");
        jLabel11.setToolTipText("");
        jLabel11.setBorder(new javax.swing.border.MatteBorder(null));

        txt_contrasena.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_contrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(bto_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_correoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_sueldoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_rutUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_apellidoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(box_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_rutUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellidoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sueldoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_correoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(bto_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        lbl_usuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setText("Rut Usuario/a:");
        lbl_usuario.setToolTipText("");

        lbl_rut.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl_rut.setForeground(new java.awt.Color(255, 255, 255));
        lbl_rut.setText("16258754-3");
        lbl_rut.setToolTipText("");
        lbl_rut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_rut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bto_cerrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bto_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        bto_cerrar.setText("Volver");
        bto_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_usuario)
                .addGap(10, 10, 10)
                .addComponent(lbl_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bto_cerrar)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bto_cerrar)
                    .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bto_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_guardarActionPerformed
        // TODO add your handling code here:
        modificarUsuario();
    }//GEN-LAST:event_bto_guardarActionPerformed

    private void bto_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_cerrarActionPerformed
        // TODO add your handling code here:

        this.dispose();
        VistaUsuario pMenu = new VistaUsuario();
        pMenu.buscarUsuario();
    }//GEN-LAST:event_bto_cerrarActionPerformed

    private void box_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_rolActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_rol;
    private javax.swing.JButton bto_cerrar;
    private javax.swing.JButton bto_guardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_rut;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextField txt_apellidoUsu;
    private javax.swing.JTextField txt_contrasena;
    private javax.swing.JTextField txt_correoUsu;
    private javax.swing.JTextField txt_nombreUsu;
    private javax.swing.JTextField txt_rutUsu;
    private javax.swing.JTextField txt_sueldoUsu;
    // End of variables declaration//GEN-END:variables
}
