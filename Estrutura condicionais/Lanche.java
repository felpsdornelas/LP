import java.util.Scanner;

public class Lanche {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          int codigo, quantidade;
          codigo = s.nextInt();
          quantidade = s.nextInt();


          if (codigo == 1){
               double total = quantidade * 4.00;
               System.out.printf("Total: R$ %.2f\n" ,total);
          }else if(codigo == 2){
               double total = quantidade * 4.50;
               System.out.printf("Total: R$ %.2f\n" ,total);
          }else if(codigo == 3){
               double total = quantidade * 5.00;
               System.out.printf("Total: R$ %.2f\n" ,total);
          }else if(codigo == 4){
               double total = quantidade * 2.00;
               System.out.printf("Total: R$ %.2f\n" ,total);
          }else if(codigo == 5){
               double total = quantidade * 1.50;
               System.out.printf("Total: R$ %.2f\n" ,total);
          }
     }
}
