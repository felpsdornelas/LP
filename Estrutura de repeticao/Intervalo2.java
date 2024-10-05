import java.util.Scanner;

public class Intervalo2 {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          int n, x, somaOut=0, somaIn=0;
          n = s.nextInt();

          for(int i=0; i<n; i++){  
               x = s.nextInt();

               if(x >= 10 && x <= 20){
                    somaIn += 1;
               }else{
                    somaOut += 1;
               }
          }
          System.out.println(somaIn + " in");
          System.out.println(somaOut + " out");
     }
}