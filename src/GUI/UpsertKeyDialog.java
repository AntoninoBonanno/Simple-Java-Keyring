/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Key;
import Classes.Page;
import Exceptions.KeyringException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author AntoninoBonanno <https://github.com/AntoninoBonanno>
 */
public class UpsertKeyDialog extends javax.swing.JDialog {
       
    /**
     * Creates new form NewRow
     * @param parent
     * @param modal
     * @param page Pagina dove si vuole aggiungere la key
     * @param key Key da modificare, NULL da creare nuova
     * @throws Exceptions.KeyringException
     */
    public UpsertKeyDialog(java.awt.Frame parent, boolean modal, Page page, Key key) throws KeyringException {
        super(parent, modal);
        initComponents();
        
        if(page == null && key == null) throw new KeyringException("Seleziona una pagina.", KeyringException.INFORMATION_MESSAGE);
        
        this.page = page;
        this.key = key;
        
        if(this.key != null){
            jTextFieldWebsite.setText(this.key.getWebSite());
            jTextFieldUsername.setText(this.key.getUsername());
            jTextFieldEmail.setText(this.key.getEmail());
            jKeyPanel.setPassword(this.key.getPassword());
            jTextAreaNote.setText(this.key.getNote());
            setTitle("Modifica password");
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

        jTextFieldWebsite = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNote = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButtonAbort = new javax.swing.JButton();
        jButtonConfirm = new javax.swing.JButton();
        jKeyPanel = new GUI.Components.JKeyPanel("Password");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuova password");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/logo1.png")));
        setResizable(false);

        jTextFieldWebsite.setNextFocusableComponent(jTextFieldEmail);
        jTextFieldWebsite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldWebsiteKeyPressed(evt);
            }
        });

        jLabel1.setText("Sito web:");

        jLabel2.setText("Email:");

        jTextFieldEmail.setNextFocusableComponent(jTextFieldUsername);
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyPressed(evt);
            }
        });

        jTextFieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUsernameKeyPressed(evt);
            }
        });

        jLabel3.setText("Usermane:");

        jTextAreaNote.setColumns(20);
        jTextAreaNote.setRows(5);
        jTextAreaNote.setNextFocusableComponent(jButtonConfirm);
        jTextAreaNote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAreaNoteKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaNote);

        jLabel5.setText("Note:");

        jButtonAbort.setText("Annulla");
        jButtonAbort.setNextFocusableComponent(jTextFieldWebsite);
        jButtonAbort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbortActionPerformed(evt);
            }
        });

        jButtonConfirm.setText("Conferma");
        jButtonConfirm.setNextFocusableComponent(jButtonAbort);
        jButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmActionPerformed(evt);
            }
        });

        jKeyPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jKeyPanelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConfirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAbort))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jKeyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldWebsite))
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(130, 130, 130))
                            .addComponent(jTextFieldEmail))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jKeyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAbort)
                    .addComponent(jButtonConfirm))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAbortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbortActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonAbortActionPerformed

    private void jButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmActionPerformed
        String webSite = jTextFieldWebsite.getText();
        String username = jTextFieldUsername.getText();
        String email = jTextFieldEmail.getText();
        String password = jKeyPanel.getPassword();
        String note = jTextAreaNote.getText();
        
        try {
            if(this.key != null) key.edit(webSite, username, email, password, note);
            else page.addKey(webSite, username, email, password, note);
            
            dispose();
        } catch (KeyringException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), ex.getTitle(), ex.getMessageType());
        }
    }//GEN-LAST:event_jButtonConfirmActionPerformed

    private void jTextFieldWebsiteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldWebsiteKeyPressed
        checkEnter(evt);
    }//GEN-LAST:event_jTextFieldWebsiteKeyPressed

    private void jTextFieldEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyPressed
        checkEnter(evt);
    }//GEN-LAST:event_jTextFieldEmailKeyPressed

    private void jTextFieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsernameKeyPressed
        checkEnter(evt);
    }//GEN-LAST:event_jTextFieldUsernameKeyPressed

    private void jTextAreaNoteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaNoteKeyPressed
        checkEnter(evt);
    }//GEN-LAST:event_jTextAreaNoteKeyPressed

    private void jKeyPanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jKeyPanelKeyPressed
        checkEnter(evt);
    }//GEN-LAST:event_jKeyPanelKeyPressed

    private final Page page;
    private final Key key;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbort;
    private javax.swing.JButton jButtonConfirm;
    private GUI.Components.JKeyPanel jKeyPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaNote;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JTextField jTextFieldWebsite;
    // End of variables declaration//GEN-END:variables

    private void checkEnter(KeyEvent evt) {
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButtonConfirm.doClick();
        }
    }
}
