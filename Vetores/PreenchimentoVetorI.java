import java.util.Scanner;

public class PreenchimentoVetorI {
     public static void main (String []args){
          Scanner s = new Scanner (System.in);

          int n = s.nextInt();
          int valorDeEntrada = 10;
          int valorLido [] = new int[valorDeEntrada];

          for(int i = 0; i<valorDeEntrada; i++){ 
               valorLido[i] = n;
               System.out.println("N[" + i + "] = "+ n);
               n = n*2;                       
          }
     }
}
