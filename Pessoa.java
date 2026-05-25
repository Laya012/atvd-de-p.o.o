public class Pessoa {
    protected String nome;
    protected String fone;
    protected String cpf;
    protected String duvidao;
    
    public Pessoa(String nome, String fone, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
    }
    
    public void saudacao() {
        System.out.println("Olá, meu nome é " + nome);
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getFone() { return fone; }
    public void setFone(String fone) { this.fone = fone; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getDuvidao() { return duvidao; }
    public void setDuvidao(String duvidao) { this.duvidao = duvidao; }
}
