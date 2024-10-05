import java.util.Scanner;

public class FUNC07 {

     static Scanner s = new Scanner(System.in);

     // Função responsável pela soma de dois vetores;
     public static int[] somarVetor(int vetor1[], int vetor2[], int valorEntrada) {

          int soma[] = new int[valorEntrada];

          for (int i = 0; i < valorEntrada; i++) {
               soma[i] = vetor1[i] + vetor2[i];
          }
          return soma;
     }
     // Função responsável pela multiplicação de dois vetores;
     public static int[] multiplicarVetor(int vetor1[], int vetor2[], int valorEntrada) {

          int multiplica[] = new int[valorEntrada];

          for (int i = 0; i < valorEntrada; i++) {
               multiplica[i] = vetor1[i] * vetor2[i];
          }
          return multiplica;
     }
     // Função responsável por imprimir os vetores somados;
     public static void imprimirSoma(int vetor[], int valorEntrada) {
          System.out.print("Soma : {");
          for (int i = 0; i < valorEntrada; i++) {
               System.out.print(vetor[i]);
               if (i < valorEntrada - 1) {
                    System.out.print(", ");
               }
          }
          System.out.println("}");
     }
     // Função responsável por imprimir os vetores multiplicados;
     public static void imprimirMultiplicacao(int vetor[], int valorEntrada) {
          System.out.print("Produto : {");
          for (int i = 0; i < valorEntrada; i++) {
               System.out.print(vetor[i]);
               if (i < valorEntrada - 1) {
                    System.out.print(", ");
               }
          }
          System.out.println("}");
     }
     // Função principal (MAIN);
     public static void main(String[] args) {

          // System.out.println("Qual o valor de entrada?");
          int valorEntrada = s.nextInt();
          int vetor1[] = new int[valorEntrada];
          int vetor2[] = new int[valorEntrada];

          // System.out.println("Preencha o vetor 1");
          for (int i = 0; i < valorEntrada; i++) {
               vetor1[i] = s.nextInt();
          }
          // System.out.println("Preencha o vetor 2");
          for (int i = 0; i < valorEntrada; i++) {
               vetor2[i] = s.nextInt();
          }
          // Cria um novo vetor para armazenar a soma dos vetores 1 e 2 e logo em seguida chama a função para imprimir.
          int resultadoSoma[] = somarVetor(vetor1, vetor2, valorEntrada);
          imprimirSoma(resultadoSoma, valorEntrada);

          // Cria um novo vetor para armazenar o produto dos vetores 1 e 2 e logo em seguida chama a função para imprimir.
          int resultadoMultipicacao[] = multiplicarVetor(vetor1, vetor2, valorEntrada);
          imprimirMultiplicacao(resultadoMultipicacao, valorEntrada);
     }
}
