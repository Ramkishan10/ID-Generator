
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.File;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C.B.RAMKISHAN
 */
import java.io.File;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
//import Page3.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C.B.RAMKISHAN
 */
public class page4 extends javax.swing.JFrame {

    /**
     * Creates new form page4
     */
    public page4(String name,String dobs,String roll,String degree,String address,String batch,String ad1,String ad2,String ad3,String mob,String par,String bloods,String mail) {
        initComponents();
      //  id.setIcon((Icon) Page3.g);
        src.setText(name);
        dobq.setText(dobs);
        jLabel2.setText(roll);
        deg.setText(degree);
        ad.setText(address);
        bat.setText(batch);
        a1.setText(ad1);
        a2.setText(ad2);
        a3.setText(ad3);
        mob1.setText(mob);
        p1.setText(par);
        b1.setText(bloods);
        e1.setText(mail);
   //     Icon path = null;
       // id.setIcon((Icon) (icon));
       //id.setIcon(path);
       
        
        setVisible(true);
    }
 /*   public page4(String path)
    {
        
        
         Image im=Toolkit.getDefaultToolkit().createImage(path);
        //im=im.getScaledInstance(CALE_SMOOTH);
        ImageIcon li=new ImageIcon(im);
        id.setIcon(li);
    }*/

    page4(String names, String dobs, String roll, String degrees, String address, String batches, String ad1, String ad2, String ad3, String mob, String par, String bloods, String gmail, ImageIcon icon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    page4(String names, String dobs, String roll, String degrees, String address, String batches, String ad1, String ad2, String ad3, String mob, String par, String bloods, String gmail, List<Image> icons) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    page4(JLabel image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   /* page4(String names, String dobs, String roll, String degrees, String address, String batches, String ad1, String ad2, String ad3, String mob, String par, String bloods, String gmail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        src = new javax.swing.JLabel();
        dobq = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bat = new javax.swing.JLabel();
        ad = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        mob1 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("NAME :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 280, 69, 30);

        src.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        src.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(src);
        src.setBounds(100, 280, 150, 30);

        dobq.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        dobq.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(dobq);
        dobq.setBounds(100, 310, 110, 20);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 330, 100, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("DOB  :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 310, 60, 20);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("ROLLNO :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 330, 80, 30);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("DEGREE :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 360, 80, 20);

        deg.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        deg.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(deg);
        deg.setBounds(100, 360, 120, 20);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("BATCH :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(370, 40, 70, 30);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("BLOOD GROUP :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 70, 130, 30);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setText("PARENT NAME :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 100, 130, 21);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("MOBILE  :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(360, 120, 90, 30);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setText("ADDRESS :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(350, 150, 100, 30);

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 102));
        jLabel13.setText("E-MAIL :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(310, 330, 70, 30);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(500, 370, 210, 0);

        bat.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        bat.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(bat);
        bat.setBounds(450, 40, 130, 30);

        ad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        ad.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(ad);
        ad.setBounds(450, 150, 120, 30);

        a1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        a1.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(a1);
        a1.setBounds(420, 180, 150, 30);

        a2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        a2.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(a2);
        a2.setBounds(420, 210, 160, 20);

        a3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        a3.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(a3);
        a3.setBounds(420, 240, 160, 20);

        mob1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        mob1.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(mob1);
        mob1.setBounds(450, 120, 120, 30);

        p1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        p1.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(p1);
        p1.setBounds(450, 100, 140, 20);

        b1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(b1);
        b1.setBounds(450, 70, 100, 30);

        e1.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 12)); // NOI18N
        e1.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(e1);
        e1.setBounds(310, 360, 240, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\C.B.RAMKISHAN\\Downloads\\vcetid2.jpg")); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(290, 10, 280, 400);
        getContentPane().add(id);
        id.setBounds(70, 110, 120, 150);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\C.B.RAMKISHAN\\Downloads\\vcetid1.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 10, 250, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(page4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel ad;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel bat;
    private javax.swing.JLabel deg;
    private javax.swing.JLabel dobq;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel id;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mob1;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel src;
    // End of variables declaration//GEN-END:variables

 
