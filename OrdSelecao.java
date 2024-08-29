import java.util.Scanner;

public class OrdSelecao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        do {
            entrada = scanner.nextLine();
            if (!entrada.equals("FIM")) {
                int[] numeros = separaVetor(entrada);
                ordenacaoSelecao(numeros);

            }

        } while (!entrada.equals("FIM") && scanner.hasNext());

        scanner.close();
    }

    private static int[] separaVetor(String entrada) {
        String[] partes = entrada.split(";");
        int[] valores = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            valores[i] = Integer.parseInt(partes[i]);
        }

        return valores;
    }

    private static void ordenacaoSelecao(int[] numeros) {
        int tamanho = numeros.length;
        int aux, min, contador =0;

        for (int i = 0; i < tamanho - 1; i++) {
            min = i;

            for (int j = (i + 1); j < tamanho; j++) {
                contador ++;
                if (numeros[j] < numeros[min])
                    min = j;

            }

            if (min != i) {
                aux = numeros[i];
                numeros[i] = numeros[min];
                numeros[min] = aux;
            }

        }

        for (int num : numeros) {
            System.out.print(num + " ");
            
        }
        System.out.println();
        System.out.println("Comparacoes realizadas: " + contador);

    }

}