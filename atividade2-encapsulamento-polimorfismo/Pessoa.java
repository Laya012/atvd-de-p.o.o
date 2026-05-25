public class Pessoa {
    private String nome;  // agora private (encapsulado)
    private String fone;
    private String cpf;
    private String duvidao;
    
    public Pessoa(String nome, String fone, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
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
    
    // Método com polimorfismo (comportamento diferente para cada tipo)
    public void saudacao() {
        System.out.println("Olá! Eu sou " + nome);
    }
}
