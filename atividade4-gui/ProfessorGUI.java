public class ProfessorGUI extends FuncionarioGUI {
    private String titulo;
    
    public ProfessorGUI(String nome, String fone, String cpf, int cod, String funcao, String titulo) {
        super(nome, fone, cpf, cod, funcao);
        this.titulo = titulo;
    }
    
    public String getTitulo() { return titulo; }
    
    @Override
    public String saudacao() {
        return "Olá! Sou o professor " + getNome() + " (" + titulo + ")";
    }
    
    public String ensinar() {
        return "Professor " + getNome() + " está ensinando!";
    }
    
    public String turma() {
        return "Professor " + getNome() + " formou uma turma!";
    }
}
