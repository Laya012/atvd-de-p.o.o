public class FuncionarioGUI extends PessoaGUI {
    private int cod;
    private String funcao;
    private String desempenho;
    
    public FuncionarioGUI(String nome, String fone, String cpf, int cod, String funcao) {
        super(nome, fone, cpf);
        this.cod = cod;
        this.funcao = funcao;
    }
    
    public int getCod() { return cod; }
    public String getFuncao() { return funcao; }
    public String getDesempenho() { return desempenho; }
    public void setDesempenho(String desempenho) { this.desempenho = desempenho; }
    
    @Override
    public String saudacao() {
        return "Olá! Sou o funcionário " + getNome() + " (" + funcao + ")";
    }
}
