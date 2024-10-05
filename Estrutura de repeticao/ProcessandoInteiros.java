import java.util.Scanner;

public class ProcessandoInteiros {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          int valorAlvo = s.nextInt();
          int numero, contadorPar = 0, contadorImpar = 0, soma = 0, contadorNumeros = 0;
          double media;

          while (valorAlvo > 0) {
               numero = s.nextInt();
               contadorNumeros++;

               // Realiza a soma dos números dados pelo usuário
               if (numero > 0) {
                    soma += numero;
               }

               // Verifica se o número é ìmpar ou par
               if (numero % 2 == 0) {
                    contadorPar++;
               } else {
                    contadorImpar++;
               }

               // Se o número alvo dado pelo usuário for menor que a soma dos números, finalize o programa.
               if (valorAlvo < soma) {
                    break;
               } 
          }

          // Realiza o cáuculo da média e o ajuste para a variável double
          if (contadorNumeros > 0) {
               media = (double) soma / contadorNumeros;
          } else {
               media = 0;
          }

          System.out.println("Pares = " + contadorPar);          
          System.out.println("Impares = " + contadorImpar); 
          System.out.printf("Média = %.2f%n" , media);
     }
}
