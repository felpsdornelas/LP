import java.util.Scanner;

public class QuadradoPares {
  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     
     int n, quadrado;
     n = s.nextInt();

     int maior = Math.max(n, n);

     for(int i=1; i <= maior; i++){

          if (i % 2 ==0) {
              quadrado = i * i;
              System.out.println(i + "^2 = " + quadrado);
          }
     }
  }   
}
