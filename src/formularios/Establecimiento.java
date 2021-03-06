/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.ConexionMetodos;

/**
 *
 * @author Danie
 */
public class Establecimiento extends javax.swing.JFrame {

    /**
     * Creates new form Establecimiento
     */
    public Establecimiento() {
        initComponents();
         LlenarCargosEmpleados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnl_Contenedor = new javax.swing.JPanel();
        jPnl_BarraTittle = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPnl_ContenedorTabla = new javax.swing.JPanel();
        jSp_ContenedorTabla = new javax.swing.JScrollPane();
        jTbl_Datos = new javax.swing.JTable();
        jPnl_Controles = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        cmbCentro = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPnl_Botones = new javax.swing.JPanel();
        jBtn_Agregar = new javax.swing.JButton();
        jBtn_Modificar = new javax.swing.JButton();
        jBtn_Consultar = new javax.swing.JButton();
        jBtn_Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPnl_Contenedor.setBackground(new java.awt.Color(113, 127, 131));
        jPnl_Contenedor.setLayout(null);

        jPnl_BarraTittle.setBackground(new java.awt.Color(44, 62, 80));
        jPnl_BarraTittle.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Establecimiento");
        jPnl_BarraTittle.add(jLabel5);
        jLabel5.setBounds(320, 0, 230, 30);

        jPnl_Contenedor.add(jPnl_BarraTittle);
        jPnl_BarraTittle.setBounds(0, -1, 850, 30);

        jPnl_ContenedorTabla.setBackground(new java.awt.Color(44, 62, 80));
        jPnl_ContenedorTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPnl_ContenedorTabla.setOpaque(false);
        jPnl_ContenedorTabla.setLayout(null);

        jTbl_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTbl_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTbl_DatosMousePressed(evt);
            }
        });
        jSp_ContenedorTabla.setViewportView(jTbl_Datos);

        jPnl_ContenedorTabla.add(jSp_ContenedorTabla);
        jSp_ContenedorTabla.setBounds(10, 10, 790, 290);

        jPnl_Contenedor.add(jPnl_ContenedorTabla);
        jPnl_ContenedorTabla.setBounds(10, 240, 820, 310);

        jPnl_Controles.setBackground(new java.awt.Color(44, 62, 80));
        jPnl_Controles.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPnl_Controles.setOpaque(false);
        jPnl_Controles.setLayout(null);

        txtCodigo.setEditable(false);
        jPnl_Controles.add(txtCodigo);
        txtCodigo.setBounds(100, 10, 290, 20);

        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("Codigo");
        jPnl_Controles.add(jLabel2);
        jLabel2.setBounds(10, 10, 33, 14);

        jLabel3.setForeground(new java.awt.Color(245, 245, 245));
        jLabel3.setText("Centro");
        jPnl_Controles.add(jLabel3);
        jLabel3.setBounds(10, 50, 160, 14);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jPnl_Controles.add(jScrollPane1);
        jScrollPane1.setBounds(100, 90, 290, 96);

        cmbCentro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPnl_Controles.add(cmbCentro);
        cmbCentro.setBounds(100, 50, 290, 20);

        jLabel4.setForeground(new java.awt.Color(245, 245, 245));
        jLabel4.setText("Descripcion:");
        jPnl_Controles.add(jLabel4);
        jLabel4.setBounds(10, 90, 160, 14);

        jPnl_Contenedor.add(jPnl_Controles);
        jPnl_Controles.setBounds(10, 36, 580, 198);

        jPnl_Botones.setBackground(new java.awt.Color(44, 62, 80));
        jPnl_Botones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPnl_Botones.setOpaque(false);
        jPnl_Botones.setLayout(null);

        jBtn_Agregar.setText("Agregar");
        jBtn_Agregar.setToolTipText("");
        jBtn_Agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtn_Agregar.setIconTextGap(0);
        jBtn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_AgregarActionPerformed(evt);
            }
        });
        jPnl_Botones.add(jBtn_Agregar);
        jBtn_Agregar.setBounds(20, 10, 200, 30);

        jBtn_Modificar.setText("Modificar");
        jBtn_Modificar.setToolTipText("");
        jBtn_Modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtn_Modificar.setIconTextGap(0);
        jBtn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ModificarActionPerformed(evt);
            }
        });
        jPnl_Botones.add(jBtn_Modificar);
        jBtn_Modificar.setBounds(20, 50, 200, 30);

        jBtn_Consultar.setText("Consultar");
        jBtn_Consultar.setToolTipText("");
        jBtn_Consultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtn_Consultar.setIconTextGap(0);
        jBtn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ConsultarActionPerformed(evt);
            }
        });
        jPnl_Botones.add(jBtn_Consultar);
        jBtn_Consultar.setBounds(20, 130, 200, 30);

        jBtn_Eliminar.setText("Eliminar");
        jBtn_Eliminar.setToolTipText("");
        jBtn_Eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtn_Eliminar.setIconTextGap(0);
        jBtn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_EliminarActionPerformed(evt);
            }
        });
        jPnl_Botones.add(jBtn_Eliminar);
        jBtn_Eliminar.setBounds(20, 90, 200, 30);

        jPnl_Contenedor.add(jPnl_Botones);
        jPnl_Botones.setBounds(596, 36, 230, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnl_Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnl_Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ConsultarActionPerformed
        // TODO add your handling code here:
        CargarTabla();
    }//GEN-LAST:event_jBtn_ConsultarActionPerformed

    private void jBtn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_AgregarActionPerformed
        // TODO add your handling code here:
        
            String descripcion = txtDescripcion.getText();
            String descripcion_centro = cmbCentro.getSelectedItem().toString();
         ConexionMetodos OBT = new ConexionMetodos();
         
          String consulta = "select id_centro from Centro where descripcion ='"+descripcion_centro+"'";
         String codigo_centro = OBT.ObtenerValor("id_centro", consulta);
          ConexionMetodos JM = new ConexionMetodos();
        //hago la consulta que cargara la tabla
         consulta = "insert into [establecimiento] values ("+codigo_centro+",'"+descripcion+"',1)";
         JM.EjecutarConsulta(consulta);
    }//GEN-LAST:event_jBtn_AgregarActionPerformed

    private void jTbl_DatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbl_DatosMousePressed
        // TODO add your handling code here:
         int fila_seleccionada = jTbl_Datos.getSelectedRow();
         txtCodigo.setText(jTbl_Datos.getValueAt(fila_seleccionada, 0).toString());
         cmbCentro.setSelectedItem(jTbl_Datos.getValueAt(fila_seleccionada, 1).toString());
         txtDescripcion.setText(jTbl_Datos.getValueAt(fila_seleccionada,2).toString());
    }//GEN-LAST:event_jTbl_DatosMousePressed

    private void jBtn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ModificarActionPerformed
        // TODO add your handling code here:
        String codigo = txtCodigo.getText();
         String descripcion = txtDescripcion.getText();
            String descripcion_centro = cmbCentro.getSelectedItem().toString();
         ConexionMetodos OBT = new ConexionMetodos();
         
          String consulta = "select id_centro from Centro where descripcion ='"+descripcion_centro+"'";
         String codigo_centro = OBT.ObtenerValor("id_centro", consulta);
          ConexionMetodos JM = new ConexionMetodos();
        //hago la consulta que cargara la tabla
         consulta = "update [establecimiento] set [e_centro] = "+codigo_centro+",[descripcion]='"+descripcion+" ' where id_establecimiento ="+codigo+"";
         JM.EjecutarConsulta(consulta);
    }//GEN-LAST:event_jBtn_ModificarActionPerformed

    private void jBtn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_EliminarActionPerformed
        // TODO add your handling code here:
         String codigo = txtCodigo.getText();
          ConexionMetodos JM = new ConexionMetodos();
        //hago la consulta que cargara la tabla
         String consulta = "update [establecimiento] set [estado]=2 where id_establecimiento="+codigo+" ";
         JM.EjecutarConsulta(consulta);
    }//GEN-LAST:event_jBtn_EliminarActionPerformed
 private void CargarTabla()
    {
        //abro la conexion
        ConexionMetodos JM = new ConexionMetodos();
        //hago la consulta que cargara la tabla
        String consulta = "select E.id_establecimiento,C.descripcion,E.descripcion from [establecimiento] E,[Centro] C where E.e_centro= C.id_centro and e.estado =1";
        
        //seteo el modelo a la tabla
        jTbl_Datos.setModel(JM.LlenarJTable(consulta));
    }
 
    private void LlenarCargosEmpleados()
    {
        ConexionMetodos CM = new ConexionMetodos();
        String carga_cmb = "descripcion";
        String consulta = "SELECT * FROM Centro";
        cmbCentro.setModel(CM.LlenarCombobox(carga_cmb, consulta));
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Establecimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Establecimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Establecimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Establecimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Establecimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCentro;
    private javax.swing.JButton jBtn_Agregar;
    private javax.swing.JButton jBtn_Consultar;
    private javax.swing.JButton jBtn_Eliminar;
    private javax.swing.JButton jBtn_Modificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPnl_BarraTittle;
    private javax.swing.JPanel jPnl_Botones;
    private javax.swing.JPanel jPnl_Contenedor;
    private javax.swing.JPanel jPnl_ContenedorTabla;
    private javax.swing.JPanel jPnl_Controles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jSp_ContenedorTabla;
    private javax.swing.JTable jTbl_Datos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
