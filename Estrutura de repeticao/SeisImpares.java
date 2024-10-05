import java.util.Scanner;

public class SeisImpares {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          int x;
          x = s.nextInt();

          // Se X for par, o primeiro número ímpar será x + 1
          if(x % 2 == 0){
               x++;
          }

          // Imprimir os próximos 6 números ímpares
          for(int i = 0; i < 6; i ++){

               System.out.println(x + 2 * i);          
          }         
     }
}
