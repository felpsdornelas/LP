import java.util.Scanner;

public class SequenciaNumerosSoma {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

            while(true){
               int n = s.nextInt();
               int m = s.nextInt();
               
               if(n <= 0 || m <=0){
                    break;
               }

               int menor = Math.min(n, m);
               int maior = Math.max(n, m);

               int soma = 0;

               for (int i = menor; i <= maior; i++) {
                    System.out.print(i + " ");
                    soma += i;
               }      
               System.out.println("Sum=" + soma); 
          }
     }
}
