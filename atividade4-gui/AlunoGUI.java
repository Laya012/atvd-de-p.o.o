public class AlunoGUI extends PessoaGUI {
    private String mtb;
    
    public AlunoGUI(String nome, String fone, String cpf, String mtb) {
        super(nome, fone, cpf);
        this.mtb = mtb;
    }
    
    public String getMtb() { return mtb; }
    
    @Override
    public String saudacao() {
        return "Oi! Sou o aluno " + getNome() + " (MTB: " + mtb + ")";
    }
    
    public String aprender() {
        return getNome() + " está aprendendo POO!";
    }
    
    public String agende() {
        return getNome() + " agendou uma aula!";
    }
}
