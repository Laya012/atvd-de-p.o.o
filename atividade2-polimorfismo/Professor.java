public class Professor extends Funcionario {
    private String titulo;  // encapsulamento
    
    public Professor(String nome, String fone, String cpf, int cod, String funcao, String titulo) {
        super(nome, fone, cpf, cod, funcao);
        this.titulo = titulo;
    }
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public void turma() {
        System.out.println("Professor " + getNome() + " está com turma");
    }
    
    // Método ensinar (polimorfismo)
    public void ensinar() {
        System.out.println("👨‍🏫 Professor " + getNome() + " está ensinando Encapsulamento e Polimorfismo!");
    }
    
    // Sobrecarga
    public void ensinar(String materia) {
        System.out.println("👨‍🏫 Professor " + getNome() + " está ensinando: " + materia);
    }
    
    // SOBRESCRITA
    @Override
    public void saudacao() {
        System.out.println("👋 Olá! Sou o professor " + getNome() + ", " + titulo + ". Vamos aprender!");
    }
}
