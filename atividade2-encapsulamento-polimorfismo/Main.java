public class Main {
    public static void main(String[] args) {
        System.out.println("=== ATIVIDADE 2 - ENCAPSULAMENTO E POLIMORFISMO ===\n");
        
        Aluno aluno = new Aluno("João", "119999", "123", "MTB001");
        Professor prof = new Professor("Maria", "118888", "456", 1, "Docente", "Doutora");
        Funcionario func = new Funcionario("Carlos", "117777", "789", 2, "Secretário");
        
        // Testando polimorfismo - cada um tem saudacao DIFERENTE
        System.out.println("--- SAUDAÇÕES POLIMÓRFICAS ---");
        aluno.saudacao();
        prof.saudacao();
        func.saudacao();
        
        System.out.println("\n--- COMPORTAMENTOS ESPECÍFICOS ---");
        aluno.aprender();
        aluno.agende();
        prof.ensinar();
        prof.turma();
        
        System.out.println("\n--- ENCAPSULAMENTO ---");
        func.setDesempenho("Excelente");
        System.out.println("Desempenho do funcionário: " + func.getDesempenho());
    }
}
