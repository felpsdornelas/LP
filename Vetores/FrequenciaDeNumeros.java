import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class FrequenciaDeNumeros {
     public static void main(String[] args) {
          Scanner s = new Scanner (System.in);

          System.out.println("Digite a quantidade de números testes: ");
          int casoTeste = s.nextInt();
          
          int contadorVezes = 0;
          int quantidadeNumerosLidos [] = new int [casoTeste];

          System.out.println("Digite a quantidade de valores a serem lidos: ");
          for(int i = 0; i<casoTeste; i++){
               quantidadeNumerosLidos[i] = s.nextInt();
          }
          for(int i = 0; i<casoTeste - 1; i++){
               if(quantidadeNumerosLidos[i] == quantidadeNumerosLidos[i + 1]){
                    contadorVezes++;
               }
               System.out.println(quantidadeNumerosLidos[i] + " aparece " + contadorVezes + " vez(es)");
          }          
     }
}

