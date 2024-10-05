import java.util.Scanner;

public class ValidarNota {
     public static void main(String[] args) {
          Scanner s = new Scanner (System.in);

          double nota; 

          while(true){
               nota = s.nextDouble();

               if(nota >= 0 && nota <= 10 || nota >= 100 && nota <= 200){
                    System.out.println(nota);
                    break;
               }else{
                    System.out.println("nota invalida");
               }
          }
     }
}
