import java.util.Scanner;

public class SomaImpares {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          // Entrda de valores
          int x,y,soma;
          x = s.nextInt();
          y = s.nextInt();
          soma = 0;

          // Determina os limites inferior e superior do intervalo
          int menor = Math.min(x, y);
          int maior = Math.max(x, y);

          //Estrutura de repetição 
          for (int i = menor + 1; i < maior; i++) {
               if(i % 2 != 0){ // Verifica se o número é ímpar
                    soma += i;
               }               
          }
          System.out.println(soma);
     }     
}