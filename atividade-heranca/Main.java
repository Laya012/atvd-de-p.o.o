public class Main {
    public static void main(String[] args) {
        // Testando Pessoa com saudacao
        Pessoa p = new Pessoa("Ana", "119999999", "123456789");
        p.saudacao();
        
        // Testando Aluno
        Aluno aluno = new Aluno("João", "118888888", "987654321", "MTB001");
        aluno.saudacao();
        aluno.aprender();
        aluno.agende();
        
        // Testando Professor
        Professor prof = new Professor("Maria", "117777777", "111222333", 123, "Titular", "Doutora");
        prof.saudacao();
        prof.ensinar();
        prof.turma();
        
        // Testando Funcionario
        Funcionario func = new Funcionario("Carlos", "116666666", "444555666", 456, "Secretario");
        func.setDesempenho("Excelente");
        func.saudacao();
        System.out.println("Desempenho: " + func.getDesempenho());
        
        // Testando Responsavel
        Responsavel resp = new Responsavel("Mariana", "115555555", "777888999", aluno);
        resp.saudacao();
        System.out.println("Responsavel por: " + resp.getAluno().getNome());
    }
}
