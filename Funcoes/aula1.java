import java.util.Scanner;

public class aula1 {
     public static void main (String[] args){
          Scanner s = new Scanner(System.in);
          int z = s.nextInt();
          int y = s.nextInt();

          // Chamar a função abaixo 
          System.out.println(soma(z, y));
          s.close();
     }     
     static int soma(int z, int y){
          return z + y;
     }
}