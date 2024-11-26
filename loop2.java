import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double mediaAva = 0;
        double nota = 0;
        double totalDeNota = 0;
        while (nota != -1) {
            System.out.println("Qual sua avaliação para o filme (Digite menos -1 para encerrar)");
            nota = leitor.nextDouble();
            if (nota != -1) {
                mediaAva += nota;
                totalDeNota++;
            } else {
                System.out.println("Obrigado");
            }
        }
        System.out.println("Medias de avaliações: " + mediaAva/totalDeNota);
    }
}
