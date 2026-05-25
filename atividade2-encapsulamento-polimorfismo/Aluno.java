public class Aluno extends Pessoa {
    private String mtb;
    
    public Aluno(String nome, String fone, String cpf, String mtb) {
        super(nome, fone, cpf);
        this.mtb = mtb;
    }
    
    public String getMtb() { return mtb; }
    public void setMtb(String mtb) { this.mtb = mtb; }
    
    @Override
    public void saudacao() {
        System.out.println("Oi! Sou o aluno " + getNome() + " e vou aprender!");
    }
    
    public void aprender() {
        System.out.println(getNome() + " está aprendendo POO!");
    }
    
    public void agende() {
        System.out.println(getNome() + " agendou uma aula!");
    }
}
