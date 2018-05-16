/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriodental;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Armando1
 */
public class BuscarPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form BuscarPaciente
     */
    ArrayList<Object[]> datos;
    DefaultListModel model= new DefaultListModel();
    String url ="jdbc:mysql://localhost:3306/clinicadental?user=root&password=panda101";
    
    public BuscarPaciente() {
        initComponents();
         setTitle("Buscar paciente ");
          FondoPanel fp  = new FondoPanel("/fondo/fondoverde.jpg");
        fp.setSize(794, 509);
        this.add(fp,BorderLayout.CENTER);
        rBuqueda.setModel(model);
        model.add(0, "NOMBRE       APELLIDO PAT       APELLIDO MAT");
        this.pack();
    }

    public void agregarDatosList(ArrayList<Object[]> datos){
        String aux="";
        for (int i=0;i<datos.size();i++) {
            aux=(String) datos.get(i)[1]+"          "+datos.get(i)[2]+"        "+datos.get(i)[3];
            model.addElement(aux);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        rMostrar = new javax.swing.JTextArea();
        bBuscar = new javax.swing.JButton();
        iBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rBuqueda = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        rMostrar.setEditable(false);
        rMostrar.setColumns(20);
        rMostrar.setRows(5);
        jScrollPane2.setViewportView(rMostrar);

        bBuscar.setBackground(new java.awt.Color(168, 202, 235));
        bBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        iBuscar.setToolTipText("ingrese el nombre o apellido a buscar");

        jLabel1.setText("Nombre del paciente: ");

        jLabel2.setText("Resultados:");

        rBuqueda.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                rBuquedaValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(rBuqueda);

        jLabel3.setText("Detalles:");

        jButton1.setText("actualizar expediente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ver expediente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bBuscar)
                        .addComponent(jScrollPane3)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(iBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(iBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        
        datos = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection co=DriverManager.getConnection(url);
            
            Statement stm = co.createStatement();
            ResultSet rs = stm.executeQuery("Select * from paciente where nombre like '%"+iBuscar.getText()+"%' or apellido_Paterno like '%"+iBuscar.getText()+"%' or apellido_materno like '%"+iBuscar.getText()+"%'");
            while (rs.next()) {
                    String dat[] = new String[12];
                    dat[0] = String.valueOf(rs.getInt("id_paciente"));//id_paciente
                    dat[1] = String.valueOf(rs.getString("nombre"));//nombre
                    dat[2] = String.valueOf(rs.getString("apellido_Paterno"));//apPaterno
                    dat[3] = String.valueOf(rs.getString("apellido_materno"));//apMaterno  
                    dat[4] = String.valueOf(rs.getString("genero"));
                    dat[5] = String.valueOf(rs.getString("fecha_nacimiento"));
                    dat[6] = String.valueOf(rs.getString("calle_numero"));
                    dat[7] = String.valueOf(rs.getString("colonia"));
                    dat[8] = String.valueOf(rs.getString("codigo_postal"));
                    dat[9] = String.valueOf(rs.getString("estado"));
                    dat[10] = String.valueOf(rs.getString("telefono"));
                    dat[11] = String.valueOf(rs.getString("email"));
                    
                    datos.add(dat);
            }                
                agregarDatosList(datos);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BuscarPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void rBuquedaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_rBuquedaValueChanged
        if(rBuqueda.getSelectedIndex()!=0){
           int auxindex=rBuqueda.getSelectedIndex()-1;
           
           String datosss="";
            datosss+="NOMBRE: "+datos.get(auxindex)[1] +"\n";
            datosss+="APELLIDO PATERNO: "+datos.get(auxindex)[2] +"\n";
            datosss+="APELLIDO MATERNO: "+datos.get(auxindex)[3] +"\n";
            datosss+="GENERO: "+datos.get(auxindex)[4] +"\n";
            datosss+="FECHA DE NACIMIENTO: "+datos.get(auxindex)[5] +"\n";
            datosss+="CALLE Y NUMERO: "+datos.get(auxindex)[6] +"\n";
            datosss+="COLONIA: "+datos.get(auxindex)[7] +"\n";
            datosss+="ESTADO: "+datos.get(auxindex)[9] +"\n";
            datosss+="CODIGO POSTAL: "+datos.get(auxindex)[8] +"\n";
            datosss+="TELEFONO: "+datos.get(auxindex)[10] +"\n";
            datosss+="CORREO ELECTRONICO: "+datos.get(auxindex)[11] +"\n---------------------------------------------------\n";

        rMostrar.setText(datosss);
           
       }        
    }//GEN-LAST:event_rBuquedaValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JTextField iBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> rBuqueda;
    private javax.swing.JTextArea rMostrar;
    // End of variables declaration//GEN-END:variables
}
