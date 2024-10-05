import java.util.Scanner;

public class FUNC06 {    
     static Scanner s = new Scanner(System.in);

     //Função que realiza o calculo do peso ideal, realizando diferenças de Masculino e Feminino. 
     public static double calcularpeso(double altura, char sexo){

          double pesoIdeal = 0;

          // Se o usuário selecionar que é masculino realize o cálculo a seguir:
          if(sexo == 'M'){
               pesoIdeal = 72.7 * altura -58;
          }
          // Se o usuário selecionar que é femino realize o cálculo a seguir:
          else if(sexo == 'F'){
               pesoIdeal = 62.1 * altura -44.7;
          }
          //retorna o peso ideal
          return pesoIdeal;
     }

     public static void main(String[] args) {
          
          // Solicita ao usuário a sua altura e o seu sexo.  
          double altura = s.nextDouble();
          char sexo = s.next().charAt(0);
          
          //Chama a função "calcularpeso"
          calcularpeso(altura,sexo);
          // Imprime o peso ideal do usuário com duas casas decimais.
          System.out.printf("%.2f\n" , calcularpeso(altura,sexo));

     }
}
