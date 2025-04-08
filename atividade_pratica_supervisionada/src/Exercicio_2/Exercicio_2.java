package Exercicio_2;

public class Exercicio_2 {
    static class No {
        int valor;
        No proximo;

        public No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    static class Fila {
        private No inicio;
        private No fim;
        private int tamanho;

        public Fila() {
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
                throw new RuntimeException("A fila está vazia");
            }
            int valor = inicio.valor;
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
            tamanho--;
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
    }

    // Realizar os testes exemplos aqui:
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.insere(10);
        fila.insere(20);
        fila.insere(30);

        fila.imprime();

        System.out.println("Elemento removido: " + fila.remove());

        fila.imprime();
    }
}