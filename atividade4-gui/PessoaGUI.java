public class PessoaGUI {
    private String nome;
    private String fone;
    private String cpf;
    
    public PessoaGUI(String nome, String fone, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
    }
    
    public String getNome() { return nome; }
    public String getFone() { return fone; }
    public String getCpf() { return cpf; }
    
    public String saudacao() {
        return "Olá! Eu sou " + nome;
    }
}
