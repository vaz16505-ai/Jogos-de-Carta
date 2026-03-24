public class BubbleSort {

    public static Resultado ordenar(int[] v) {
        int comparacoes = 0, trocas = 0;

        long inicio = System.nanoTime();

        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                comparacoes++;
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    trocas++;
                }
            }

            // PASSO A PASSO
            System.out.print("Passo " + (i + 1) + ": ");
            imprimir(v);
        }

        long fim = System.nanoTime();

        return new Resultado(fim - inicio, comparacoes, trocas);
    }

    private static void imprimir(int[] v) {
        for (int num : v) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}