import java.util.Scanner;

public class SistemaVotacao {
     public static void main(String[] args) {
          Scanner s = new Scanner (System.in);

          // Declaração de variáveis 
          int voto, candidatoUm=0, candidatoDois=0, candidatoTres=0, votoNulo=0, votoBranco=0;

          // Leia o voto do usuário, podendo ser do candidato 1 até o 5, caso o usuário digite os números (1, 2, 3, 4 e 5) mais de uma vez adicione o voto ao candidato correspondente.

          while(true){
               voto = s.nextInt();

               if(voto == 1){
                    candidatoUm ++;                    
               }else if(voto == 2){
                    candidatoDois ++;
               }else if(voto == 3){
                    candidatoTres ++;
               }else if(voto == 4){
                    votoNulo ++;
               }else if(voto == 5){
                    votoBranco ++;
               }else{
                    break;
               } // fim if-else
          } // fim while
          
          // Saída 
          System.out.println("Candidato 1 : " + candidatoUm + " voto(s)");  
          System.out.println("Candidato 2 : " + candidatoDois + " voto(s)");
          System.out.println("Candidato 3 : " + candidatoTres + " voto(s)");
          System.out.println("Nulos : " + votoNulo + " voto(s)");
          System.out.println("Brancos : " + votoBranco + " voto(s)");
     }
}