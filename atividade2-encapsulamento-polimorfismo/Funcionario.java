public class Funcionario extends Pessoa {
    private int cod;
    private String funcao;
    private String desempenho;  // privado (encapsulado)
    
    public Funcionario(String nome, String fone, String cpf, int cod, String funcao) {
        super(nome, fone, cpf);
        this.cod = cod;
        this.funcao = funcao;
    }
    
    public int getCod() { return cod; }
    public void setCod(int cod) { this.cod = cod; }
    public String getFuncao() { return funcao; }
    public void setFuncao(String funcao) { this.funcao = funcao; }
    public String getDesempenho() { return desempenho; }
    public void setDesempenho(String desempenho) { this.desempenho = desempenho; }
    
    @Override
    public void saudacao() {
        System.out.println("Olá! Sou o funcionário " + getNome() + " (" + funcao + ")");
    }
}
