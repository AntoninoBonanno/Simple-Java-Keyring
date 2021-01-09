package GUI;

import Exceptions.KeyringException;
import Classes.Keyring;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AntoninoBonanno <https://github.com/AntoninoBonanno>
 */
public class EditMasterKeyDialog extends javax.swing.JDialog {

    /**
     * Creates new form EditMasterKey
     * 
     * @param parent
     * @param modal
     * @param keyring
     */
    public EditMasterKeyDialog(java.awt.Frame parent, boolean modal, Keyring keyring) {
        super(parent, modal);
        initComponents();
        this.keyring = keyring;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jKeyPanelNewMaster = new GUI.Components.JKeyPanel("Nuova Master Key");
        jLabelLogo = new javax.swing.JLabel();
        jKeyPanelOldMaster = new GUI.Components.JKeyPanel(false);
        jButtonCredits = new javax.swing.JButton();
        jButtonConfirm = new javax.swing.JButton();
        jButtonAbort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modifica master Key");

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N

        jButtonCredits.setText("?");
        jButtonCredits.setFocusable(false);
        jButtonCredits.setRequestFocusEnabled(false);

        jButtonConfirm.setText("Conferma");
        jButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmActionPerformed(evt);
            }
        });

        jButtonAbort.setText("Annulla");
        jButtonAbort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jKeyPanelNewMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCredits))
                    .addComponent(jKeyPanelOldMaster, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConfirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAbort)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCredits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jKeyPanelOldMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jKeyPanelNewMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirm)
                    .addComponent(jButtonAbort))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmActionPerformed
        try {
            keyring.setMasterKey(jKeyPanelOldMaster.getPassword(), jKeyPanelNewMaster.getPassword());
            dispose();
        } catch (KeyringException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), ex.getTitle(), ex.getMessageType());
        }
    }//GEN-LAST:event_jButtonConfirmActionPerformed

    private void jButtonAbortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbortActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonAbortActionPerformed

    private final Keyring keyring;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbort;
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JButton jButtonCredits;
    private GUI.Components.JKeyPanel jKeyPanelNewMaster;
    private GUI.Components.JKeyPanel jKeyPanelOldMaster;
    private javax.swing.JLabel jLabelLogo;
    // End of variables declaration//GEN-END:variables
}
