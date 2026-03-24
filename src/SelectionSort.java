public class SelectionSort {

    public static Resultado ordenar(int[] v) {
        int comparacoes = 0, trocas = 0;

        long inicio = System.nanoTime();

        for (int i = 0; i < v.length - 1; i++) {
            int menor = i;

            for (int j = i + 1; j < v.length; j++) {
                comparacoes++;
                if (v[j] < v[menor]) {
                    menor = j;
                }
            }

            if (menor != i) {
                int temp = v[i];
                v[i] = v[menor];
                v[menor] = temp;
                trocas++;
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