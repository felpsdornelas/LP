import java.util.Scanner;

public class SomaImparesConsecultivos {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          // Entrada de dados;
          int x,y,soma;
          x = s.nextInt();
          y = s.nextInt();
          soma = 0;

          //Definindo limites para os números x e y;
          int maior = Math.max (x,y);
          int menor = Math.min (x,y);
          
          // Estrutura de repetição;
          for(int i = menor + 1; i < maior; i++){
               if (i % 2 != 0){ // Verifica se o número é impar;
                    soma += i; // realiza a soma de todos os números dentro da váriavél i;
               }
          }
               System.out.println(soma); // Resultado da variável soma;
     }
}
