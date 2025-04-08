package Exercicio_3_VETORES;

import java.util.Scanner;

public class Exercicio_3_VETORES {
    static class FilaVetor {
        private int[] elementos;
        private int inicio;
        private int fim;
        private int capacidade;
        private int tamanho;

        public FilaVetor(int capacidade) {
            this.capacidade = capacidade;
            elementos = new int[capacidade];
            inicio = 0;
            fim = -1;
            tamanho = 0;
        }

        public void insere(int valor) {
            if (tamanho == capacidade) {
                System.out.println("Fila cheia!");
                return;
            }
            fim = (fim + 1) % capacidade;
            elementos[fim] = valor;
            tamanho++;
        }

        public int remove() {
            if (tamanho == 0) {
                throw new RuntimeException("Fila vazia!");
            }
            int valor = elementos[inicio];
            inicio = (inicio + 1) % capacidade;
            tamanho--;
            System.out.println("Elemento removido: " + valor);
            return valor;
        }

        public void imprime() {
            if (tamanho == 0) {
                System.out.println("Fila vazia");
                return;
            }
            System.out.print("Fila: [");
            for (int i = 0; i < tamanho; i++) {
                int pos = (inicio + i) % capacidade;
                System.out.print(elementos[pos]);
                if (i < tamanho - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        public boolean vazia() {
            return tamanho == 0;
        }

        public int primeiro() {
            if (tamanho == 0) {
                throw new RuntimeException("Fila vazia!");
            }
            return elementos[inicio];
        }
    }

    public static FilaVetor merge(FilaVetor filaA, FilaVetor filaB) {
        FilaVetor filaC = new FilaVetor(filaA.tamanho + filaB.tamanho);

        while (!filaA.vazia() && !filaB.vazia()) {
            if (filaA.primeiro() <= filaB.primeiro()) {
                filaC.insere(filaA.remove());
            } else {
                filaC.insere(filaB.remove());
            }
        }

        while (!filaA.vazia()) {
            filaC.insere(filaA.remove());
        }

        while (!filaB.vazia()) {
            filaC.insere(filaB.remove());
        }

        return filaC;
    }

    // Realizar os testes exemplos aqui:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaVetor filaA = new FilaVetor(10);
        FilaVetor filaB = new FilaVetor(10);

        System.out.println("Preencha a Fila A (ordenada):");
        preencherFila(filaA, scanner);

        System.out.println("\nPreencha a Fila B (ordenada):");
        preencherFila(filaB, scanner);

        System.out.println("\nFila A:");
        filaA.imprime();

        System.out.println("\nFila B:");
        filaB.imprime();

        System.out.println("\nRealizando merge...");
        FilaVetor filaC = merge(filaA, filaB);

        System.out.println("\nFila C (resultado do merge):");
        filaC.imprime();
    }

    private static void preencherFila(FilaVetor fila, Scanner scanner) {
        System.out.println("Digite os elementos ordenados (digite 'sair' para parar):");
        while (true) {
            System.out.print("Próximo elemento: ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                int elemento = Integer.parseInt(input);
                fila.insere(elemento);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido ou 'sair' para encerrar.");
            }
        }
    }
}