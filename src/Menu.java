import sistemaLabSchool.Aluno;
import sistemaLabSchool.Pedagogo;
import sistemaLabSchool.Professor;
import sistemaLabSchool.pessoa.Pessoa;

import java.util.Scanner;

public class Menu {

    public static void menuPrincipal() {
        Scanner s = new Scanner(System.in);

        boolean controlador = true;

        while (controlador == true) {
            System.out.println("  ");
            System.out.println("------------------------------------------------------------------");
            System.out.println("               Seja bem vindo a Escola 'Lab School'                ");
            System.out.println("------------------------------------------------------------------");
            System.out.println("  ");
            System.out.println("Selecione um dos 'Menus' abaixo para inserção de dados e consulta.");
            System.out.println("  ");
            System.out.println("Escolha uma opção:");
            System.out.println("[1] Menu Aluno");
            System.out.println("[2] Menu Professor");
            System.out.println("[3] Menu Pedagogo");
            System.out.println("[4] Menu Relatórios Gerenciais Acadêmicos");
            System.out.println("[0] Sair");

            String respScannerStr = s.nextLine();

            int respScannerInt = -1;

            try {
                respScannerInt = Integer.parseInt(respScannerStr);
            } catch (Exception e) {
                e = new Exception("ERRO - INSIRA UM NÚMERO");
                System.out.println(e.getMessage());
            }

            switch (respScannerInt) {
                case 1:
                    menuAluno();
                    break;
                case 2:
                    menuProfessor();
                    break;
                case 3:
                    menuPedagogos();
                    break;
                case 4:
                    menuPessoas();
                    break;
                case 0:
                    controlador = false;
                    break;
                case default:
                    System.out.println("ERRO - COMANDO INVÁLIDO");
                    break;
            }

        }
    }

    public static void menuAluno() {

        Scanner s = new Scanner(System.in);
        boolean controlador = true;

        while (controlador == true) {
            System.out.println("  ");
            System.out.println("*Menu Aluno*");
            System.out.println("Escolha uma opção:");
            System.out.println("[1] Cadastrar Aluno");
            System.out.println("[2] Listar Alunos");
            System.out.println("[3] Listar Alunos pela situação da matricula");
            System.out.println("[4] Listar Alunos por número de atendimentos");
            System.out.println("[5] Mudar o status do aluno");
            System.out.println("[0] Voltar");

            String respScannerStr = s.nextLine();

            int respScannerInt = -1;

            try {
                respScannerInt = Integer.parseInt(respScannerStr);
            } catch (Exception e) {
                e = new Exception("ERRO - INSIRA UM NÚMERO");
                System.out.println(e.getMessage());
            }

            switch (respScannerInt) {
                case 1:
                    Aluno.cadastrarAluno();
                    break;
                case 2:
                    Aluno.listarAlunos();
                    break;
                case 3:
                    Aluno.listarAlunosPorStatusMatricula();
                    break;
                case 4:
                    Aluno.listarAlunoPorNumAtendimento();
                    break;
                case 5:
                    Aluno.mudarStatusAluno();
                    break;
                case 0:
                    controlador = false;
                    break;
                case default:
                    System.out.println("ERRO - COMANDO INVÁLIDO");
                    break;
            }
        }
    }

    public static void menuProfessor() {
        Scanner s = new Scanner(System.in);
        boolean controlador = true;

        while (controlador == true) {
            System.out.println("  ");
            System.out.println("*Menu Professor*");
            System.out.println("Escolha uma opção:");
            System.out.println("[1] Cadastrar Professor");
            System.out.println("[2] Listar Professores");
            System.out.println("[3] Listar Professores pela área de desenvolvimento");
            System.out.println("[0] Voltar");

            String respScannerStr = s.nextLine();

            int respScannerInt = -1;

            try {
                respScannerInt = Integer.parseInt(respScannerStr);
            } catch (Exception e) {
                e = new Exception("ERRO - INSIRA UM NÚMERO");
                System.out.println(e.getMessage());
            }

            switch (respScannerInt) {
                case 1:
                    Professor.cadastrarProfessor();
                    break;
                case 2:
                    Professor.listarProfessores();
                    break;
                case 3:
                    Professor.listarProfessoresByAreaDev();
                    break;
                case 0:
                    controlador = false;
                    break;
                case default:
                    System.out.println("ERRO - COMANDO INVÁLIDO");
                    break;
            }
        }
    }

    public static void menuPedagogos() {
        Scanner s = new Scanner(System.in);
        boolean controlador = true;

        while (controlador == true) {
            System.out.println("  ");
            System.out.println("*Menu Pedagogo*");
            System.out.println("Escolha uma opção:");
            System.out.println("[1] Cadastrar Pedagogo");
            System.out.println("[2] Listar Pedagogo");
            System.out.println("[3] Listar Pedagogo pelo número de antendimentos");
            System.out.println("[4] Realizar atendimento");
            System.out.println("[0] Voltar");

            String respScannerStr = s.nextLine();

            int respScannerInt = -1;

            try {
                respScannerInt = Integer.parseInt(respScannerStr);
            } catch (Exception e) {
                e = new Exception("ERRO - INSIRA UM NÚMERO");
                System.out.println(e.getMessage());
            }
            switch (respScannerInt) {
                case 1:
                    Pedagogo.cadastrarPedagogo();
                    break;
                case 2:
                    Pedagogo.listarPedagogos();
                    break;
                case 3:
                    Pedagogo.listarPedagogosByNumAtendimentos();
                    break;
                case 4:
                    Pedagogo.realizarAtendimento();
                    break;
                case 0:
                    controlador = false;
                    break;
                case default:
                    System.out.println("ERRO - COMANDO INVÁLIDO");
                    break;
            }
        }
    }

    public static void menuPessoas() {
        Scanner s = new Scanner(System.in);
        boolean controlador = true;

        while (controlador == true) {

            System.out.println("  ");
            System.out.println("*Menu Relatórios Gerenciais Acadêmicos*");
            System.out.println("Escolha uma opção:");
            System.out.println("[1] Listar Pessoas");
            System.out.println("[2] Listar Alunos");
            System.out.println("[3] Listar Professores");
            System.out.println("[4] Listar Pedagogos");
            System.out.println("[5] Listar Funcionários");
            System.out.println("[0] Voltar");

            String respScannerStr = s.nextLine();

            int respScannerInt = -1;
            try {
                respScannerInt = Integer.parseInt(respScannerStr);
            } catch (Exception e) {
                e = new Exception("ERRO - INSIRA UM NÚMERO");
                System.out.println(e.getMessage());
            }

            switch (respScannerInt) {
                case 1:
                    Pessoa.listarPessoas();
                    break;
                case 2:
                    Aluno.listarAlunos();
                    break;
                case 3:
                    Professor.listarProfessores();
                    break;
                case 4:
                    Pedagogo.listarPedagogos();
                    break;
                case 5:
                    Pessoa.listarFuncionarios();
                    break;
                case 0:
                    controlador = false;
                    break;
                case default:
                    System.out.println("ERRO - COMANDO INVÁLIDO");
                    break;
            }
        }
    }
}