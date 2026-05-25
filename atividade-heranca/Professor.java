public class Professor extends Funcionario {
    private String titulo;
    
    public Professor(String nome, String fone, String cpf, int cod, String funcao, String titulo) {
        super(nome, fone, cpf, cod, funcao);
        this.titulo = titulo;
    }
    
    public void turma() {
        System.out.println("Professor " + nome + " está com turma");
    }
    
    public void ensinar() {
        System.out.println("Professor " + nome + " está ensinando!");
    }
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
}
