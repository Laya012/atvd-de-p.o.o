public class Professor extends Funcionario {
    private String titulo;
    
    public Professor(String nome, String fone, String cpf, int cod, String funcao, String titulo) {
        super(nome, fone, cpf, cod, funcao);
        this.titulo = titulo;
    }
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    @Override
    public void saudacao() {
        System.out.println("Olá! Sou o professor " + getNome() + " e vou ensinar!");
    }
    
    public void ensinar() {
        System.out.println("Professor " + getNome() + " está ensinando!");
    }
    
    public void turma() {
        System.out.println("Professor " + getNome() + " formou uma turma!");
    }
}
