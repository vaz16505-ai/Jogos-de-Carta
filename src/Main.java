import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[7];
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Inserir valores");
            System.out.println("2 - Bubble Sort");
            System.out.println("3 - Selection Sort");
            System.out.println("4 - Insertion Sort");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite 7 valores:");
                    for (int i = 0; i < vetor.length; i++) {
                        vetor[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    executar("Bubble Sort", vetor, 1);
                    break;

                case 3:
                    executar("Selection Sort", vetor, 2);
                    break;

                case 4:
                    executar("Insertion Sort", vetor, 3);
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }

    public static void executar(String nome, int[] vetor, int tipo) {
        System.out.println("\n--- " + nome + " ---");

        Resultado r;

        if (tipo == 1)
            r = BubbleSort.ordenar(vetor.clone());
        else if (tipo == 2)
            r = SelectionSort.ordenar(vetor.clone());
        else
            r = InsertionSort.ordenar(vetor.clone());

        System.out.println("\nTempo: " + r.tempo + " ns");
        System.out.println("Comparações: " + r.comparacoes);
        System.out.println("Trocas: " + r.trocas);
    }
}