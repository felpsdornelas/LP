import java.util.Scanner;

public class NumerosNegativos {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          
          int x = s.nextInt(), n, contadorNegativo = 0;


          for(int i = 0; i<x; i++){
               n = s.nextInt();

               if(n < 0){
                    contadorNegativo++;
               }
          }
          System.out.println(contadorNegativo);
     }
}

