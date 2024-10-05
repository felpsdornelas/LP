import java.util.Scanner;

public class Blobs {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          // Solicita ao usuário a quantidade de casos de teste
          System.out.println("Digite a quantidade de casos testes: ");
          int casoTeste = s.nextInt();  // Armazena o número de casos de teste

          int contadorDias = 0; // Variável que contará os dias necessários para a comida acabar
          double comidaDisponivel[] = new double[casoTeste];  // Array para armazenar a quantidade de comida disponível em cada caso de teste

          // Solicita ao usuário a quantidade de comida disponível para cada caso de teste
          System.out.println("Digite a quantidade de comida disponível para o Blobs: ");

          // Laço de repetição para capturar a quantidade de comida disponível em cada caso de teste
          for (int i = 0; i < casoTeste; i++) {
               comidaDisponivel[i] = s.nextDouble(); // Armazena a quantidade de comida no array
          }

          // Para cada caso de teste, calcula quantos dias são necessários para que a comida disponível seja menor ou igual a 1
          for (int i = 0; i < casoTeste; i++) {
                // Enquanto a comida disponível for maior que 1, divide a quantidade de comida pela metade e incrementa o contador de dias
               while (comidaDisponivel[i] > 1) {
                    comidaDisponivel[i] /= 2;
                    contadorDias++;
               }
                // Exibe o número de dias necessários para que a comida disponível seja menor ou igual a 1 
               System.out.println(contadorDias + " dias");
               // Reseta o contador de dias
               contadorDias = 0;
          }
     }
}
