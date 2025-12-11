import java.util.List;
import java.util.Scanner;

public class App {
    private static final int inicio = 1;
    private static final int rua2 = 2;
    private static final int rua3 = 3;
    private static final int rua4 = 4;
    private static final int rua5 = 5;
    private static final int rua6 = 6;
    private static final int rua7 = 7;
    private static final int rua8 = 8;
    private static final int rua9 = 9;
    private static final int rua10 = 10;
    private static final int rua11 = 11;
    private static final int rua12 = 12;
    private static final int rua13 = 13;
    private static final int rua14 = 14;
    private static final int rua15 = 15;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Grafo grafo = new Grafo(16);

        grafo.criarAresta(inicio, rua2, 16);
        grafo.criarAresta(inicio, rua8, 14);
        grafo.criarAresta(inicio, rua9, 12);

        grafo.criarAresta(rua2, rua3, 14);
        grafo.criarAresta(rua2, rua4, 18);
        grafo.criarAresta(rua2, rua10, 19);

        grafo.criarAresta(rua4, rua3, 11);

        grafo.criarAresta(rua5, rua4, 13);
        grafo.criarAresta(rua5, rua6, 7);
        grafo.criarAresta(rua5, rua7, 10);
        grafo.criarAresta(rua5, rua11, 25);

        grafo.criarAresta(rua9, rua10, 8);
        grafo.criarAresta(rua9, rua11, 10);

        grafo.criarAresta(rua10, rua12, 15);

        grafo.criarAresta(rua13, rua12, 9);
        grafo.criarAresta(rua13, rua14, 10);
        grafo.criarAresta(rua13, rua15, 16);

        int origem = inicio;
        System.out.println("Delivery-System");

        int ruaDestino = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Digite a rua da entrega (1 a 15): ");
                ruaDestino = Integer.parseInt(sc.nextLine());

                if (ruaDestino < 1 || ruaDestino > 15) {
                    System.out.println("Rua inválida! Digite um número entre 1 e 15.\n");
                } else {
                    entradaValida = true;
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite apenas números.\n");
            }
        }

        List<Integer> caminho = grafo.caminhoMenor(origem, ruaDestino);

        if (caminho != null) {
            System.out.println("\nMenor caminho do restaurante até a Rua " + ruaDestino + ":");
            for (int no : caminho) {
                System.out.print("Rua" + no + " ");
            }
        } else {
            System.out.println("\nNão existe caminho entre os nós informados.");
        }
    }
}
