import java.util.Scanner;

public class FuncSomarNumeros {     
     static Scanner s = new Scanner(System.in);
     public static void main(String[] args) {

          int numero1 = s.nextInt();
          int numero2 = s.nextInt();

          somarInteiro(numero1, numero2);
          lerInteiro(somarInteiro(numero1, numero2));

     s.close();

     }
     static int somarInteiro(int numero1, int numero2){
          int soma = numero1 + numero2;
          return soma;

     }
     static void lerInteiro(int soma){
          System.out.println("A soma de seu número é: " + soma);
     }
}

