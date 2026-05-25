public class Responsavel extends Pessoa {
    private Aluno aluno;
    
    public Responsavel(String nome, String fone, String cpf, Aluno aluno) {
        super(nome, fone, cpf);
        this.aluno = aluno;
    }
    
    public Aluno getAluno() {
        return aluno;
    }
    
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    @Override
    public void saudacao() {
        System.out.println("Olá! Sou o responsável " + getNome() + " pelo aluno " + aluno.getNome());
    }
    
    public void acompanhar() {
        System.out.println(getNome() + " está acompanhando o aluno " + aluno.getNome());
    }
}
