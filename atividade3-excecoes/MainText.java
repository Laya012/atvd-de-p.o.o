import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MainText {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== ATIVIDADE 3 - TRATAMENTO DE EXCEÇÕES ===");
        System.out.println("Sistema Escolar - Versão Texto\n");
        
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Cadastrar Funcionario");
            System.out.println("4 - Cadastrar Responsavel");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                int opcao = Integer.parseInt(scanner.nextLine());
                
                switch (opcao) {
                    case 1:
                        cadastrarAluno();
                        break;
                    case 2:
                        cadastrarProfessor();
                        break;
                    case 3:
                        cadastrarFuncionario();
                        break;
                    case 4:
                        cadastrarResponsavel();
                        break;
                    case 5:
                        continuar = false;
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida! Escolha 1 a 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ ERRO: Digite um número válido!");
            } catch (Exception e) {
                System.out.println("❌ ERRO: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
    
    private static String validarTexto(String valor, String campo) throws Exception {
        if (valor == null || valor.trim().isEmpty()) {
            throw new Exception(campo + " não pode estar vazio!");
        }
        if (!valor.matches("[a-zA-ZÀ-ÿ0-9\\s]+")) {
            throw new Exception(campo + " deve conter apenas letras e números!");
        }
        return valor.trim();
    }
    
    private static int validarInteiro(String valor, String campo) throws Exception {
        try {
            int num = Integer.parseInt(valor);
            if (num <= 0) {
                throw new Exception(campo + " deve ser maior que zero!");
            }
            return num;
        } catch (NumberFormatException e) {
            throw new Exception(campo + " deve ser um número inteiro válido!");
        }
    }
    
    private static LocalDate validarData(String valor) throws Exception {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(valor, formatter);
            
            if (data.isAfter(LocalDate.now())) {
                throw new Exception("Data não pode ser futura!");
            }
            return data;
        } catch (DateTimeParseException e) {
            throw new Exception("Data inválida! Use o formato DD/MM/AAAA");
        }
    }
    
    private static void cadastrarAluno() {
        try {
            System.out.println("\n--- CADASTRO DE ALUNO ---");
            
            System.out.print("Nome: ");
            String nome = validarTexto(scanner.nextLine(), "Nome");
            
            System.out.print("Telefone: ");
            String fone = validarTexto(scanner.nextLine(), "Telefone");
            
            System.out.print("CPF: ");
            String cpf = validarTexto(scanner.nextLine(), "CPF");
            
            System.out.print("MTB (Matrícula): ");
            String mtb = validarTexto(scanner.nextLine(), "MTB");
            
            System.out.print("Data de Nascimento (DD/MM/AAAA): ");
            LocalDate dataNasc = validarData(scanner.nextLine());
            
            AlunoGUI aluno = new AlunoGUI(nome, fone, cpf, mtb);
            
            System.out.println("\n✅ CADASTRO REALIZADO COM SUCESSO!");
            System.out.println("==================================");
            System.out.println(aluno.saudacao());
            System.out.println(aluno.aprender());
            System.out.println(aluno.agende());
            System.out.println("Data de Nascimento: " + dataNasc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println("==================================");
            
        } catch (Exception e) {
            System.out.println("❌ ERRO AO CADASTRAR ALUNO: " + e.getMessage());
        }
    }
    
    private static void cadastrarProfessor() {
        try {
            System.out.println("\n--- CADASTRO DE PROFESSOR ---");
            
            System.out.print("Nome: ");
            String nome = validarTexto(scanner.nextLine(), "Nome");
            
            System.out.print("Telefone: ");
            String fone = validarTexto(scanner.nextLine(), "Telefone");
            
            System.out.print("CPF: ");
            String cpf = validarTexto(scanner.nextLine(), "CPF");
            
            System.out.print("Código: ");
            int cod = validarInteiro(scanner.nextLine(), "Código");
            
            System.out.print("Função: ");
            String funcao = validarTexto(scanner.nextLine(), "Função");
            
            System.out.print("Título (Mestre/Doutor/Especialista): ");
            String titulo = validarTexto(scanner.nextLine(), "Título");
            
            System.out.print("Data de Admissão (DD/MM/AAAA): ");
            LocalDate dataAdmissao = validarData(scanner.nextLine());
            
            ProfessorGUI prof = new ProfessorGUI(nome, fone, cpf, cod, funcao, titulo);
            
            System.out.println("\n✅ CADASTRO REALIZADO COM SUCESSO!");
            System.out.println("==================================");
            System.out.println(prof.saudacao());
            System.out.println(prof.ensinar());
            System.out.println(prof.turma());
            System.out.println("Data de Admissão: " + dataAdmissao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println("==================================");
            
        } catch (Exception e) {
            System.out.println("❌ ERRO AO CADASTRAR PROFESSOR: " + e.getMessage());
        }
    }
    
    private static void cadastrarFuncionario() {
        try {
            System.out.println("\n--- CADASTRO DE FUNCIONÁRIO ---");
            
            System.out.print("Nome: ");
            String nome = validarTexto(scanner.nextLine(), "Nome");
            
            System.out.print("Telefone: ");
            String fone = validarTexto(scanner.nextLine(), "Telefone");
            
            System.out.print("CPF: ");
            String cpf = validarTexto(scanner.nextLine(), "CPF");
            
            System.out.print("Código: ");
            int cod = validarInteiro(scanner.nextLine(), "Código");
            
            System.out.print("Função: ");
            String funcao = validarTexto(scanner.nextLine(), "Função");
            
            System.out.print("Desempenho (Excelente/Bom/Regular): ");
            String desempenho = validarTexto(scanner.nextLine(), "Desempenho");
            
            FuncionarioGUI func = new FuncionarioGUI(nome, fone, cpf, cod, funcao);
            func.setDesempenho(desempenho);
            
            System.out.println("\n✅ CADASTRO REALIZADO COM SUCESSO!");
            System.out.println("==================================");
            System.out.println(func.saudacao());
            System.out.println("Desempenho: " + func.getDesempenho());
            System.out.println("==================================");
            
        } catch (Exception e) {
            System.out.println("❌ ERRO AO CADASTRAR FUNCIONÁRIO: " + e.getMessage());
        }
    }
    
    private static void cadastrarResponsavel() {
        try {
            System.out.println("\n--- CADASTRO DE RESPONSÁVEL ---");
            
            System.out.print("Nome do Responsável: ");
            String nome = validarTexto(scanner.nextLine(), "Nome");
            
            System.out.print("Telefone: ");
            String fone = validarTexto(scanner.nextLine(), "Telefone");
            
            System.out.print("CPF: ");
            String cpf = validarTexto(scanner.nextLine(), "CPF");
            
            System.out.print("Nome do Aluno: ");
            String nomeAluno = validarTexto(scanner.nextLine(), "Nome do Aluno");
            
            System.out.print("MTB do Aluno: ");
            String mtbAluno = validarTexto(scanner.nextLine(), "MTB do Aluno");
            
            AlunoGUI aluno = new AlunoGUI(nomeAluno, "", "", mtbAluno);
            ResponsavelGUI resp = new ResponsavelGUI(nome, fone, cpf, aluno);
            
            System.out.println("\n✅ CADASTRO REALIZADO COM SUCESSO!");
            System.out.println("==================================");
            System.out.println(resp.saudacao());
            System.out.println("Aluno vinculado: " + aluno.getNome() + " (MTB: " + aluno.getMtb() + ")");
            System.out.println("==================================");
            
        } catch (Exception e) {
            System.out.println("❌ ERRO AO CADASTRAR RESPONSÁVEL: " + e.getMessage());
        }
    }
}
