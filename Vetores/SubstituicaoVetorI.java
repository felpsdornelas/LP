import java.util.Scanner;

public class SubstituicaoVetorI {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          int entrada = 10;
          int vetor[] = new int[entrada];

          for (int i = 0; i < entrada; i++) {
               vetor[i] = s.nextInt();

               if (vetor[i] <= 0) {
                    vetor[i] = 1;
               }
          }
          for (int i = 0; i < entrada; i++) {
               System.out.println("X[" + i + "] = " + vetor[i]);
          }
     }

}
