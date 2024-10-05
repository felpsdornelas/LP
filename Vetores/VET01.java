import java.util.Scanner;

public class VET01 {
     public static void main(String[] args) {

          Scanner s = new Scanner (System.in);

          //Declaração de variavés 
          int ValorEntrada = s.nextInt();
          int vetorUm [] = new int[ValorEntrada];          
          int vetorDois [] = new int[ValorEntrada];
          int multiplicacao[] = new int[ValorEntrada];
          
          // Solicitação de dados para o vetor 1 
          for(int i = 0; i<ValorEntrada; i++){
               vetorUm [i] = s.nextInt();
          }
          // Solicitação de dados para o vetor 2
          for(int i = 0; i<ValorEntrada; i++){
               vetorDois [i] = s.nextInt();
          }
          // Insere um colchetes antes
          System.out.print("{");

          // Realiza a multipicação entre os vetores
          for(int i =0; i<ValorEntrada; i++){
               multiplicacao [i] = vetorUm [i] * vetorDois [i];
               System.out.print(multiplicacao [i]);

          }
          // Insere um colchetes depois
          System.out.print("}");

     }
}
