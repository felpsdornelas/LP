import java.util.Scanner;

public class CrescenteDecrescente {
     public static void main(String [] args){
          Scanner s = new Scanner(System.in);

          while(true){
               int x = s.nextInt();
               int y = s.nextInt();

               if(x == y){
                    break;
               }
               if(x > y){
                    System.out.println("Decrescente");
               }else{
                    System.out.println("Crescente");
               }
          }
     }
}
