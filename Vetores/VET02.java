import java.util.Scanner;

public class VET02 {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          int valorDeEntrada = s.nextInt();
          int valorDeX;
          int vetor[] = new int[valorDeEntrada];

          for (int i = 0; i < valorDeEntrada; i++) {
               vetor[i] = s.nextInt();
          }
          valorDeX = s.nextInt();

          for (int i = 0; i < valorDeEntrada; i++) {
               if (i % valorDeX == 0) {
                    System.out.println("Pos[" + i + "] = " + vetor[i]);
               }
          }
     }
}