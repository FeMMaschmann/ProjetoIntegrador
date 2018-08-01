/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author 181710018
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jdpTelaInicial = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuIniciar = new javax.swing.JMenu();
        MenuAbrirOp = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        MenuFornecedores = new javax.swing.JMenu();
        MenuCadastrarFornecedores = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MenuContatoFornecedores = new javax.swing.JMenuItem();
        MenuItens = new javax.swing.JMenu();
        MenuCadastrarItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        MenuEstoqueItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clínicas");
        setPreferredSize(new java.awt.Dimension(1024, 768));

        jdpTelaInicial.setToolTipText("");

        javax.swing.GroupLayout jdpTelaInicialLayout = new javax.swing.GroupLayout(jdpTelaInicial);
        jdpTelaInicial.setLayout(jdpTelaInicialLayout);
        jdpTelaInicialLayout.setHorizontalGroup(
            jdpTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdpTelaInicialLayout.setVerticalGroup(
            jdpTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        MenuIniciar.setText("Iniciar");

        MenuAbrirOp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        MenuAbrirOp.setText("Abrir Operações");
        MenuAbrirOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAbrirOpActionPerformed(evt);
            }
        });
        MenuIniciar.add(MenuAbrirOp);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Imprimir");
        MenuIniciar.add(jMenuItem1);
        MenuIniciar.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Sair");
        MenuIniciar.add(jMenuItem2);

        jMenuBar1.add(MenuIniciar);

        MenuFornecedores.setText("Fornecedores");

        MenuCadastrarFornecedores.setText("Cadastrar");
        MenuCadastrarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarFornecedoresActionPerformed(evt);
            }
        });
        MenuFornecedores.add(MenuCadastrarFornecedores);
        MenuFornecedores.add(jSeparator2);

        MenuContatoFornecedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuContatoFornecedores.setText("Lista e Contato");
        MenuContatoFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuContatoFornecedoresActionPerformed(evt);
            }
        });
        MenuFornecedores.add(MenuContatoFornecedores);

        jMenuBar1.add(MenuFornecedores);

        MenuItens.setText("Utensílios Clínicos");

        MenuCadastrarItem.setText("Novo Item");
        MenuCadastrarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarItemActionPerformed(evt);
            }
        });
        MenuItens.add(MenuCadastrarItem);
        MenuItens.add(jSeparator3);

        MenuEstoqueItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuEstoqueItem.setText("Estoque");
        MenuEstoqueItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEstoqueItemActionPerformed(evt);
            }
        });
        MenuItens.add(MenuEstoqueItem);

        jMenuBar1.add(MenuItens);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTelaInicial)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTelaInicial)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadastrarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarFornecedoresActionPerformed
        FrmFornecedores frm = new FrmFornecedores();
        jdpTelaInicial.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_MenuCadastrarFornecedoresActionPerformed

    private void MenuCadastrarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarItemActionPerformed
        FrmItens frm = new FrmItens();
        jdpTelaInicial.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_MenuCadastrarItemActionPerformed

    private void MenuContatoFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuContatoFornecedoresActionPerformed
        ListFornecedores list = new ListFornecedores(jdpTelaInicial);
        jdpTelaInicial.add(list);
        list.setVisible(true);
    }//GEN-LAST:event_MenuContatoFornecedoresActionPerformed

    private void MenuEstoqueItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEstoqueItemActionPerformed
        ListItens list = new ListItens(jdpTelaInicial);
        jdpTelaInicial.add(list);
        list.setVisible(true);
    }//GEN-LAST:event_MenuEstoqueItemActionPerformed

    private void MenuAbrirOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAbrirOpActionPerformed
        Operacoes op = new Operacoes(jdpTelaInicial);
        jdpTelaInicial.add(op);
        op.setVisible(true);
    }//GEN-LAST:event_MenuAbrirOpActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAbrirOp;
    private javax.swing.JMenuItem MenuCadastrarFornecedores;
    private javax.swing.JMenuItem MenuCadastrarItem;
    private javax.swing.JMenuItem MenuContatoFornecedores;
    private javax.swing.JMenuItem MenuEstoqueItem;
    private javax.swing.JMenu MenuFornecedores;
    private javax.swing.JMenu MenuIniciar;
    private javax.swing.JMenu MenuItens;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JDesktopPane jdpTelaInicial;
    // End of variables declaration//GEN-END:variables
}
