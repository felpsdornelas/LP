import java.util.Scanner;

public class aula{
     public static void main (String [] args){
          Scanner s = new Scanner(System.in);

          System.out.println("Digite a quantidade de valores de números a serem fornecidos: ");
          int n = s.nextInt();
          int numeros[] = new int[n];

          for(int i=0; i<n; i++){
               numeros[i] = s.nextInt();
          }

          // Imprima um [ antes
          System.out.print("[");
 
          for(int i=n-1; i!=0; i--){
               System.out.print(numeros[i]);
               if(i != 0){
                    System.out.print(",");
               }
          }

          // Imprima um ] depois
          System.out.println("]");
     }
}