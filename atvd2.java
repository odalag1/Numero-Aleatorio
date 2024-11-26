import java.util.Random;
import java.util.Scanner;

public class atvd2 {
    public static void main (String[] args) {
        
        int numeroAleatorio = new Random().nextInt(5);
        int numero = -1; 
        Scanner leitor = new Scanner(System.in);
    
        
        while (numero != numeroAleatorio) {
            System.out.println("Digite o número aleatório entre 0 e 4:");
            numero = leitor.nextInt();
    
            if (numero == numeroAleatorio) {
                System.out.println("Você acertou! O número aleatório é " + numeroAleatorio);
                break; 
            } else {
                System.out.println("Você errou, tente novamente!");
            }
    }
    leitor.close();
}
}