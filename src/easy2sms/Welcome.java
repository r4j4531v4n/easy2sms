package easy2sms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import org.apache.http.HttpResponse;

/**
 *
 * @author rajaselvan
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
        setLook();
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * alregenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jTextField1 = new JTextField();
        jLabel2 = new JLabel();
        jTextField2 = new JTextField();
        jLabel3 = new JLabel();
        jTextField3 = new JTextField();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jButton1 = new JButton();
        jLabel4 = new JLabel();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ResourceBundle bundle = ResourceBundle.getBundle("easy2sms/Bundle"); // NOI18N
        setTitle(bundle.getString("Welcome.title_1")); // NOI18N

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setText(bundle.getString("Welcome.jLabel1.text_1")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jTextField1.setText(bundle.getString("Welcome.jTextField1.text_1")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N
        jTextField1.addFocusListener(formListener);

        jLabel2.setText(bundle.getString("Welcome.jLabel2.text_1")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jTextField2.setText(bundle.getString("Welcome.jTextField2.text_1")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N
        jTextField2.addActionListener(formListener);
        jTextField2.addFocusListener(formListener);

        jLabel3.setText(bundle.getString("Welcome.jLabel3.text_1")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jTextField3.setText(bundle.getString("Welcome.jTextField3.text_1")); // NOI18N
        jTextField3.setName("jTextField3"); // NOI18N
        jTextField3.addFocusListener(formListener);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jTextArea1.addKeyListener(formListener);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new Color(0, 0, 0));
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setText(bundle.getString("Welcome.jButton1.text_1")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(formListener);

        jLabel4.setText(bundle.getString("Welcome.jLabel4.text_1")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements ActionListener, FocusListener, KeyListener {
        FormListener() {}
        public void actionPerformed(ActionEvent evt) {
            if (evt.getSource() == jButton1) {
                Welcome.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jTextField2) {
                Welcome.this.jTextField2ActionPerformed(evt);
            }
        }

        public void focusGained(FocusEvent evt) {
            if (evt.getSource() == jTextField3) {
                Welcome.this.jTextField3FocusGained(evt);
            }
            else if (evt.getSource() == jTextField1) {
                Welcome.this.jTextField1FocusGained(evt);
            }
            else if (evt.getSource() == jTextField2) {
                Welcome.this.jTextField2FocusGained(evt);
            }
        }

        public void focusLost(FocusEvent evt) {
        }

        public void keyPressed(KeyEvent evt) {
        }

        public void keyReleased(KeyEvent evt) {
            if (evt.getSource() == jTextArea1) {
                Welcome.this.jTextArea1KeyReleased(evt);
            }
        }

        public void keyTyped(KeyEvent evt) {
        }
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String uid, pwd, phone, msg;

        uid = jTextField1.getText();
        pwd = jTextField2.getText();
        phone = jTextField3.getText();
        msg = jTextArea1.getText();
        try {
            easy2sms.HttpResponse<JsonNode> request = Unirest.get("https://site2sms.p.mashape.com/index.php?uid=" + uid + "&pwd=" + pwd + "&phone=" + phone + "&msg=" + msg)
                    .header("X-Mashape-Authorization", "ufdSjW1abrhKFuIwxjQ1D4zbb5dfCPVF")
                    .asJson();

            JOptionPane.showMessageDialog(null, "Message sent!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (UnirestException ue) {
            JOptionPane.showMessageDialog(null, ue.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextArea1KeyReleased(KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        if (jTextArea1.getText().length() < 135) {
            jLabel4.setText("No of Characterers left: " + (135 - (jTextArea1.getText().length()) + 5));
        } else {
            jLabel4.setText("You have exceeded 140 characters");
        }
    }//GEN-LAST:event_jTextArea1KeyReleased

    

    private void jTextField3FocusGained(FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        jTextField3.setText(null);
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField1FocusGained(FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setText(null);
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.setText(null);
    }//GEN-LAST:event_jTextField2FocusGained

    /**
     * @param args the command line arguments
     */
    public void setLook() {
        /* Set the Nimbus look and feel */
        //<edfaultstate="collapsed" desc=" Look andg code (optional) ">
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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
