package sistemaLabSchool;

import sistemaLabSchool.pessoa.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoa {

    private String formacao;
    private String areaDev;
    private String situacaoProfessor;
    private static List<Professor> professores = new ArrayList<Professor>();


    public Professor(String nome, String telefone, LocalDate dataNasc, String cpf, String formacao, String areaDev,
                     String situacaoProfessor) {
        super(nome, telefone, dataNasc, cpf);
        this.formacao = formacao;
        this.areaDev = areaDev;
        this.situacaoProfessor = situacaoProfessor;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAreaDev() {
        return areaDev;
    }

    public void setAreaDev(String areaDev) {
        this.areaDev = areaDev;
    }

    public String getSituacaoProfessor() {
        return situacaoProfessor;
    }

    public void setSituacaoProfessor(String situacaoProfessor) {
        this.situacaoProfessor = situacaoProfessor;
    }

    public static void cadastrarProfessor() {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nome = s.nextLine();

        String telefone = Pessoa.telefone();

        LocalDate dataNasc = Pessoa.dataNasc();

        String cpf = Pessoa.cpf();

        String formacao = tipoFormacao();

        String areaDev = areaDev();

        String situacaoProfessor = statusProfessor();

        Professor professor = new Professor(nome, telefone, dataNasc, cpf, formacao, areaDev, situacaoProfessor);

        professores.add(professor);
        Pessoa.adicionaPessoa(professor);
        Pessoa.adicionaFuncionario(professor);

    }

    public static void listarProfessores() {
        for (int i = 0; i < professores.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + professores.get(i).toString());
        }
    }

    public static void listarProfessoresByAreaDev() {
        ArrayList<Professor> professorSelecionado = new ArrayList<Professor>();

        Scanner s = new Scanner(System.in);
        System.out.println("�rea de desenvolvimento que ser� filtrada?");
        String areaDesenvolvimento = areaDev();

        for (int i = 0; i < professores.size(); i++) {
            if (areaDesenvolvimento.equalsIgnoreCase(professores.get(i).getAreaDev())) {
                professorSelecionado.add(professores.get(i));
            }
        }

        for (int i = 0; i < professorSelecionado.size(); i++) {
            System.out.println(professorSelecionado.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return "Professor: " + this.getNome() + ", Tipo de forma��o: " + this.getFormacao()
                + ", �rea de Desenvolvimento: " + this.getAreaDev() + ", Status: " + this.getSituacaoProfessor();
    }

    private static String tipoFormacao() {
        Scanner s = new Scanner(System.in);
        boolean controlador = false;
        String tipoFormacao = "";

        while (controlador == false) {
            System.out.println(" ");
            System.out.println("*Tipo de gradua��o*");
            System.out.println("Escolha uma op��o:");
            System.out.println("[1] Gradua��o Incompleta");
            System.out.println("[2] Gradua��o Completa");
            System.out.println("[3] Mestrado");
            System.out.println("[4] Doutorado");

            String respScannerStr = s.nextLine();

            int respScannerInt = -1;

            try {
                respScannerInt = Integer.parseInt(respScannerStr);
            } catch (Exception e) {
                e = new Exception("ERRO - INSIRA UM N�MERO");
                System.out.println(e.getMessage());
            }

            switch (respScannerInt) {
                case 1:
                    tipoFormacao = "Gradua��o Incompleta";
                    controlador = true;
                    break;
                case 2:
                    tipoFormacao = "Gradua��o Completa";
                    controlador = true;
                    break;
                case 3:
                    tipoFormacao = "Mestrado";
                    controlador = true;
                    break;
                case 4:
                    tipoFormacao = "Doutorado";
                    controlador = true;
                    break;
                case default:
                    System.out.println("ERRO - OP��O INV�LIDA");
                    break;
            }
        }

        return tipoFormacao;
    }

    private static String areaDev() {
        Scanner s = new Scanner(System.in);
        boolean controlador = false;
        String areaDev = "";

        while (controlador == false) {
            System.out.println("  ");
            System.out.println("*�rea de Desenvolvimento*");
            System.out.println("Escolha uma op��o:");
            System.out.println("[1] Front-End");
            System.out.println("[2] Back-End");
            System.out.println("[3] Full-Stack");

            int respScannerInt = -1;
            String respScannerStr = s.nextLine();

            try {
                respScannerInt = Integer.parseInt(respScannerStr);
            } catch (Exception e) {
                e = new Exception("ERRO - INSIRA UM N�MERO");
                System.out.println(e.getMessage());
            }

            switch (respScannerInt) {
                case 1:
                    areaDev = "Front-End";
                    controlador = true;
                    break;
                case 2:
                    areaDev = "Back-End";
                    controlador = true;
                    break;
                case 3:
                    areaDev = "Full-Stack";
                    controlador = true;
                    break;
                case default:
                    System.out.println("ERRO - OP��O INV�LIDA");
                    break;
            }
        }

        return areaDev;
    }

    private static String statusProfessor() {
        Scanner s = new Scanner(System.in);
        boolean controlador = false;
        String statusProfessor = "";

        while (controlador == false) {
            System.out.println("  ");
            System.out.println("*Status do professor*");
            System.out.println("Escolha uma op��o:");
            System.out.println("[1] Ativo");
            System.out.println("[2] Inativo");

            int respScannerInt = -1;
            String respScannerStr = s.nextLine();


            try {
                respScannerInt = Integer.parseInt(respScannerStr);
            } catch (Exception e) {
                e = new Exception("ERRO - INSIRA UM N�MERO");
                System.out.println(e.getMessage());
            }

            switch (respScannerInt) {
                case 1:
                    statusProfessor = "Ativo";
                    controlador = true;
                    break;
                case 2:
                    statusProfessor = "Inativo";
                    controlador = true;
                    break;
                case default:
                    System.out.println("ERRO - OP��O INV�LIDA");
                    break;
            }
        }

        return statusProfessor;
    }

}