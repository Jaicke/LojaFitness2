/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.sql.SQLException;
import negocio.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Cliente;
import negocio.Fornecedor;
import negocio.excecoes.CadastroProdutoException;
import negocio.regras.RegraCliente;
import negocio.regras.RegraFornecedor;
import negocio.regras.RegraProduto;

/**
 *
 * @author EDVALDO
 */
public class TelaPrincipalAdm extends javax.swing.JFrame {

    RegraProduto regra = new RegraProduto();
    RegraCliente regraC = new RegraCliente();
    RegraFornecedor regraF = new RegraFornecedor();
    Produto obj = new Produto();

    public void atualizaTabelaProduto() {
        //atualiza tabela produto
        listaProduto.clear();
        try {
            listaProduto.addAll(regra.getLista());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        }
        int linha = listaProduto.size() - 1;
        if (linha >= 0) {
            tblProdutos.setRowSelectionInterval(linha, linha);
            tblProdutos.scrollRectToVisible(
                    tblProdutos.getCellRect(linha, linha, true));
        }
    }

    public void atualizaTabelaCliente() {
        //atualiza tabela cliente
        listaCliente.clear();
        try {
            listaCliente.addAll(regraC.getLista());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro;" + ex.getMessage());
        }
        int linha = listaCliente.size() - 1;
        if (linha >= 0) {
            tblCliente.setRowSelectionInterval(linha, linha);
            tblCliente.scrollRectToVisible(
                    tblCliente.getCellRect(linha, linha, true));
        }
    }

    public void atualizaTabelaFornecedor() {
        //atualiza tabela fornecedor
        listaFornecedor.clear();
        try {
            listaFornecedor.addAll(regraF.getLista());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro;" + ex.getMessage());
        }
        int linha = listaFornecedor.size() - 1;
        if (linha >= 0) {
            tblFornecedor.setRowSelectionInterval(linha, linha);
            tblFornecedor.scrollRectToVisible(tblFornecedor.getCellRect(linha, linha, true));
        }
    }

    private void trataEdicao(boolean editando) {
        //trata edição produto 
        btnCancelarCadastroProd.setEnabled(editando);
        btnSalvarProduto.setEnabled(editando);
        btnEditarProduto.setEnabled(!editando);
        btnExcluirProduto.setEnabled(!editando);
        btnAddProduto.setEnabled(!editando);
        cbxMarca.setEnabled(editando);
        cbxCategoria.setEnabled(editando);
        tblProdutos.setEnabled(!editando);
        txtNome.setEditable(editando);
        txtDesconto.setEditable(editando);
        txtEstoqueMin.setEditable(editando);
        txtTotal.setEditable(editando);
        txtValor.setEditable(editando);
        txtQuantidade.setEditable(editando);

        //trata ediçao cliente
        btnCancelarCliente.setEnabled(editando);
        btnSalvarCliente.setEnabled(editando);
        btnEditarCliente.setEnabled(!editando);
        btnExcluirCliente.setEnabled(!editando);
        btnAddCliente.setEnabled(!editando);
        txtNomeCliente.setEditable(editando);
        txtNascimentoCliente.setEditable(editando);
        txtBairroCliente.setEditable(editando);
        txtRuaCliente.setEditable(editando);
        txtComplementoCliente.setEditable(editando);
        txtCidadeCliente.setEditable(editando);
        txtCpf.setEditable(editando);
        txtRg.setEditable(editando);
        txtCepCliente.setEditable(editando);
        txtCelularCliente.setEditable(editando);
        txtUsuario.setEditable(editando);
        txtEmailCliente.setEditable(editando);
        txtSenha.setEditable(editando);

        //trata ediçao fornecedor
        btnCancelarFornecedor.setEnabled(editando);
        btnSalvarFornecedor.setEnabled(editando);
        btnEditarFornecedor.setEnabled(!editando);
        btnExcluirFornecedor.setEnabled(!editando);
        btnAddFornecedor.setEnabled(!editando);
        txtNomeFornecedor.setEditable(editando);
        txtBairro.setEditable(editando);
        txtRua.setEditable(editando);
        txtComplemento.setEditable(editando);
        txtCidade.setEditable(editando);
        txtCnpj.setEditable(editando);
        txtCep.setEditable(editando);
        txtCelularRepresentante.setEditable(editando);
        txtNomeRepresentante.setEditable(editando);
        txtTelefoneFornecedor.setEditable(editando);

    }

