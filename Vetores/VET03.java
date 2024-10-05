import java.util.Scanner;

public class VET03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int valorDeEntrada = s.nextInt();
        int somaPares = 0;
        int vetor[] = new int[valorDeEntrada];

        for (int i = 0; i < valorDeEntrada; i++) {
            vetor[i] = s.nextInt();

            // Soma a quantidade de números pares dentro do vetor.
            if (vetor[i] % 2 == 0) {
                somaPares++;
            }
        }
        // Imprime a quantidade de números pares
        System.out.println(somaPares);

        // Imprime o parenteses antes dos números pares
        System.out.print("{");

        // Verifica quais são os números pares dentro do meu vetor.
        for (int i = 0; i < valorDeEntrada; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i]);
                // Acrescenta virgula no meio dos meus números pares
                if (i < valorDeEntrada - 1) {
                    System.out.print(";");
                }
            }
        }
        // Imprime o parenteses antes dos números pares
        System.out.println("}");
    }

}