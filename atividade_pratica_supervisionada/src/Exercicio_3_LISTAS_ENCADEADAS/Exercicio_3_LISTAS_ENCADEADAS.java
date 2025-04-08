package Exercicio_3_LISTAS_ENCADEADAS;

import java.util.Scanner;

public class Exercicio_3_LISTAS_ENCADEADAS {
    static class No {
        int valor;
        No proximo;

        public No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    static class FilaLista {
        private No inicio;
        private No fim;
        private int tamanho;

        public FilaLista() {
            inicio = null;
            fim = null;
            tamanho = 0;
        }

        public void insere(int valor) {
            No novoNo = new No(valor);
            if (fim == null) {
                inicio = novoNo;
                fim = novoNo;
            } else {
                fim.proximo = novoNo;
                fim = novoNo;
            }
            tamanho++;
        }

        public int remove() {
            if (inicio == null) {
                throw new RuntimeException("Fila vazia!");
            }
            int valor = inicio.valor;
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
            tamanho--;
            System.out.println("Elemento removido: " + valor);
            return valor;
        }

        public void imprime() {
            if (inicio == null) {
                System.out.println("Fila vazia");
                return;
            }

            No atual = inicio;
            System.out.print("Fila: [");
            while (atual != null) {
                System.out.print(atual.valor);
                if (atual.proximo != null) {
                    System.out.print(", ");
                }
                atual = atual.proximo;
            }
            System.out.println("]");
        }

        public boolean vazia() {
            return inicio == null;
        }

        public int primeiro() {
            if (inicio == null) {
                throw new RuntimeException("Fila vazia!");
            }
            return inicio.valor;
        }
    }

    public static FilaLista merge(FilaLista filaA, FilaLista filaB) {
        FilaLista filaC = new FilaLista();

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
        FilaLista filaA = new FilaLista();
        FilaLista filaB = new FilaLista();

        System.out.println("Preencha a Fila A (ordenada):");
        preencherFila(filaA, scanner);

        System.out.println("\nPreencha a Fila B (ordenada):");
        preencherFila(filaB, scanner);

        System.out.println("\nFila A:");
        filaA.imprime();

        System.out.println("\nFila B:");
        filaB.imprime();

        System.out.println("\nRealizando merge...");
        FilaLista filaC = merge(filaA, filaB);

        System.out.println("\nFila C (resultado do merge):");
        filaC.imprime();
    }

    private static void preencherFila(FilaLista fila, Scanner scanner) {
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