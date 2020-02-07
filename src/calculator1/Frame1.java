/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author cliente
 */
public class Frame1 extends javax.swing.JFrame {
    
    public static InputStream is;
    public static OutputStream os;
    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        lblPregunta = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEnviar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        lblPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtRespuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRespuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 121, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEnviar)
                                .addGap(158, 158, 158))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))))
                    .addComponent(lblPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try {
            // TODO add your handling code here:
            enviarRespuesta();
        } catch (IOException ex) {
            Logger.getLogger(Frame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtRespuesta.setText("");
    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Frame1().setVisible(true);
//            }
//        });
        
        Frame1 frame = new Frame1();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Creando socket cliente");
            Socket clienteSocket = new Socket();
            System.out.println("Estableciendo la conexión");
            
            InetSocketAddress addr = new InetSocketAddress("192.168.0.1", 5555);
            clienteSocket.connect(addr);
            
            is = clienteSocket.getInputStream();
            os = clienteSocket.getOutputStream();
            
            byte[] mensaje = new byte[40];
            is.read(mensaje);
            frame.escribirPregunta(new String(mensaje)); 
            
            mensaje = new byte[40];
            is.read(mensaje);
            frame.escribirPregunta(new String(mensaje));
            
            mensaje = new byte[200];
            is.read(mensaje);
            frame.escribirPregunta(new String(mensaje));
            
            mensaje = new byte[40];
            is.read(mensaje);
            frame.escribirPregunta(new String(mensaje));
            
            System.out.println("Cerrando el socket cliente");
            clienteSocket.close();
            
            System.out.println("Terminado");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void escribirPregunta(String pregunta){
        lblPregunta.setText(pregunta);
    }
    
    public void enviarRespuesta() throws IOException{
        String r = txtRespuesta.getText();
        os.write(r.getBytes());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables

//Calculator1
//package calculator1;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.InetSocketAddress;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class Calculator1 {
//
//    public static void main(String[] args) {
//        try{
//            Scanner leer = new Scanner(System.in);
//            
//            System.out.println("Creando socket cliente");
//            Socket clienteSocket = new Socket();
//            System.out.println("Estableciendo la conexión");
//            
//            InetSocketAddress addr = new InetSocketAddress("192.168.0.1", 5555);
//            clienteSocket.connect(addr);
//            
//            InputStream is = clienteSocket.getInputStream();
//            OutputStream os = clienteSocket.getOutputStream();
//            
//            byte[] mensaje = new byte[40];
//            is.read(mensaje);
//            System.out.println(new String(mensaje));
//            
//            System.out.println("Enviando primer operando");
//            String envio = leer.nextLine();
//            os.write(envio.getBytes());
//            
//            mensaje = new byte[40];
//            is.read(mensaje);
//            System.out.println(new String(mensaje));
//            
//            System.out.println("Enviando segundo operando");
//            envio = leer.nextLine();
//            os.write(envio.getBytes());
//            
//            mensaje = new byte[200];
//            is.read(mensaje);
//            System.out.println(new String(mensaje));
//            
//            System.out.println("Enviando tipo de operación");
//            envio = leer.nextLine();
//            os.write(envio.getBytes());
//            
//            System.out.println("Recibiendo resultado de operación");
//            mensaje = new byte[40];
//            is.read(mensaje);
//            System.out.println(new String(mensaje));
//            
//            System.out.println("Cerrando el socket cliente");
//            clienteSocket.close();
//            
//            System.out.println("Terminado");
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    
//}
}