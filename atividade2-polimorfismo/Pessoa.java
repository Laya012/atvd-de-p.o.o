public class Pessoa {
    // Atributos privados (ENCAPSULAMENTO)
    private String nome;
    private String fone;
    private String cpf;
    private String duvidao;
    
    // Construtor
    public Pessoa(String nome, String fone, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
    }
    
    // Getters e Setters (ENCAPSULAMENTO)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getFone() { return fone; }
    public void setFone(String fone) { this.fone = fone; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getDuvidao() { return duvidao; }
    public void setDuvidao(String duvidao) { this.duvidao = duvidao; }
    
    // Método saudacao (POLIMORFISMO - será sobrescrito)
    public void saudacao() {
        System.out.println("Olá! Meu nome é " + nome);
    }
}