    /**
     * Creates new form TelaAdm
     */
    public TelaPrincipalAdm() {
        initComponents();
        atualizaTabelaProduto();
        atualizaTabelaCliente();
        atualizaTabelaFornecedor();
        trataEdicao(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listaProduto = listaProduto = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Produto>())
        ;
        listaCliente = listaCliente = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Cliente>())
        ;
        listaFornecedor = listaFornecedor = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Fornecedor>());
        addCliente = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        abaListagemCliente = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        abaCadastroCliente = new javax.swing.JPanel();
        acoesCliente = new javax.swing.JPanel();
        btnAddCliente = new javax.swing.JButton();
        btnSalvarCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtCepCliente = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRuaCliente = new javax.swing.JTextField();
        txtCidadeCliente = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cbxUfCliente = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtBairroCliente = new javax.swing.JTextField();
        txtNascimentoCliente = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtComplementoCliente = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel35 = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCelularCliente = new javax.swing.JTextField();
        addFornecedor = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        abasFornecedor = new javax.swing.JTabbedPane();
        abaListagemFornecedor = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFornecedor = new javax.swing.JTable();
        abaCadastroFornecedor = new javax.swing.JPanel();
        acoesFornecedor = new javax.swing.JPanel();
        btnAddFornecedor = new javax.swing.JButton();
        btnSalvarFornecedor = new javax.swing.JButton();
        btnCancelarFornecedor = new javax.swing.JButton();
        btnExcluirFornecedor = new javax.swing.JButton();
        btnEditarFornecedor = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        txtNomeFornecedor = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtNomeRepresentante = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtTelefoneFornecedor = new javax.swing.JTextField();
        txtCelularRepresentante = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        cbxUf = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        addProduto = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        abasProduto = new javax.swing.JTabbedPane();
        abaListagemProduto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        abaCadastrarProduto = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        cbxCategoria = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtEstoqueMin = new javax.swing.JTextField();
        txtEstoqueAtual = new javax.swing.JTextField();
        cbxMarca = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtDesconto = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        acoesProduto = new javax.swing.JPanel();
        btnAddProduto = new javax.swing.JButton();
        btnSalvarProduto = new javax.swing.JButton();
        btnCancelarCadastroProd = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        MenuBarra = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        mnItemCliente = new javax.swing.JMenuItem();
        mnItemFornecedor = new javax.swing.JMenuItem();
        MenuProduto = new javax.swing.JMenu();
        mnItemProduto = new javax.swing.JMenuItem();
        mnItemSair = new javax.swing.JMenu();
        MenuAjuda = new javax.swing.JMenu();
        mnItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        addCliente.setTitle("Cliente");
        addCliente.setVisible(false);
        addCliente.getContentPane().setLayout(new javax.swing.OverlayLayout(addCliente.getContentPane()));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaCliente, tblCliente);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataNascimento}"));
        columnBinding.setColumnName("Data Nascimento");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("Cpf");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rg}"));
        columnBinding.setColumnName("Rg");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rua}"));
        columnBinding.setColumnName("Rua");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${complemento}"));
        columnBinding.setColumnName("Complemento");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bairro}"));
        columnBinding.setColumnName("Bairro");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cidade}"));
        columnBinding.setColumnName("Cidade");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${uf}"));
        columnBinding.setColumnName("Uf");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cep}"));
        columnBinding.setColumnName("Cep");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${celular}"));
        columnBinding.setColumnName("Celular");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(tblCliente);

        javax.swing.GroupLayout abaListagemClienteLayout = new javax.swing.GroupLayout(abaListagemCliente);
        abaListagemCliente.setLayout(abaListagemClienteLayout);
        abaListagemClienteLayout.setHorizontalGroup(
            abaListagemClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        abaListagemClienteLayout.setVerticalGroup(
            abaListagemClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListagemClienteLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listagem", abaListagemCliente);

        acoesCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        acoesCliente.setLayout(new java.awt.GridLayout(1, 0));

        btnAddCliente.setText("Adicionar");
        btnAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClienteActionPerformed(evt);
            }
        });
        acoesCliente.add(btnAddCliente);

        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });
        acoesCliente.add(btnSalvarCliente);

        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });
        acoesCliente.add(btnCancelarCliente);

        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });
        acoesCliente.add(btnExcluirCliente);

        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });
        acoesCliente.add(btnEditarCliente);

        jLabel23.setText("Complemento");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cep}"), txtCepCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel24.setText("Bairro");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cpf}"), txtCpf, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), txtNomeCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel25.setText("Número de Celular");

        jLabel3.setText("Rua");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.rua}"), txtRuaCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cidade}"), txtCidadeCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel27.setText("UF");

        jLabel28.setText("Senha");

        jLabel29.setText("RG");

        cbxUfCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.uf}"), cbxUfCliente, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel30.setText("CEP");

        jLabel31.setText("Nome Completo");

        jLabel32.setText("Cidade");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.usuario}"), txtUsuario, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.bairro}"), txtBairroCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataNascimento}"), txtNascimentoCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel33.setText("Nascimento (dd/mm/aaaa)");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.complemento}"), txtComplementoCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel34.setText("CPF");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.rg}"), txtRg, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.senha}"), txtSenha, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel35.setText("Usuário");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.email}"), txtEmailCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel14.setText("Email");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.celular}"), txtCelularCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout abaCadastroClienteLayout = new javax.swing.GroupLayout(abaCadastroCliente);
        abaCadastroCliente.setLayout(abaCadastroClienteLayout);
        abaCadastroClienteLayout.setHorizontalGroup(
            abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(acoesCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
            .addGroup(abaCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel33))
                    .addGroup(abaCadastroClienteLayout.createSequentialGroup()
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaCadastroClienteLayout.createSequentialGroup()
                        .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(abaCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(171, 171, 171)
                        .addComponent(jLabel23))
                    .addGroup(abaCadastroClienteLayout.createSequentialGroup()
                        .addComponent(txtRuaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtComplementoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel32)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel27)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel30))
                    .addComponent(jLabel25)
                    .addGroup(abaCadastroClienteLayout.createSequentialGroup()
                        .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)))
                    .addGroup(abaCadastroClienteLayout.createSequentialGroup()
                        .addComponent(txtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cbxUfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abaCadastroClienteLayout.setVerticalGroup(
            abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroClienteLayout.createSequentialGroup()
                .addComponent(acoesCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel33))
                .addGap(6, 6, 6)
                .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abaCadastroClienteLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel23))
                .addGap(6, 6, 6)
                .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRuaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplementoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel32)
                    .addComponent(jLabel27)
                    .addComponent(jLabel30))
                .addGap(6, 6, 6)
                .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(4, 4, 4)
                .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", abaCadastroCliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        addCliente.getContentPane().add(jPanel2);

        getContentPane().add(addCliente);

        addFornecedor.setTitle("Fornecedor");
        addFornecedor.setPreferredSize(new java.awt.Dimension(611, 516));
        addFornecedor.setVisible(false);
        addFornecedor.getContentPane().setLayout(new javax.swing.OverlayLayout(addFornecedor.getContentPane()));

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaFornecedor, tblFornecedor);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeEmpresa}"));
        columnBinding.setColumnName("Nome Empresa");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cnpj}"));
        columnBinding.setColumnName("Cnpj");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefoneEmpresa}"));
        columnBinding.setColumnName("Telefone Empresa");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rua}"));
        columnBinding.setColumnName("Rua");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${complemento}"));
        columnBinding.setColumnName("Complemento");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bairro}"));
        columnBinding.setColumnName("Bairro");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cidade}"));
        columnBinding.setColumnName("Cidade");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${uf}"));
        columnBinding.setColumnName("Uf");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cep}"));
        columnBinding.setColumnName("Cep");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${celular}"));
        columnBinding.setColumnName("Celular");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane4.setViewportView(tblFornecedor);

        javax.swing.GroupLayout abaListagemFornecedorLayout = new javax.swing.GroupLayout(abaListagemFornecedor);
        abaListagemFornecedor.setLayout(abaListagemFornecedorLayout);
        abaListagemFornecedorLayout.setHorizontalGroup(
            abaListagemFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        abaListagemFornecedorLayout.setVerticalGroup(
            abaListagemFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListagemFornecedorLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        abasFornecedor.addTab("Listagem", abaListagemFornecedor);

        acoesFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acões"));
        acoesFornecedor.setLayout(new java.awt.GridLayout(1, 0));

        btnAddFornecedor.setText("Adicionar");
        btnAddFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFornecedorActionPerformed(evt);
            }
        });
        acoesFornecedor.add(btnAddFornecedor);

        btnSalvarFornecedor.setText("Salvar");
        btnSalvarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFornecedorActionPerformed(evt);
            }
        });
        acoesFornecedor.add(btnSalvarFornecedor);

        btnCancelarFornecedor.setText("Cancelar");
        btnCancelarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFornecedorActionPerformed(evt);
            }
        });
        acoesFornecedor.add(btnCancelarFornecedor);

        btnExcluirFornecedor.setText("Excluir");
        btnExcluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFornecedorActionPerformed(evt);
            }
        });
        acoesFornecedor.add(btnExcluirFornecedor);

        btnEditarFornecedor.setText("Editar");
        btnEditarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFornecedorActionPerformed(evt);
            }
        });
        acoesFornecedor.add(btnEditarFornecedor);

        jLabel36.setText("Complemento");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cep}"), txtCep, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel37.setText("Bairro");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cnpj}"), txtCnpj, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nomeEmpresa}"), txtNomeFornecedor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel38.setText(" Celular do Representante");

        jLabel13.setText("Rua");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.rua}"), txtRua, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cidade}"), txtCidade, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), txtNomeRepresentante, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel39.setText("Nome do Representante");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.telefoneEmpresa}"), txtTelefoneFornecedor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.celular}"), txtCelularRepresentante, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.complemento}"), txtComplemento, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel40.setText("CNPJ");

        jLabel42.setText("Telefone");

        jLabel43.setText("UF");

        cbxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.uf}"), cbxUf, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel46.setText("CEP");

        jLabel47.setText("Nome");

        jLabel48.setText("Cidade");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.bairro}"), txtBairro, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout abaCadastroFornecedorLayout = new javax.swing.GroupLayout(abaCadastroFornecedor);
        abaCadastroFornecedor.setLayout(abaCadastroFornecedorLayout);
        abaCadastroFornecedorLayout.setHorizontalGroup(
            abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(acoesFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
            .addGroup(abaCadastroFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaCadastroFornecedorLayout.createSequentialGroup()
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaCadastroFornecedorLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel48)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel43)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel46))
                    .addGroup(abaCadastroFornecedorLayout.createSequentialGroup()
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaCadastroFornecedorLayout.createSequentialGroup()
                        .addGroup(abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtNomeRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)
                            .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47))
                        .addGroup(abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abaCadastroFornecedorLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel38)
                                    .addComponent(txtCelularRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36)))
                            .addGroup(abaCadastroFornecedorLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel40)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abaCadastroFornecedorLayout.setVerticalGroup(
            abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroFornecedorLayout.createSequentialGroup()
                .addComponent(acoesFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jLabel42))
                .addGap(6, 6, 6)
                .addGroup(abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelularRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel36))
                .addGap(6, 6, 6)
                .addGroup(abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel48)
                    .addComponent(jLabel43)
                    .addComponent(jLabel46))
                .addGap(6, 6, 6)
                .addGroup(abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 161, Short.MAX_VALUE))
        );

        abasFornecedor.addTab("Cadastro", abaCadastroFornecedor);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abasFornecedor)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abasFornecedor)
        );

        addFornecedor.getContentPane().add(jPanel3);

        getContentPane().add(addFornecedor);

        addProduto.setResizable(true);
        addProduto.setTitle("Produto");
        addProduto.setVisible(false);
        addProduto.getContentPane().setLayout(new javax.swing.OverlayLayout(addProduto.getContentPane()));

        tblProdutos.getTableHeader().setReorderingAllowed(false);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaProduto, tblProdutos);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${marca}"));
        columnBinding.setColumnName("Marca");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${categoria}"));
        columnBinding.setColumnName("Categoria");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoqueMinimo}"));
        columnBinding.setColumnName("Estoque Minimo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoqueAtual}"));
        columnBinding.setColumnName("Estoque Atual");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Float.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${desconto}"));
        columnBinding.setColumnName("Desconto");
        columnBinding.setColumnClass(Float.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorTotal}"));
        columnBinding.setColumnName("Valor Total");
        columnBinding.setColumnClass(Float.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tblProdutos);

        javax.swing.GroupLayout abaListagemProdutoLayout = new javax.swing.GroupLayout(abaListagemProduto);
        abaListagemProduto.setLayout(abaListagemProdutoLayout);
        abaListagemProdutoLayout.setHorizontalGroup(
            abaListagemProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        abaListagemProdutoLayout.setVerticalGroup(
            abaListagemProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        abasProduto.addTab("Listagem", abaListagemProduto);

        jLabel6.setText("Código");

        jLabel5.setText("Nome");

        jLabel7.setText("Marca");

        jLabel8.setText("Categoria");

        jLabel9.setText("Estoque Mínimo");

        txtCodigo.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.codigo}"), txtCodigo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), txtNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Suplemento", " " }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.categoria}"), cbxCategoria, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel10.setText("Estoque Atual");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.estoqueMinimo}"), txtEstoqueMin, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtEstoqueAtual.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.estoqueAtual}"), txtEstoqueAtual, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtEstoqueAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstoqueAtualActionPerformed(evt);
            }
        });

        cbxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adidas", "Nike", "Oxer", "Integral Médica", "Probiótica" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.marca}"), cbxMarca, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        cbxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMarcaActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor R$");

        jLabel2.setText("Desconto (%)");

        jLabel11.setText("Valor Total R$");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.valor}"), txtValor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.desconto}"), txtDesconto, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtTotal.setEditable(false);
        txtTotal.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.valorTotal}"), txtTotal, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel12.setText("Quantidade");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.quantidade}"), txtQuantidade, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        acoesProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        acoesProduto.setLayout(new java.awt.GridLayout(1, 0));

        btnAddProduto.setText("Adicionar");
        btnAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdutoActionPerformed(evt);
            }
        });
        acoesProduto.add(btnAddProduto);

        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });
        acoesProduto.add(btnSalvarProduto);

        btnCancelarCadastroProd.setText("Cancelar");
        btnCancelarCadastroProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroProdActionPerformed(evt);
            }
        });
        acoesProduto.add(btnCancelarCadastroProd);

        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });
        acoesProduto.add(btnExcluirProduto);

        btnEditarProduto.setText("Editar");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });
        acoesProduto.add(btnEditarProduto);

        javax.swing.GroupLayout abaCadastrarProdutoLayout = new javax.swing.GroupLayout(abaCadastrarProduto);
        abaCadastrarProduto.setLayout(abaCadastrarProdutoLayout);
        abaCadastrarProdutoLayout.setHorizontalGroup(
            abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(acoesProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
            .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                                .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(125, 125, 125)
                                .addComponent(jLabel8))
                            .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                                .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel9))
                                .addGap(10, 10, 10)
                                .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel11))
                                    .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))))
                                .addGap(18, 18, 18)
                                .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abaCadastrarProdutoLayout.setVerticalGroup(
            abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                .addComponent(acoesProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(2, 2, 2)
                .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                        .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                        .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel12)))
                        .addGap(6, 6, 6)
                        .addGroup(abaCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(abaCadastrarProdutoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel9)))))
                .addContainerGap())
        );

        abasProduto.addTab("Cadastrar", abaCadastrarProduto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abasProduto)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(abasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        addProduto.getContentPane().add(jPanel1);

        getContentPane().add(addProduto);

        MenuCadastro.setText("Cadastro");

        mnItemCliente.setText("Cliente");
        mnItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemClienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(mnItemCliente);

        mnItemFornecedor.setText("Fornecedor");
        mnItemFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemFornecedorActionPerformed(evt);
            }
        });
        MenuCadastro.add(mnItemFornecedor);

        MenuBarra.add(MenuCadastro);

        MenuProduto.setText("Produto");

        mnItemProduto.setText("Cadastro/Estoque");
        mnItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemProdutoActionPerformed(evt);
            }
        });
        MenuProduto.add(mnItemProduto);

        MenuBarra.add(MenuProduto);

        mnItemSair.setText("Sair");
        mnItemSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnItemSairMouseClicked(evt);
            }
        });
        MenuBarra.add(mnItemSair);

        MenuAjuda.setText("Ajuda");

        mnItemSobre.setText("Sobre");
        MenuAjuda.add(mnItemSobre);

        MenuBarra.add(MenuAjuda);

        setJMenuBar(MenuBarra);

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemClienteActionPerformed
        addCliente.setVisible(true);
        addFornecedor.setVisible(false);
        addProduto.setVisible(false);
    }//GEN-LAST:event_mnItemClienteActionPerformed

    private void mnItemFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemFornecedorActionPerformed
        addFornecedor.setVisible(true);
        addCliente.setVisible(false);
        addProduto.setVisible(false);
    }//GEN-LAST:event_mnItemFornecedorActionPerformed

    private void mnItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemProdutoActionPerformed
        addProduto.setVisible(true);
        addCliente.setVisible(false);
        addFornecedor.setVisible(false);
    }//GEN-LAST:event_mnItemProdutoActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        RegraProduto regra = new RegraProduto();
        int linhaSelecionada = tblProdutos.getSelectedRow();
        Produto obj = listaProduto.get(linhaSelecionada);
        regra.calculaValorTotal(obj);
        regra.somaEstoque(obj);
        try {
            regra.salvarProduto(obj);
            if(obj.getCodigo() == null){
                JOptionPane.showMessageDialog(null, "Produto Cadastrado com êxito");
            }else{
                JOptionPane.showMessageDialog(null, "Produto Alterado com êxito");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        }
        trataEdicao(false);
        atualizaTabelaProduto();


    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void cbxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMarcaActionPerformed

    private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed
        listaProduto.add((Produto) new Produto());
        int linha = listaProduto.size() - 1;
        tblProdutos.setRowSelectionInterval(linha, linha);
        trataEdicao(true);
        txtNome.requestFocus();
    }//GEN-LAST:event_btnAddProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        int opcao
                = JOptionPane.showOptionDialog(null,
                        "Confirma a exclusão?",
                        "Pergunta",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null,
                        new String[]{"Sim", "Não"}, "Sim");
        if (opcao == 0) {
            int linhaSelecionada = tblProdutos.getSelectedRow();
            Produto obj = listaProduto.get(linhaSelecionada);
            try {
                regra.removerProduto(obj);
                JOptionPane.showMessageDialog(null, "Produto deletado com êxito");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro");
            }
            atualizaTabelaProduto();
        }
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        trataEdicao(true);
        txtQuantidade.setText("0");
        txtNome.requestFocus();

    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnCancelarCadastroProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroProdActionPerformed
        trataEdicao(false);
        atualizaTabelaProduto();
    }//GEN-LAST:event_btnCancelarCadastroProdActionPerformed

    private void mnItemSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnItemSairMouseClicked
        dispose();
        TelaLogin tela = new TelaLogin(this, true);
        tela.setVisible(true);
    }//GEN-LAST:event_mnItemSairMouseClicked

    private void btnAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClienteActionPerformed
        listaCliente.add((Cliente) new Cliente());
        int linha = listaCliente.size() - 1;
        tblCliente.setRowSelectionInterval(linha, linha);
        trataEdicao(true);
        txtNomeCliente.requestFocus();
    }//GEN-LAST:event_btnAddClienteActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        int linhaSelecionada = tblCliente.getSelectedRow();
        Cliente obj = listaCliente.get(linhaSelecionada);
        try {
            regraC.salvarCliente(obj);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        }
        trataEdicao(false);
        atualizaTabelaCliente();
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        int opcao
                = JOptionPane.showOptionDialog(null,
                        "Confirma a exclusão?",
                        "Pergunta",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null,
                        new String[]{"Sim", "Não"}, "Sim");
        if (opcao == 0) {
            int linhaSelecionada = tblCliente.getSelectedRow();
            Cliente obj = listaCliente.get(linhaSelecionada);
            try {
                regraC.removerCliente(obj);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro");
            }
            atualizaTabelaCliente();
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        trataEdicao(true);
        txtNomeCliente.requestFocus();
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        trataEdicao(false);
        atualizaTabelaCliente();
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

    private void btnAddFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFornecedorActionPerformed
        listaFornecedor.add((Fornecedor) new Fornecedor());
        int linha = listaFornecedor.size() - 1;
        tblFornecedor.setRowSelectionInterval(linha, linha);
        trataEdicao(true);
        txtNomeFornecedor.requestFocus();
    }//GEN-LAST:event_btnAddFornecedorActionPerformed

    private void btnSalvarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFornecedorActionPerformed
        int linhaSelecionada = tblFornecedor.getSelectedRow();
        Fornecedor obj = listaFornecedor.get(linhaSelecionada);
        try {
            regraF.salvarFornecedor(obj);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        }
        trataEdicao(false);
        atualizaTabelaFornecedor();
    }//GEN-LAST:event_btnSalvarFornecedorActionPerformed

    private void btnCancelarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFornecedorActionPerformed
        trataEdicao(false);
        atualizaTabelaFornecedor();
    }//GEN-LAST:event_btnCancelarFornecedorActionPerformed

    private void btnEditarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFornecedorActionPerformed
        trataEdicao(true);
        txtNomeFornecedor.requestFocus();
    }//GEN-LAST:event_btnEditarFornecedorActionPerformed

    private void btnExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFornecedorActionPerformed
        int opcao
                = JOptionPane.showOptionDialog(null,
                        "Confirma a exclusão?",
                        "Pergunta",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null,
                        new String[]{"Sim", "Não"}, "Sim");
        if (opcao == 0) {
            int linhaSelecionada = tblFornecedor.getSelectedRow();
            Fornecedor obj = listaFornecedor.get(linhaSelecionada);
            try {
                regraF.removerFornecedor(obj);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro");
            }
            atualizaTabelaFornecedor();
        }
    }//GEN-LAST:event_btnExcluirFornecedorActionPerformed

    private void txtEstoqueAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstoqueAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstoqueAtualActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenuBar MenuBarra;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenu MenuProduto;
    private javax.swing.JPanel abaCadastrarProduto;
    private javax.swing.JPanel abaCadastroCliente;
    private javax.swing.JPanel abaCadastroFornecedor;
    private javax.swing.JPanel abaListagemCliente;
    private javax.swing.JPanel abaListagemFornecedor;
    private javax.swing.JPanel abaListagemProduto;
    private javax.swing.JTabbedPane abasFornecedor;
    private javax.swing.JTabbedPane abasProduto;
    private javax.swing.JPanel acoesCliente;
    private javax.swing.JPanel acoesFornecedor;
    private javax.swing.JPanel acoesProduto;
    private javax.swing.JInternalFrame addCliente;
    private javax.swing.JInternalFrame addFornecedor;
    private javax.swing.JInternalFrame addProduto;
    private javax.swing.JButton btnAddCliente;
    private javax.swing.JButton btnAddFornecedor;
    private javax.swing.JButton btnAddProduto;
    private javax.swing.JButton btnCancelarCadastroProd;
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnCancelarFornecedor;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarFornecedor;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnExcluirFornecedor;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JButton btnSalvarFornecedor;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxMarca;
    private javax.swing.JComboBox<String> cbxUf;
    private javax.swing.JComboBox<String> cbxUfCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.util.List<Cliente> listaCliente;
    private java.util.List<Fornecedor> listaFornecedor;
    private java.util.List<Produto> listaProduto;
    private javax.swing.JMenuItem mnItemCliente;
    private javax.swing.JMenuItem mnItemFornecedor;
    private javax.swing.JMenuItem mnItemProduto;
    private javax.swing.JMenu mnItemSair;
    private javax.swing.JMenuItem mnItemSobre;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTable tblFornecedor;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBairroCliente;
    private javax.swing.JTextField txtCelularCliente;
    private javax.swing.JTextField txtCelularRepresentante;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCepCliente;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCidadeCliente;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtComplementoCliente;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEstoqueAtual;
    private javax.swing.JTextField txtEstoqueMin;
    private javax.swing.JTextField txtNascimentoCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeFornecedor;
    private javax.swing.JTextField txtNomeRepresentante;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtRuaCliente;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefoneFornecedor;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtValor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
