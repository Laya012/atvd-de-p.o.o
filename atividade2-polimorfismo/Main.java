public class Main {
    public static void main(String[] args) {
        System.out.println("=== ATIVIDADE 2 - ENCAPSULAMENTO E POLIMORFISMO ===\n");
        
        // Criando objetos
        Aluno aluno = new Aluno("João", "119999999", "123456789", "MTB001");
        Professor prof = new Professor("Maria", "118888888", "987654321", 123, "Titular", "Doutora");
        Funcionario func = new Funcionario("Carlos", "117777777", "111222333", 456, "Secretário");
        
        // TESTANDO POLIMORFISMO - mesmo método, comportamentos diferentes
        System.out.println("--- SAUDAÇÕES (polimorfismo) ---");
        aluno.saudacao();
        prof.saudacao();
        func.saudacao();
        
        System.out.println("\n--- MÉTODO APRENDER (aluno) ---");
        aluno.aprender();
        aluno.aprender("Encapsulamento");
        
        System.out.println("\n--- MÉTODO ENSINAR (professor) ---");
        prof.ensinar();
        prof.ensinar("Polimorfismo");
        
        System.out.println("\n--- ENCAPSULAMENTO (acessando via getters) ---");
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("CPF do aluno: " + aluno.getCpf());
        System.out.println("Matrícula: " + aluno.getMtb());
        
        // Modificando via setters
        aluno.setFone("11999998888");
        System.out.println("Telefone atualizado: " + aluno.getFone());
        
        func.setDesempenho("Excelente");
        System.out.println("Desempenho do funcionário: " + func.getDesempenho());
    }
}
