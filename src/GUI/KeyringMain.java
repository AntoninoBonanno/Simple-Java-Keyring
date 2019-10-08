package GUI;


import Exceptions.KeyringException;
import Keyring.Keyring;
import Keyring.Row;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nino
 */
public class KeyringMain extends javax.swing.JFrame {
    
    /**
     * Creates new form KeyringMain
     * @param keyring
     */
    public KeyringMain(Keyring keyring) {
        initComponents();
        this.keyring = keyring;
        javax.swing.JFrame me = this;
        
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                int result = JOptionPane.showConfirmDialog(me,
                "Sei sicuro di voler uscire?",
                "Conferma uscita", JOptionPane.YES_NO_CANCEL_OPTION);
                if(result != JOptionPane.YES_OPTION) return;
                System.out.println("\n<----- KEYRING ----->");
                dispose();
            }
        });
                
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu_tablePassword = new javax.swing.JPopupMenu();
        jMenuItem_webSite = new javax.swing.JMenuItem();
        jMenuItem_email = new javax.swing.JMenuItem();
        jMenuItem_username = new javax.swing.JMenuItem();
        jMenuItem_password = new javax.swing.JMenuItem();
        jMenuItem_note = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_passwords = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton_add = new javax.swing.JButton();
        jButton_up = new javax.swing.JButton();
        jButton_remove = new javax.swing.JButton();
        jButton_down = new javax.swing.JButton();
        jButton_save = new javax.swing.JButton();
        jCheckBox_showPass = new javax.swing.JCheckBox();
        jTextField_trova = new javax.swing.JTextField();
        jLabel_find = new javax.swing.JLabel();
        jButton_trova = new javax.swing.JButton();
        jButton_credits = new javax.swing.JButton();
        jButton_edit = new javax.swing.JButton();

        jPopupMenu_tablePassword.addPopupMenuListener(new PopupMenuListener() {

            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        int rowAtPoint = jTable_passwords.rowAtPoint(SwingUtilities.convertPoint(jPopupMenu_tablePassword, new Point(0, 0), jTable_passwords));
                        if (rowAtPoint > -1) {
                            jTable_passwords.setRowSelectionInterval(rowAtPoint, rowAtPoint);
                        }
                    }
                });
            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {
                // TODO Auto-generated method stub

            }
        });

        jMenuItem_webSite.setText("Copia Sito web");
        jMenuItem_webSite.setToolTipText("");
        jMenuItem_webSite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    keyring.copyToClipboard(jTable_passwords.getSelectedRow(), Row.ELEMENT_WEBSITE);
                } catch (KeyringException ex) {
                    JOptionPane.showMessageDialog(KeyringMain.this, ex.getMessage(),ex.getTitleMsg(),ex.getTypeMessage());
                }
            }
        });
        jPopupMenu_tablePassword.add(jMenuItem_webSite);

        jMenuItem_email.setText("Copia Email");
        jMenuItem_email.setToolTipText("");
        jMenuItem_email.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    keyring.copyToClipboard(jTable_passwords.getSelectedRow(), Row.ELEMENT_EMAIL);
                } catch (KeyringException ex) {
                    JOptionPane.showMessageDialog(KeyringMain.this, ex.getMessage(),ex.getTitleMsg(),ex.getTypeMessage());
                }
            }
        });
        jPopupMenu_tablePassword.add(jMenuItem_email);

        jMenuItem_username.setText("Copia Username");
        jMenuItem_username.setToolTipText("");
        jMenuItem_username.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    keyring.copyToClipboard(jTable_passwords.getSelectedRow(), Row.ELEMENT_USERNAME);
                } catch (KeyringException ex) {
                    JOptionPane.showMessageDialog(KeyringMain.this, ex.getMessage(),ex.getTitleMsg(),ex.getTypeMessage());
                }
            }
        });
        jPopupMenu_tablePassword.add(jMenuItem_username);

        jMenuItem_password.setText("Copia Password");
        jMenuItem_password.setToolTipText("");
        jMenuItem_password.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    keyring.copyToClipboard(jTable_passwords.getSelectedRow(), Row.ELEMENT_PASSWORD);
                } catch (KeyringException ex) {
                    JOptionPane.showMessageDialog(KeyringMain.this, ex.getMessage(),ex.getTitleMsg(),ex.getTypeMessage());
                }
            }
        });
        jPopupMenu_tablePassword.add(jMenuItem_password);

        jMenuItem_note.setText("Copia Note");
        jMenuItem_note.setToolTipText("");
        jMenuItem_note.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    keyring.copyToClipboard(jTable_passwords.getSelectedRow(), Row.ELEMENT_NOTE);
                } catch (KeyringException ex) {
                    JOptionPane.showMessageDialog(KeyringMain.this, ex.getMessage(),ex.getTitleMsg(),ex.getTypeMessage());
                }
            }
        });
        jPopupMenu_tablePassword.add(jMenuItem_note);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Key Ring");
        setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);

        jTable_passwords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sito web", "Email", "Usermane", "Password", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_passwords.setComponentPopupMenu(jPopupMenu_tablePassword);
        jTable_passwords.setRowHeight(20);
        jTable_passwords.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            jButton_edit.setEnabled(jTable_passwords.getSelectedRow()>-1);
        });
        jScrollPane1.setViewportView(jTable_passwords);

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 0, 36)); // NOI18N
        jLabel1.setText("KeyRing");

        jButton_add.setText("Aggiungi riga");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jButton_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/su.png"))); // NOI18N
        jButton_up.setToolTipText("Sposta la riga selezionata in alto");
        jButton_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_upActionPerformed(evt);
            }
        });

        jButton_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rimuovi.png"))); // NOI18N
        jButton_remove.setToolTipText("Rimuovi la riga selezionata");
        jButton_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removeActionPerformed(evt);
            }
        });

        jButton_down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/giù.png"))); // NOI18N
        jButton_down.setToolTipText("Sposta la riga selezionata in basso");
        jButton_down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_downActionPerformed(evt);
            }
        });

        jButton_save.setText("Salva");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jCheckBox_showPass.setText("Mostra password");
        jCheckBox_showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_showPassActionPerformed(evt);
            }
        });

        jTextField_trova.setToolTipText("Inserisci il nome della disciplina da cercare");

        jLabel_find.setText("Trova...");

        jButton_trova.setText("Trova");
        jButton_trova.setToolTipText("Trova disciplina");
        jButton_trova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_trovaActionPerformed(evt);
            }
        });

        jButton_credits.setText("?");
        jButton_credits.setFocusable(false);
        jButton_credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_creditsActionPerformed(evt);
            }
        });

        jButton_edit.setText("Modifica riga");
        jButton_edit.setEnabled(false);
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_remove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton_up, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_down, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_trova, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_trova))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_find)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_credits))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox_showPass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_save))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_find)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton_credits)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_trova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_trova))
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton_up, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_down, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_save)
                    .addComponent(jButton_add)
                    .addComponent(jCheckBox_showPass)
                    .addComponent(jButton_edit))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_upActionPerformed
        if(jTable_passwords.getSelectedRows().length>1){
            JOptionPane.showMessageDialog(this, "Seleziona una riga singola.\n", "Attenzione", JOptionPane.INFORMATION_MESSAGE); 
            jTable_passwords.clearSelection(); 
            return;
        }            
        try {
            keyring.moveUpRow(jTable_passwords.getSelectedRow());
            jTable_passwords.clearSelection();
            loadTable();
        } catch (KeyringException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),ex.getTitleMsg(),ex.getTypeMessage());
        }
    }//GEN-LAST:event_jButton_upActionPerformed

    private void jButton_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removeActionPerformed
        if(jTable_passwords.getSelectedRows().length>1){
            JOptionPane.showMessageDialog(this, "Seleziona una riga singola.\n", "Attenzione", JOptionPane.INFORMATION_MESSAGE); 
            jTable_passwords.clearSelection(); 
            return;
        }
        try {
            keyring.removeRow(jTable_passwords.getSelectedRow());
            jTable_passwords.clearSelection();
            loadTable();
        } catch (KeyringException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),ex.getTitleMsg(),ex.getTypeMessage());
        }
    }//GEN-LAST:event_jButton_removeActionPerformed

    private void jButton_downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_downActionPerformed
        if(jTable_passwords.getSelectedRows().length>1){
            JOptionPane.showMessageDialog(this, "Seleziona una riga singola.\n", "Attenzione", JOptionPane.INFORMATION_MESSAGE); 
            jTable_passwords.clearSelection(); 
            return;
        }
        try {
            keyring.moveDownRow(jTable_passwords.getSelectedRow());
            jTable_passwords.clearSelection();
            loadTable();
        } catch (KeyringException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),ex.getTitleMsg(),ex.getTypeMessage());
        }
    }//GEN-LAST:event_jButton_downActionPerformed

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        NewRow nr = new NewRow(this, true, keyring, -1);
        nr.setLocationRelativeTo(this);        
        nr.setVisible(true);
        
        loadTable();
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
    try {
        keyring.save();
        JOptionPane.showMessageDialog(this, "Salvataggio eseguito con successo.\n", "Salvataggio", JOptionPane.INFORMATION_MESSAGE); 
    } catch (KeyringException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(),ex.getTitleMsg(),ex.getTypeMessage());
        System.out.println("Errore: "+ ex.getMessage());
        System.out.println("Salvataggio file non riuscito.");
    }        
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jCheckBox_showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_showPassActionPerformed
        System.out.println(jCheckBox_showPass.isSelected() ? "Mostro le password." : "Nascondo le password.");
        loadTable();
    }//GEN-LAST:event_jCheckBox_showPassActionPerformed

    private void jButton_trovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_trovaActionPerformed
        int [] b=new int[2];
        if(search!=null){b[0]=search[0]+1; b[1]=0;}
        else {b=null;}
        try {
            search=trova(b);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Inserisci un testo da cercare.", "Nessun testo inserito!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(search==null){ jLabel_find.setText("Fine ricerca."); JOptionPane.showMessageDialog(this,"Ricerca completata.\n","Ricerca completata.", JOptionPane.INFORMATION_MESSAGE);}
        else jLabel_find.setText("Trova successivo...");
    }//GEN-LAST:event_jButton_trovaActionPerformed

    private void jButton_creditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_creditsActionPerformed
        Credits c = new Credits(this, true);
        c.setLocationRelativeTo(this);
        c.setVisible(true);
    }//GEN-LAST:event_jButton_creditsActionPerformed

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        if(jTable_passwords.getSelectedRows().length>1){
            JOptionPane.showMessageDialog(this, "Seleziona una riga singola.\n", "Attenzione", JOptionPane.INFORMATION_MESSAGE); 
            jTable_passwords.clearSelection(); 
            return;
        }
        NewRow nr = new NewRow(this, true, keyring, jTable_passwords.getSelectedRow());
        nr.setLocationRelativeTo(this);        
        nr.setVisible(true);
        
        loadTable();
    }//GEN-LAST:event_jButton_editActionPerformed
    
    private final Keyring keyring;
    private int [] search = null; //ricerca[0] riga e search[1] colonna dell'ultimo elemento trovato
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_credits;
    private javax.swing.JButton jButton_down;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_remove;
    private javax.swing.JButton jButton_save;
    private javax.swing.JButton jButton_trova;
    private javax.swing.JButton jButton_up;
    private javax.swing.JCheckBox jCheckBox_showPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_find;
    private javax.swing.JMenuItem jMenuItem_email;
    private javax.swing.JMenuItem jMenuItem_note;
    private javax.swing.JMenuItem jMenuItem_password;
    private javax.swing.JMenuItem jMenuItem_username;
    private javax.swing.JMenuItem jMenuItem_webSite;
    private javax.swing.JPopupMenu jPopupMenu_tablePassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_passwords;
    private javax.swing.JTextField jTextField_trova;
    // End of variables declaration//GEN-END:variables

    /**
     * Vengono ricaricati i dati della tabella
     */   
    private void loadTable(){
        System.out.print("Carico la tabella...   ");   
        DefaultTableModel table = (DefaultTableModel) jTable_passwords.getModel();
        table.setRowCount(0);
        
        keyring.getTableKeys().stream().map((r) -> {
            String pass = (jCheckBox_showPass.isSelected()) ? r.getPassword() : "********";
            Object[] row = {r.getWebSite(),r.getEmail(), r.getUsername(), pass, r.getNote()};
            return row;
        }).forEachOrdered((row) -> { 
            table.addRow(row);
        });
        System.out.println("Completato.");
    }
        
    /**
     * Funzione trova, Ricerca il testo nella tabella
     * @param a a[0] riga e a[1] colonna da dove partire la search
     * @return int[] dove int[0] è la riga e int[1] è la colonna dove è stato trovato il testo
     * @throws Exception se jTextField_trova è vuoto
     */
    private int[] trova(int [] a) throws Exception{
        String target = jTextField_trova.getText().toLowerCase();
        if (jTextField_trova.getText().trim().isEmpty()) throw new Exception();
        
        if(a==null) {a=new int[2]; a[0]=0; a[1]=1;}
        int [] b=a;
        for(int row = a[0]; row < jTable_passwords.getRowCount(); row++){
            String next = jTable_passwords.getValueAt(row, 2).toString().toLowerCase();
                if(next.contains(target))
                {       
                     b[0]=row;
                     b[1]=1;
                     jTable_passwords.scrollRectToVisible(jTable_passwords.getCellRect(row, 0, true));
                     jTable_passwords.setRowSelectionInterval(row, row);
                     return b;
                }
            }
        return null;
    }
    
}
