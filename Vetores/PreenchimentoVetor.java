import java.util.Scanner; 

public class PreenchimentoVetor {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          int valorLido = s.nextInt();
          int vetor [] = new int [10];

          for(int i = 0; i<vetor.length; i++){
               vetor[i] = valorLido;
          }
     }    
     
}