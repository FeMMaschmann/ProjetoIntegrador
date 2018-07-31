/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import model.ObjItens;

/**
 *
 * @author 181710018
 */
public class Operacoes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Operações
     */
    
    private JDesktopPane painelTelaInicial;
    public List<ObjItens> listaItens;
    
    public Operacoes(JDesktopPane painelTelaInicial) {
        initComponents();
        this.painelTelaInicial = painelTelaInicial;
        listaItens = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAdd = new javax.swing.JButton();
        BtnExc = new javax.swing.JButton();
        tableItens = new javax.swing.JPanel();
        BtnFim = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Operações");

        BtnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAdd.setText("Adicionar Item");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnExc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnExc.setText("Excluir Item");

        javax.swing.GroupLayout tableItensLayout = new javax.swing.GroupLayout(tableItens);
        tableItens.setLayout(tableItensLayout);
        tableItensLayout.setHorizontalGroup(
            tableItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tableItensLayout.setVerticalGroup(
            tableItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        BtnFim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnFim.setText("Finalizar Operação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tableItens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(BtnExc)))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(BtnFim)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdd)
                    .addComponent(BtnExc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableItens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BtnFim)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        SelectItens tela = new SelectItens(this);
        this.painelTelaInicial.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_BtnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnExc;
    private javax.swing.JButton BtnFim;
    private javax.swing.JPanel tableItens;
    // End of variables declaration//GEN-END:variables
}
