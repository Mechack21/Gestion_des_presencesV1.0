/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulaires;

import Entites.Direction;
import Entites.Division;
import javax.swing.JOptionPane;

/**
 *
 * @author MECHACK
 */
public class Pndivision extends javax.swing.JPanel {

    Division dvs = new Division();
    Direction drtn = new Direction();

    /**
     * Creates new form Pndivision
     */
    public Pndivision() {
        initComponents();
        dvs.remplir(jTable1, "select* from DIVISION");
        drtn.Charger(CmboDirection);
    }

    void Nettoyer() {
        TxtIdDivision.setText("");
        TxtNomdiv.setText("");
        CmboDirection.setSelectedItem("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgP = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TxtRecherche = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BtnSave = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnClean = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TxtIdDivision = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtNomdiv = new javax.swing.JTextField();
        CmboDirection = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        BgP.setBackground(new java.awt.Color(255, 255, 255));
        BgP.setMinimumSize(new java.awt.Dimension(700, 200));
        BgP.setPreferredSize(new java.awt.Dimension(700, 400));
        BgP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(122, 71, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fénetre DIVISION");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 510, 10));

        BgP.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Divisions Enregistrés", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bookman Old Style", 1, 18))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        BgP.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 600, 210));

        TxtRecherche.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        BgP.add(TxtRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_26px.png"))); // NOI18N
        BgP.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 40, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Commandes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bookman Old Style", 1, 18))); // NOI18N

        BtnSave.setBackground(new java.awt.Color(0, 0, 0));
        BtnSave.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        BtnSave.setForeground(new java.awt.Color(255, 255, 255));
        BtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Save_25px.png"))); // NOI18N
        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        BtnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        BtnUpdate.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        BtnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        BtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Available_Updates_26px.png"))); // NOI18N
        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnDelete.setBackground(new java.awt.Color(0, 0, 0));
        BtnDelete.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        BtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        BtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Delete_25px.png"))); // NOI18N
        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        BtnClean.setBackground(new java.awt.Color(0, 0, 0));
        BtnClean.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        BtnClean.setForeground(new java.awt.Color(255, 255, 255));
        BtnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Broom_25px.png"))); // NOI18N
        BtnClean.setText("Clean");
        BtnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSave)
                    .addComponent(BtnUpdate))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDelete)
                    .addComponent(BtnClean))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        BgP.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 270, 150));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coordonnées", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bookman Old Style", 1, 18))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel5.setText("Id_Division");

        TxtIdDivision.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel4.setText("Nom");

        TxtNomdiv.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N

        CmboDirection.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel6.setText("Direction");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addComponent(TxtIdDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TxtNomdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CmboDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtIdDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtNomdiv, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmboDirection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24))
        );

        BgP.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 380, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgP, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:
        if (TxtIdDivision.getText().equals("") || TxtNomdiv.getText().equals("") || CmboDirection.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs", "ATTENTION!!", JOptionPane.ERROR_MESSAGE);
        } else {
            dvs.setId_DIVISION(TxtIdDivision.getText());
            dvs.setLibelle(TxtNomdiv.getText());
            dvs.setId_DIRECTION(CmboDirection.getSelectedItem().toString());
            dvs.Ajouter();
            dvs.remplir(jTable1, "select * from division");
            Nettoyer();

        }
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        int rep = JOptionPane.showConfirmDialog(null, "Etes-vous sur de voiloir MODIFIER ??", "MODIFICATION", JOptionPane.YES_NO_OPTION);
        if (rep == JOptionPane.YES_OPTION) {
            if (TxtIdDivision.getText().equals("") || TxtNomdiv.getText().equals("") || CmboDirection.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Veuillez selectionner une ligne", "ATTENTION!!", JOptionPane.ERROR_MESSAGE);
            } else {
                dvs.setId_DIVISION(TxtIdDivision.getText());
                dvs.setLibelle(TxtNomdiv.getText());
                dvs.setId_DIRECTION(CmboDirection.getSelectedItem().toString());
                dvs.Modifier();
                dvs.remplir(jTable1, "select * from division");
                Nettoyer();
            }

        }
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:
        int rep = JOptionPane.showConfirmDialog(null, "Etes-vous sur de voiloir SUPPRIMER ??", "MODIFICATION", JOptionPane.YES_NO_OPTION);
        if (rep == JOptionPane.YES_OPTION) {
            if (TxtIdDivision.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Veuillez Saisir l'identifiant de la division à supprimer", "ATTENTION!!", JOptionPane.ERROR_MESSAGE);
            } else {
                dvs.setId_DIVISION(TxtIdDivision.getText());
                dvs.Supprimer();
                dvs.remplir(jTable1, "select * from division");
                Nettoyer();
            }

        }
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int ligne = jTable1.getSelectedRow();
        TxtIdDivision.setText(jTable1.getValueAt(ligne, 0).toString());
        TxtNomdiv.setText(jTable1.getValueAt(ligne, 1).toString());
        CmboDirection.setSelectedItem(jTable1.getValueAt(ligne, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void BtnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCleanActionPerformed
        // TODO add your handling code here:
        Nettoyer();
    }//GEN-LAST:event_BtnCleanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgP;
    private javax.swing.JButton BtnClean;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnSave;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JComboBox CmboDirection;
    private javax.swing.JTextField TxtIdDivision;
    private javax.swing.JTextField TxtNomdiv;
    private javax.swing.JTextField TxtRecherche;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
