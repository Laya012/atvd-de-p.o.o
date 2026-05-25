public class Aluno extends Pessoa {
    private String mtb;  // encapsulamento
    
    public Aluno(String nome, String fone, String cpf, String mtb) {
        super(nome, fone, cpf);
        this.mtb = mtb;
    }
    
    // Getter e Setter
    public String getMtb() { return mtb; }
    public void setMtb(String mtb) { this.mtb = mtb; }
    
    public void agende() {
        System.out.println("Aluno " + getNome() + " está agendando...");
    }
    
    // POLIMORFISMO - método aprender com comportamento diferente
    public void aprender() {
        System.out.println("📚 Aluno " + getNome() + " está aprendendo POO!");
    }
    
    // Sobrecarga do método aprender (polimorfismo)
    public void aprender(String assunto) {
        System.out.println("📚 Aluno " + getNome() + " está aprendendo: " + assunto);
    }
    
    // SOBRESCRITA do método saudacao (polimorfismo)
    @Override
    public void saudacao() {
        System.out.println("🎓 Olá! Sou o aluno " + getNome() + " e estou pronto para aprender!");
    }
}
