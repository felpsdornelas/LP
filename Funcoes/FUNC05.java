import java.util.Scanner;

public class FUNC05 {

     static Scanner s = new Scanner(System.in);

     // Função que realiza o calculo do volume de uma esfera de acordo com o raio, o parametro que a função utiliza é o raio. 
     public static double calcularVolume (double raio){
          double pi = 3.1416; // declara o valor de pi
          double volume = 4 * pi * (raio*raio*raio) / 3; // realiza o calculo do volume de acordo com o raio.
          return volume; // Retorna a variável volume
     }

     public static void main(String[] args) {
          double raio = s.nextDouble(); // Solicita o usuário o valor do raio.
          double resultado = calcularVolume(raio); // Chama a função "calcularVolume"
          System.out.printf("Volume : %.2f\n", resultado); // Imprime o resultado do volume.
     }
     
}
