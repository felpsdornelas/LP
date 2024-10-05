import java.util.Scanner;

public class SomaSimples {
     public static void main(String[] args) {
          Scanner s = new Scanner (System.in);

          int valorUm, valorDois, soma;

          valorUm = s.nextInt();
          valorDois = s.nextInt();
          soma = valorUm + valorDois;

          System.out.println("SOMA = " + soma);
     }
}
