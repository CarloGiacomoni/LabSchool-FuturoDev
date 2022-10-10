package sistemaLabSchool;

import sistemaLabSchool.pessoa.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {

    private String statusMatricula;
    private Double notaDeCorte;
    private int totalAtendimentos;
    private static List<Aluno> alunos = new ArrayList<Aluno>();

    public Aluno(String nome, String telefone, LocalDate dataNasc, String cpf, Double notaDeCorte,
                 String statusMatricula) {
        super(nome, telefone, dataNasc, cpf);
        this.notaDeCorte = notaDeCorte;
        this.statusMatricula = statusMatricula;
        this.totalAtendimentos = 0;
    }

    public String getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(String statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public Double getNotaDeCorte() {
        return notaDeCorte;
    }

    public void setNotaDeCorte(Double notaDeCorte) {
        this.notaDeCorte = notaDeCorte;
    }

    public Integer getTotalAtendimentos() {
        return totalAtendimentos;
    }

    public void setTotalAtendimentos(int totalAtendimentos) {
        this.totalAtendimentos = totalAtendimentos;
    }

    public static List<Aluno> getAlunos() {
        return alunos;
    }

    public static void cadastrarAluno() {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nome = s.nextLine();

        String telefone = Pessoa.telefone();

        LocalDate dataNasc = Pessoa.dataNasc();

        String cpf = Pessoa.cpf();

        Double notaDeCorte = notaDeCorte();

        String statusMatricula = statusAluno();

        Aluno aluno = new Aluno(nome, telefone, dataNasc, cpf, notaDeCorte, statusMatricula);

        alunos.add(aluno);
        Pessoa.adicionaPessoa(aluno);
    }

    public static void listarAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + alunos.get(i).toString());
        }
    }

    public static void listarAlunosPorStatusMatricula() {
        ArrayList<Aluno> alunoSelecionado = new ArrayList<Aluno>();

        Scanner s = new Scanner(System.in);
        System.out.println("Status de Matricula a ser filtrada?");
        String statusMatricula = statusAluno();

        for (int i = 0; i < alunos.size(); i++) {
            if (statusMatricula.equalsIgnoreCase(alunos.get(i).getStatusMatricula())) {
                alunoSelecionado.add(alunos.get(i));
            }
        }

        for (int i = 0; i < alunoSelecionado.size(); i++) {
            System.out.println(alunoSelecionado.get(i).toString());
        }
    }

    public static void listarAlunoPorNumAtendimento() {
        alunos.sort(new Comparator<Aluno>() {

            @Override
            public int compare(Aluno o1, Aluno o2) {
                return o1.getTotalAtendimentos().compareTo(o2.getTotalAtendimentos());
            }

        }.reversed());

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + alunos.get(i).toString());
        }
    }

    public static void mudarStatusAluno() {
        listarAlunos();

        System.out.println("Deseja alterar status de matrícula  de qual aluno?");
        System.out.println("(seleção através de posição na listagem)");

        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());

        n = n - 1;

        alunos.get(n).setStatusMatricula(statusAluno());

    }

    public void adicionaAtendimento() {
        this.totalAtendimentos += 1;
        this.setStatusMatricula("Em Atendimento Pedagógico");
    }

    @Override
    public String toString() {
        return "Aluno: " + this.getNome() + ", Nota de corte: " + this.getNotaDeCorte() + ", CPF: " + this.getCpf()
                + ", Codigo: " + this.getId() + ", Status de Matricula: " + this.getStatusMatricula()
                + ", Total de atendimentos recebidos: "
                + this.getTotalAtendimentos();
    }

    private static Double notaDeCorte() {

        Scanner s = new Scanner(System.in);
        boolean controlador = false;

        while (controlador == false) {
            System.out.println("Nota de corte do Aluno (Entre 0 e 10)");

            Double notaCorteDbl = -1d;
            String notaCorteStr = s.nextLine();

            try {
                notaCorteDbl = Double.parseDouble(notaCorteStr);
            } catch (Exception e) {
                e = new Exception("ERRO - INSIRA UM NÚMERO");
                System.out.println(e);
            }

            if (notaCorteDbl >= 0 && notaCorteDbl <= 10) {
                controlador = true;
                return notaCorteDbl;
            } else {
                System.out.println("ERRO - NOTA INVÁLIDA");
            }
        }

        return 0d;
    }

    private static String statusAluno() {
        Scanner s = new Scanner(System.in);
        boolean controlador = false;
        String situacaoAluno = "";

        while (controlador == false) {
            System.out.println("  ");
            System.out.println("*Status do Aluno*");
            System.out.println("Escolha uma opção:");
            System.out.println("[1] Ativo");
            System.out.println("[2] Inativo");
            System.out.println("[3] Irregular");
            System.out.println("[4] Em Atendimento Pedagogico");

            int respScannerInt = -1;
            String respScannerStr = s.nextLine();

            try {
                respScannerInt = Integer.parseInt(respScannerStr);
            } catch (Exception e) {
                e = new Exception("ERRO - INSIRA UM NÚMERO");
                System.out.println(e.getMessage());
            }

            switch (respScannerInt) {
                case 1:
                    situacaoAluno = "Ativo";
                    controlador = true;
                    break;
                case 2:
                    situacaoAluno = "Inativo";
                    controlador = true;
                    break;
                case 3:
                    situacaoAluno = "Irregular";
                    controlador = true;
                    break;
                case 4:
                    situacaoAluno = "Em Atendimento Pedagógico";
                    controlador = true;
                    break;
                case default:
                    System.out.println("ERRO - OPÇÃO INVÁLIDA");
                    break;
            }
        }

        return situacaoAluno;
    }

    public static boolean verificaExistenciaAlunos(List<Aluno> alunos) {
        boolean existe = false;

        if (alunos.size() > 0) {
            existe = true;
        } else {
            System.out.println("ERRO - NENHUM ALUNO ENCONTRADO");
        }

        return existe;
    }
}