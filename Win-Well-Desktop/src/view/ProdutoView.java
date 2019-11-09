package view;
/**
 *
 * @author Rodriigo Santos
 */
import dao.PessoaDAO;
import model.Pessoa;
import table.ProdutoTableModel;

public class ProdutoView extends javax.swing.JFrame {
    
    Pessoa pro = new Pessoa();
    PessoaDAO prd = new PessoaDAO(); 
            
    
    public ProdutoView() {
        initComponents();
        setLocationRelativeTo(null);
        tbProduto.setModel(new ProdutoTableModel(new PessoaDAO().listarTodos()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        btExcluir = new javax.swing.JToggleButton();
        btSalvar = new javax.swing.JToggleButton();
        btLimpar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        tfPesquisarDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfCep = new javax.swing.JTextField();
        tfLogradouro = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfEstado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contatos");
        setResizable(false);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("E-mail:");

        tfCodigo.setEditable(false);
        tfCodigo.setBackground(new java.awt.Color(255, 204, 204));

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduto);

        jLabel4.setText("Pesquisar (Descricao):");

        tfPesquisarDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarDescricaoActionPerformed(evt);
            }
        });
        tfPesquisarDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarDescricaoKeyPressed(evt);
            }
        });

        jLabel5.setText("CEP:");

        jLabel6.setText("Logradouro:");

        jLabel7.setText("Bairro:");

        jLabel8.setText("Cidade:");

        jLabel9.setText("Estado:");

        tfCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCepActionPerformed(evt);
            }
        });

        jLabel10.setText("Telefone:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfPesquisarDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                                    .addComponent(tfNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfTelefone, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                                    .addComponent(tfCep)
                                    .addComponent(tfLogradouro)
                                    .addComponent(tfBairro)
                                    .addComponent(tfCidade)
                                    .addComponent(tfEstado))))
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPesquisarDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPesquisarDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarDescricaoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tbProduto.setModel(new ProdutoTableModel(new PessoaDAO().listarTodos()));
        tfCodigo.setText("");
        tfNome.setText("");
        tfTelefone.setText("");
        tfEmail.setText("");
        tfCep.setText("");
        tfLogradouro.setText("");
        tfBairro.setText("");
        tfCidade.setText("");
        tfEstado.setText("");
        tfPesquisarDescricao.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(tfCodigo.getText().equals("")){
            //Inserir
            pro.setNome(tfNome.getText());
            pro.setEmail(tfEmail.getText());
            pro.setTelefone(Integer.parseInt(tfTelefone.getText()));
            pro.setEmail(tfEmail.getText());
            pro.setCep(Integer.parseInt(tfCep.getText()));
            pro.setLogradouro(tfLogradouro.getText());
            pro.setBairro(tfBairro.getText());
            pro.setCidade(tfCidade.getText());
            pro.setEstado(tfEstado.getText());
            prd.inserir(pro);
        }else{
            //Alterar
            pro.setNome(tfNome.getText());
            pro.setEmail(tfEmail.getText());
            pro.setTelefone(Integer.parseInt(tfTelefone.getText()));
            pro.setCep(Integer.parseInt(tfCep.getText()));
            pro.setLogradouro(tfLogradouro.getText());
            pro.setBairro(tfBairro.getText());
            pro.setCidade(tfCidade.getText());
            pro.setEstado(tfEstado.getText());
            pro.setId(Integer.parseInt(tfCodigo.getText()));
            prd.alterar(pro);
        }
        tbProduto.setModel(new ProdutoTableModel(new PessoaDAO().listarTodos()));
        tfCodigo.setText("");
        tfNome.setText("");
        tfTelefone.setText("");
        tfEmail.setText("");
        tfCep.setText("");
        tfLogradouro.setText("");
        tfBairro.setText("");
        tfCidade.setText("");
        tfEstado.setText("");
        tfPesquisarDescricao.setText("");
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoMouseClicked
        tfCodigo.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_ID).toString());
        tfNome.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_NOME).toString());
        tfTelefone.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_TELEFONE).toString());
        tfEmail.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_EMAIL).toString());
        tfCep.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_CEP).toString());
        tfLogradouro.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_LOGRADOURO).toString());
        tfBairro.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_BAIRRO).toString());
        tfCidade.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_CIDADE).toString());
        tfEstado.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_ESTADO).toString());
        
    }//GEN-LAST:event_tbProdutoMouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int codigo = Integer.parseInt(tfCodigo.getText());
        prd.excluir(codigo);
        tbProduto.setModel(new ProdutoTableModel(new PessoaDAO().listarTodos()));
        tfCodigo.setText("");
        tfNome.setText("");
        tfTelefone.setText("");
        tfEmail.setText("");
        tfCep.setText("");
        tfLogradouro.setText("");
        tfBairro.setText("");
        tfCidade.setText("");
        tfEstado.setText("");        
        tfPesquisarDescricao.setText("");
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tfPesquisarDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarDescricaoKeyPressed
        String pesquisa = tfPesquisarDescricao.getText();
        tbProduto.setModel(new ProdutoTableModel(new PessoaDAO().listarTodosDescricao(pesquisa)));
    }//GEN-LAST:event_tfPesquisarDescricaoKeyPressed

    private void tfCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCepActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btExcluir;
    private javax.swing.JToggleButton btLimpar;
    private javax.swing.JToggleButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProduto;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisarDescricao;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
