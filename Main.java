public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "119999999", "123456789", "MTB001");
        aluno.agende();
        
        Professor prof = new Professor("Maria", "118888888", "987654321", "MTB002", "Doutora");
        prof.turma();
        
        System.out.println("Sistema funcionando!");
    }
}
