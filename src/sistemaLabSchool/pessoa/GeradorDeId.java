package sistemaLabSchool.pessoa;

public class GeradorDeId {
    private static int id = 0;

    public static int gerarId() {
        return id++;
    }
}