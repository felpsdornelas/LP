import java.util.Scanner;

public class Funcionarios {
   public static void main(String[] args) {
     Scanner s = new Scanner (System.in);

     int idade;
     char sexo;
     double salario;

     int maior = Integer.MIN_VALUE;
 	int menor = Integer.MAX_VALUE;

     while(true){          
          idade = s.nextInt();          
          sexo = s.next().charAt(0);          
          salario = s.nextDouble();

     }
   }  
}
