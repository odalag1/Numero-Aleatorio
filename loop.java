import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double mediaAva = 0;
        double nota = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Qual sua avaliação para o filme");
            nota = leitor.nextDouble();
            mediaAva += nota;
        }
       System.out.println("Medias de avaliações: " + mediaAva/3);
    }
}
