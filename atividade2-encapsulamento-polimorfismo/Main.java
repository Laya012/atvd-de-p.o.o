public class Main {
    public static void main(String[] args) {
        System.out.println("=== ATIVIDADE 2 - ENCAPSULAMENTO E POLIMORFISMO ===\n");
        
        Aluno aluno = new Aluno("João Silva", "119999999", "123456789", "MTB001");
        Professor prof = new Professor("Maria Santos", "118888888", "987654321", 1, "Docente", "Doutora");
        Funcionario func = new Funcionario("Carlos Souza", "117777777", "456789123", 2, "Secretário");
        Responsavel resp = new Responsavel("Ana Oliveira", "116666666", "789123456", aluno);
        
        // Testando polimorfismo - cada um tem saudacao DIFERENTE
        System.out.println("--- SAUDAÇÕES POLIMÓRFICAS ---");
        aluno.saudacao();
        prof.saudacao();
        func.saudacao();
        resp.saudacao();
        
        System.out.println("\n--- COMPORTAMENTOS ESPECÍFICOS ---");
        aluno.aprender();
        aluno.agende();
        prof.ensinar();
        prof.turma();
        resp.acompanhar();
        
        System.out.println("\n--- ENCAPSULAMENTO ---");
        func.setDesempenho("Excelente");
        System.out.println("Desempenho do funcionário: " + func.getDesempenho());
        
        System.out.println("\n--- RELAÇÃO RESPONSÁVEL-ALUNO ---");
        System.out.println(resp.getNome() + " é responsável por " + resp.getAluno().getNome());
    }
}
