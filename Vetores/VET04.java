import java.util.Scanner;

public class VET04 {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          // Declaração de variáveis 
          int valorDeEntrada = s.nextInt();
          int vetor[] = new int[valorDeEntrada];

          // Entrada de dados dentro do vetor
          for(int i = 0; i<valorDeEntrada; i++){
               vetor[i] = s.nextInt();
          }
          // Imprime apenas números negativos
          for(int i = valorDeEntrada - 1; i >=0; i--){
               if(vetor[i] < 0){
                    System.out.println(vetor[i]);
               }
          }
     }     
}
