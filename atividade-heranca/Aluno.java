public class Aluno extends Pessoa {
    protected String mtb;
    
    public Aluno(String nome, String fone, String cpf, String mtb) {
        super(nome, fone, cpf);
        this.mtb = mtb;
    }
    
    public void agende() {
        System.out.println(nome + " está agendando...");
    }
    
    public void aprender() {
        System.out.println(nome + " está aprendendo!");
    }
    
    public String getMtb() { return mtb; }
    public void setMtb(String mtb) { this.mtb = mtb; }
}
