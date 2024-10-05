import java.util.Scanner;

public class ValidarSalarios {
     public static void main(String[] args) {
          Scanner s = new Scanner (System.in);

          // Declaração de variáveis 
          double salario, media=0, soma=0;
          int contador=0;

          // Estrutura while para solicitar o sálario desejado
          while(true){
               salario = s.nextDouble();

               // comforme o exercicio, parar o programa se o salario for menor que 0 ou se for maior que 100000
               if(salario <= 0 || salario > 100000){
                    break;
               }else{ // caso o valor for valido, ele será somado e contabilizado. 
                    soma += salario; // realiza a soma de todos os sálarios que entrarão
                    contador++; // realiza a contagem de quantos números entraram (será utilizado para a média)
               }  
          }
          // declaração de média dos valores dos sálarios somados
          media = soma / contador;
          System.out.printf("R$ %.2f%n" ,media);
     }
}
