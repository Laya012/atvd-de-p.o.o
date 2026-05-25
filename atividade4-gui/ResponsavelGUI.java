public class ResponsavelGUI extends PessoaGUI {
    private AlunoGUI aluno;
    
    public ResponsavelGUI(String nome, String fone, String cpf, AlunoGUI aluno) {
        super(nome, fone, cpf);
        this.aluno = aluno;
    }
    
    public AlunoGUI getAluno() { return aluno; }
    
    @Override
    public String saudacao() {
        return "Olá! Sou o responsável " + getNome() + " pelo aluno " + aluno.getNome();
    }
}
