import java.util.Scanner;

public class SeisNumerosImpares{
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          // leitura de dados e declaração das variavéis;
          int valor = s.nextInt();

          // se o número for par some +1, para que comece no número ímpar;
          if (valor % 2 == 0) {
               valor ++;               
          }
          for (int i=0; i<6; i++){ // se o contador for menor do que 6, continue;
               System.out.println(valor + 2 * i); // imprima o valor declarado + 2, para pular número de 2 em 2;
          }
     }
}