import java.util.Scanner;

public class ValidarAno {
     public static void main(String[] args) {
          Scanner s = new Scanner (System.in);

          int anoNascimento;

          while(true){
               anoNascimento = s.nextInt();

               if(anoNascimento >= 1900 && anoNascimento <= 2023){
                    System.out.println(anoNascimento);
                    break;
               }else{
                    System.out.println("Ano invalido");
               }
          }
          
     }
}
