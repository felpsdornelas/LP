import java.util.Scanner;

public class SomaNumerosReais {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          double numero;
          double soma = 0;
          int contadorNumero = 0;

          while (true) {
               numero = s.nextDouble();

               // Verifica se o número é negativo, se o número for negativo, parar o programa. 
               if (numero < 0) {
                    break;
               }

               // Realiza a contagem dos números que passaram.
               contadorNumero++;

               // Realiza a soma dos números que foram inseridos pelos usuários.
               if (numero > 0) {
                    soma += numero;
               }
          }

          System.out.printf("Soma = %.2f\n" , soma);
          System.out.println("Quantidade = " + contadorNumero);
     }
}
