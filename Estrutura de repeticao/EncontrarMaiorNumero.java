import java.util.Scanner;

public class EncontrarMaiorNumero {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          int n = s.nextInt();
          int maior = Integer.MIN_VALUE;

          for(int i = 0; i<n; i++){
              int m = s.nextInt();
          
              if (m > maior){
               maior = m;
          }
          }  
          System.out.println("Maior = " + maior);
     }
}
