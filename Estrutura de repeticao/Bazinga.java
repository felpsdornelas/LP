import java.util.Scanner;

public class Bazinga {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in); 

          int t; 
          t = s.nextInt();

          for (int i=0; i<=t; i++){
               String n = s.nextLine();

               if(n.equals("tesoura papel")){
                    System.out.println("Caso #" + i + ": Bazinga!");
               }else if(n.equals("papel pedra")){
                    System.out.println("Caso #" + i + ": Bazinga!");
               }else if(n.equals("pedra lagarto")){
                    System.out.println("Caso #" + i + ": Bazinga!");
               }else if(n.equals("lagarto Spock")){
                    System.out.println("Caso #" + i + ": Bazinga!");
               }else if(n.equals("Spock tesoura")){
                    System.out.println("Caso #" + i + ": Bazinga!");
               }else if(n.equals("tesoura lagarto")){
                    System.out.println("Caso #" + i + ": Bazinga!");
               }else if(n.equals("lagarto papel")){
                    System.out.println("Caso #" + i + ": Bazinga!");
               }else if(n.equals("papel Spock")){
                    System.out.println("Caso #" + i + ": Bazinga!");
               }else if(n.equals("Spock pedra")){
                    System.out.println("Caso #" + i + ": Bazinga!");
               }else if(n.equals("pedra tesoura")){
                    System.out.println("Caso #" + i + ": Bazinga!");
               }else if(n.equals("tesoura tesoura")){
                    System.out.println("Caso #" + i + ": De novo!");
               }else if(n.equals("papel papel")){
                    System.out.println("Caso #" + i + ": De novo!");
               }else if(n.equals("pedra pedra")){
                    System.out.println("Caso #" + i + ": De novo!");
               }else if(n.equals("lagarto lagarto")){
                    System.out.println("Caso #" + i + ": De novo!");
               }else if(n.equals("Spock Spock")){
                    System.out.println("Caso #" + i + ": De novo!");
               }else if(n.equals("papel tesoura")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
               }else if(n.equals("pedra papel")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
               }else if(n.equals("lagarto pedra")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
               }else if(n.equals("Spock lagarto")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
               }else if(n.equals("tesoura Spock")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
               }else if(n.equals("lagarto tesoura")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
               }else if(n.equals("papel lagarto")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
               }else if(n.equals("Spock papel")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
               }else if(n.equals("pedra Spock")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
               }else if(n.equals("tesoura pedra")){
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
               }               
          }
     }     
}
