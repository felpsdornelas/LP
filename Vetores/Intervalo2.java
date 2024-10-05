import java.util.Scanner;

public class Intervalo2 {
     public static void main(String[] args) {
          Scanner s = new Scanner (System.in);

          int valorSerLido = s.nextInt();
          int valor[] = new int [valorSerLido]; 
          int contadorIn = 0, contadorOut = 0;

          // Declara o valor nas posições dos vetores
          for(int i = 0; i<valorSerLido; i++){
               valor[i] = s.nextInt();

               // Verifica se o número está dentro ou fora do intervalo [10,20]
               if (valor[i] >= 10 && valor[i] <= 20 ){ 
                    contadorIn++; // Se estiver dentro, adiciona +1 na variável contadorIn
               }else{
                    contadorOut++; // Se estiver fora, adiciona +1 na variável contadorOut
               }
          }
          // Imprima a quantidade de números que estão dentro ou fora do intevalo [10,20]
          System.out.println(contadorIn + " in");
          System.out.println(contadorOut + " out");
     }
}
