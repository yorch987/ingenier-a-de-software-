/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriodental;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Armando
 */
public class MenuSecretaria extends javax.swing.JFrame {

 
    /**
     * Creates new form MenuSecretaria
     */
    public MenuSecretaria() {
        initComponents();

           setLocationRelativeTo(this);
        setTitle("Menu secretaria");
          FondoPanel fp  = new FondoPanel("/fondo/fon11.png");
        fp.setSize(1062,617);
        this.add(fp,BorderLayout.CENTER);
        
        
        FondoPanel fpl  = new FondoPanel("/fondo/r.png");
        fpl.setSize(110,125);
        logo.add(fpl,BorderLayout.CENTER);
        logo.add(fpl);
        this.pack();    
          escritorioS.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        consultar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        escritorioS = new javax.swing.JDesktopPane();
        cambiarUsuario = new javax.swing.JButton();
        logo = new javax.swing.JPanel();
        nuevoPaciente = new javax.swing.JButton();
        nuevoPaciente3 = new javax.swing.JButton();
        nuevoPaciente5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SISTEMAS DE CITAS");

        consultar.setBackground(new java.awt.Color(136, 200, 79));
        consultar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        consultar.setText("Consultar cita");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        escritorioS.setBackground(new java.awt.Color(202, 233, 250));
        escritorioS.setForeground(new java.awt.Color(205, 239, 250));
        escritorioS.setName(""); // NOI18N

        javax.swing.GroupLayout escritorioSLayout = new javax.swing.GroupLayout(escritorioS);
        escritorioS.setLayout(escritorioSLayout);
        escritorioSLayout.setHorizontalGroup(
            escritorioSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 836, Short.MAX_VALUE)
        );
        escritorioSLayout.setVerticalGroup(
            escritorioSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        cambiarUsuario.setBackground(new java.awt.Color(136, 200, 79));
        cambiarUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cambiarUsuario.setText("Cambiar de usuario");
        cambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarUsuarioActionPerformed(evt);
            }
        });

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setOpaque(false);

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );

        nuevoPaciente.setBackground(new java.awt.Color(136, 200, 79));
        nuevoPaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nuevoPaciente.setText("Nuevo paciente");
        nuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoPacienteActionPerformed(evt);
            }
        });

        nuevoPaciente3.setBackground(new java.awt.Color(136, 200, 79));
        nuevoPaciente3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nuevoPaciente3.setText("Agregar nueva cita");
        nuevoPaciente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoPaciente3ActionPerformed(evt);
            }
        });

        nuevoPaciente5.setBackground(new java.awt.Color(136, 200, 79));
        nuevoPaciente5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nuevoPaciente5.setText("Buscar paciente");
        nuevoPaciente5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoPaciente5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(consultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cambiarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(nuevoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nuevoPaciente3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nuevoPaciente5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(escritorioS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(escritorioS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(nuevoPaciente)
                .addGap(25, 25, 25)
                .addComponent(nuevoPaciente5)
                .addGap(25, 25, 25)
                .addComponent(nuevoPaciente3)
                .addGap(25, 25, 25)
                .addComponent(consultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cambiarUsuario)
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        escritorioS.removeAll();
        BuscarCita bc = new BuscarCita();
      //  escritorioS.add(cc);
       // cc.show();
        revalidate();
        repaint();
    }//GEN-LAST:event_consultarActionPerformed

    private void cambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarUsuarioActionPerformed
         dispose();
        Login l= new Login(); 
        l.setVisible(true);
    }//GEN-LAST:event_cambiarUsuarioActionPerformed

    private void nuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoPacienteActionPerformed
      escritorioS.removeAll();
          AgregarPaciente ap = new AgregarPaciente();
       ap = new AgregarPaciente();
      escritorioS.add(ap);
      ap.show();
       escritorioS.setVisible(true);
       revalidate();
       repaint();     
    }//GEN-LAST:event_nuevoPacienteActionPerformed

    private void nuevoPaciente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoPaciente3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoPaciente3ActionPerformed

    private void nuevoPaciente5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoPaciente5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoPaciente5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiarUsuario;
    private javax.swing.JButton consultar;
    private javax.swing.JDesktopPane escritorioS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel logo;
    private javax.swing.JButton nuevoPaciente;
    private javax.swing.JButton nuevoPaciente3;
    private javax.swing.JButton nuevoPaciente5;
    // End of variables declaration//GEN-END:variables
}