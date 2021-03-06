package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import dao.Aluno;
import dao.AlunoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alcides
 */
public class Grade extends javax.swing.JFrame {

    /**
     * Creates new form Grade
     */
    public Grade() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnInfo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtRgm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox();
        bntDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alunos JTable");
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RGM", "Nome", "Curso"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 430, 220);

        btnInfo.setText("Informações");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo);
        btnInfo.setBounds(350, 140, 100, 23);

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.setMaximumSize(new java.awt.Dimension(80, 25));
        btnAlterar.setMinimumSize(new java.awt.Dimension(80, 25));
        btnAlterar.setPreferredSize(new java.awt.Dimension(80, 25));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(130, 140, 100, 25);

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(240, 140, 100, 23);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.setMaximumSize(new java.awt.Dimension(80, 25));
        btnAdicionar.setMinimumSize(new java.awt.Dimension(80, 25));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar);
        btnAdicionar.setBounds(20, 140, 100, 23);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(51, 0, 204))); // NOI18N
        jPanel1.setLayout(null);
        jPanel1.add(txtRgm);
        txtRgm.setBounds(80, 20, 60, 20);

        jLabel1.setText("RGM:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 50, 20);

        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 50, 60, 20);
        jPanel1.add(txtNome);
        txtNome.setBounds(80, 50, 260, 20);

        jLabel3.setText("Curso:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 80, 60, 20);

        cmbCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GTI", "ADS", "CCP" }));
        jPanel1.add(cmbCurso);
        cmbCurso.setBounds(80, 80, 150, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 10, 430, 120);

        bntDados.setText("Carregar dados");
        bntDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDadosActionPerformed(evt);
            }
        });
        getContentPane().add(bntDados);
        bntDados.setBounds(170, 400, 120, 23);

        setSize(new java.awt.Dimension(493, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int s = 0;
    
    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        JOptionPane.showMessageDialog(null, "JTable v0.1\n "
                + "Aluno: Marco Antonio Sanches\n"
                + "RGM: 12345", "Sobre o aplicativo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
           jTable1.setValueAt(txtRgm.getText(),s,0);
           jTable1.setValueAt(txtNome.getText(), s, 1);
           jTable1.setValueAt(cmbCurso.getSelectedItem(), s, 2);
           
           txtRgm.setText("");
           txtNome.setText("");
           btnAlterar.setEnabled(false);
           btnExcluir.setEnabled(false);
     
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
       int linhaSelecionada = jTable1.getSelectedRow() ;
       if (linhaSelecionada != -1) {
           ((DefaultTableModel)jTable1.getModel()).removeRow(linhaSelecionada);
           txtRgm.setText("");
           txtNome.setText("");
           btnAlterar.setEnabled(false);
           btnExcluir.setEnabled(false);
       }
       else {
                JOptionPane.showMessageDialog(null, 
                                "Por favor, selecione a linha a ser eliminada.", 
                                "Eliminação",
                                JOptionPane.INFORMATION_MESSAGE);
       }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        
        if(!txtRgm.getText().equals("") && !txtNome.getText().equals("")){
          Object dados [] = new Object[3];
          dados[0] = txtRgm.getText();
          dados[1] = txtNome.getText();
          dados[2] = cmbCurso.getSelectedItem();
          txtRgm.setText("");
          txtNome.setText("");
         
        ((DefaultTableModel)jTable1.getModel()).addRow(dados);
        }

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            s = jTable1.getSelectedRow();
            txtRgm.setText("" + jTable1.getModel().getValueAt(s, 0));
            txtNome.setText("" + jTable1.getModel().getValueAt(s, 1));
            cmbCurso.setSelectedItem(jTable1.getModel().getValueAt(s, 2));
                    
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void bntDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDadosActionPerformed
        ArrayList<Aluno> lista = new AlunoDAO().listaAlunos();

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        for (int i = 0; i < lista.size(); i++) {
            modelo.addRow(new String[]{lista.get(i).getRgm(), lista.get(i).getNome(), lista.get(i).getCurso()});
        }
    }//GEN-LAST:event_bntDadosActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntDados;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInfo;
    private javax.swing.JComboBox cmbCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRgm;
    // End of variables declaration//GEN-END:variables
}
