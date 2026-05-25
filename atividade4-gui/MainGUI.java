import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI extends JFrame {
    private JTextField txtNome, txtFone, txtCpf, txtMtb, txtCod, txtFuncao, txtTitulo, txtDesempenho;
    private JTextArea areaResultado;
    private JComboBox<String> comboTipo;
    
    public MainGUI() {
        setTitle("Atividade 4 - Sistema Escolar GUI");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        criarInterface();
    }
    
    private void criarInterface() {
        JPanel painelForm = new JPanel(new GridLayout(9, 2, 10, 10));
        painelForm.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        painelForm.add(new JLabel("Tipo:"));
        comboTipo = new JComboBox<>(new String[]{"Aluno", "Professor", "Funcionario", "Responsavel"});
        painelForm.add(comboTipo);
        
        painelForm.add(new JLabel("Nome:"));
        txtNome = new JTextField();
        painelForm.add(txtNome);
        
        painelForm.add(new JLabel("Telefone:"));
        txtFone = new JTextField();
        painelForm.add(txtFone);
        
        painelForm.add(new JLabel("CPF:"));
        txtCpf = new JTextField();
        painelForm.add(txtCpf);
        
        painelForm.add(new JLabel("MTB (Aluno):"));
        txtMtb = new JTextField();
        painelForm.add(txtMtb);
        
        painelForm.add(new JLabel("Código:"));
        txtCod = new JTextField();
        painelForm.add(txtCod);
        
        painelForm.add(new JLabel("Função:"));
        txtFuncao = new JTextField();
        painelForm.add(txtFuncao);
        
        painelForm.add(new JLabel("Título (Professor):"));
        txtTitulo = new JTextField();
        painelForm.add(txtTitulo);
        
        painelForm.add(new JLabel("Desempenho:"));
        txtDesempenho = new JTextField();
        painelForm.add(txtDesempenho);
        
        JPanel painelBotoes = new JPanel();
        JButton btnSalvar = new JButton("Salvar");
        JButton btnLimpar = new JButton("Limpar");
        JButton btnSair = new JButton("Sair");
        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnSair);
        
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaResultado);
        scroll.setBorder(BorderFactory.createTitledBorder("Resultado"));
        
        add(painelForm, BorderLayout.NORTH);
        add(painelBotoes, BorderLayout.CENTER);
        add(scroll, BorderLayout.SOUTH);
        
        btnSalvar.addActionListener(e -> salvar());
        btnLimpar.addActionListener(e -> limpar());
        btnSair.addActionListener(e -> System.exit(0));
    }
    
    private void salvar() {
        try {
            String tipo = (String) comboTipo.getSelectedItem();
            String nome = txtNome.getText();
            String fone = txtFone.getText();
            String cpf = txtCpf.getText();
            
            if (nome.isEmpty() || fone.isEmpty() || cpf.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha Nome, Telefone e CPF!");
                return;
            }
            
            areaResultado.setText("");
            
            switch(tipo) {
                case "Aluno":
                    String mtb = txtMtb.getText();
                    if (mtb.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Preencha o MTB!");
                        return;
                    }
                    AlunoGUI aluno = new AlunoGUI(nome, fone, cpf, mtb);
                    areaResultado.append(aluno.saudacao() + "\n");
                    areaResultado.append(aluno.aprender() + "\n");
                    areaResultado.append(aluno.agende() + "\n");
                    break;
                    
                case "Professor":
                    int cod = Integer.parseInt(txtCod.getText());
                    String funcao = txtFuncao.getText();
                    String titulo = txtTitulo.getText();
                    ProfessorGUI prof = new ProfessorGUI(nome, fone, cpf, cod, funcao, titulo);
                    areaResultado.append(prof.saudacao() + "\n");
                    areaResultado.append(prof.ensinar() + "\n");
                    areaResultado.append(prof.turma() + "\n");
                    break;
                    
                case "Funcionario":
                    int codF = Integer.parseInt(txtCod.getText());
                    String funcaoF = txtFuncao.getText();
                    String desempenho = txtDesempenho.getText();
                    FuncionarioGUI func = new FuncionarioGUI(nome, fone, cpf, codF, funcaoF);
                    func.setDesempenho(desempenho);
                    areaResultado.append(func.saudacao() + "\n");
                    areaResultado.append("Desempenho: " + func.getDesempenho() + "\n");
                    break;
                    
                case "Responsavel":
                    String mtbResp = txtMtb.getText();
                    AlunoGUI alunoResp = new AlunoGUI("Vinculado", "", "", mtbResp);
                    ResponsavelGUI resp = new ResponsavelGUI(nome, fone, cpf, alunoResp);
                    areaResultado.append(resp.saudacao() + "\n");
                    break;
            }
            
            areaResultado.append("\n✅ Cadastro realizado!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }
    
    private void limpar() {
        txtNome.setText("");
        txtFone.setText("");
        txtCpf.setText("");
        txtMtb.setText("");
        txtCod.setText("");
        txtFuncao.setText("");
        txtTitulo.setText("");
        txtDesempenho.setText("");
        areaResultado.setText("");
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainGUI().setVisible(true));
    }
}
