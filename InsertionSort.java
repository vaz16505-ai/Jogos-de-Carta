public class InsertionSort {

    public static Resultado ordenar(int[] v) {
        int comparacoes = 0, trocas = 0;

        long inicio = System.nanoTime();

        for (int i = 1; i < v.length; i++) {
            int chave = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > chave) {
                comparacoes++;
                v[j + 1] = v[j];
                j--;
                trocas++;
            }

            if (j >= 0) comparacoes++;

            v[j + 1] = chave;

            // PASSO A PASSO
            System.out.print("Passo " + i + ": ");
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