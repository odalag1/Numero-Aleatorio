import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitor.nextLine();
        System.out.println("Qual ano de lançamento do filme");
        int anoDeLançamentoDoFilme = leitor.nextInt();
        System.out.println("Qual sua avaliação para o filme");
        double avaliação = leitor.nextDouble();
    }
}
