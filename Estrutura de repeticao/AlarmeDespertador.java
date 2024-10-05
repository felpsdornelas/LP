import java.util.Scanner;

public class AlarmeDespertador{
     public static void main(String []args){
          Scanner s = new Scanner (System.in);

          int h1, m1, h2, m2;

          // entrada de dados com o while;
          while(true){
               h1 = s.nextInt();
               m1 = s.nextInt();
               h2 = s.nextInt();
               m2 = s.nextInt();

               // condição de parada se todas as váriaveis for igual a zero;
               if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0){
                    break;
               }
               
               int inicio = h1 * 60 + m1;
               int fim = h2 * 60 + m2;

               int diferenca; 
               if (fim >=inicio){
                    diferenca = fim - inicio;
               }else{
                    diferenca =(24*60 - inicio) + fim;
               }
               System.out.println(diferenca);
          }
     }
}