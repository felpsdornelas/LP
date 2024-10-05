import java.util.Scanner;

public class MaiorPosição {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          int n, x = 0, contador=0;

          for(int i=1; i<=3; i++){ 
               n = s.nextInt();

               if (n > x){
                    x = n;
                    contador = i;
               }
          }
          System.out.println(x); 
          System.out.println(contador); 
     }    
}
