import java.util.Scanner;

public class ParOuImpar {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          
          int n,x;
          n = s.nextInt();

          for(int i=0; i<n; i++){
               x = s.nextInt();

               if(x % 2 == 0 && x > 0){ // par e positivo;
                    System.out.println("EVEN POSITIVE");
               }else if(x % 2 == 0 && x < 0){ // par e negativo;
                    System.out.println("EVEN NEGATIVE");
               }else if(x % 2 != 0 && x > 0){ // impar e positivo;
                    System.out.println("ODD POSITIVE");
               }else if(x % 2 != 0 && x < 0){ // impar e negativo;
                    System.out.println("ODD NEGATIVE");
               }else if(x == 0){ // zero = nulo
                    System.out.println("NULL");
               }
          }
     }
}
