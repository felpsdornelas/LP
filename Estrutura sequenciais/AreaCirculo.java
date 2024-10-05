import java.util.Scanner;

public class AreaCirculo {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          double π, raio, area;
          raio = s.nextDouble();
          π = 3.14159;
          area = π * (raio*raio);

          System.out.printf("A=%.4f\n", area);

     }
     
}
