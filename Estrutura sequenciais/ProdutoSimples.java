import java.util.Scanner;

public class ProdutoSimples {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          int valorUm, valorDois, produto;

          valorUm = s.nextInt();
          valorDois = s.nextInt();
          produto = valorUm * valorDois;

          System.out.println("PROD = " + produto);

     }
}
