package Exercicio_1;

public class Exercicio_1 {
    static class No {
        int valor;
        No proximo;

        public No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    static class Pilha {
        private No topo;
        private int tamanho;

        public Pilha() {
            topo = null;
            tamanho = 0;
        }

        public void insere(int valor) {
            No novoNo = new No(valor);
            novoNo.proximo = topo;
            topo = novoNo;
            tamanho++;
        }

        public int remove() {
            if (topo == null) {
                throw new RuntimeException("A pilha está vazia");
            }
            int valor = topo.valor;
            topo = topo.proximo;
            tamanho--;
            return valor;
        }

        public void imprime() {
            if (topo == null) {
                System.out.println("Pilha vazia");
                return;
            }

            No atual = topo;
            System.out.print("Pilha: [");
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
        Pilha pilha = new Pilha();

        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);

        pilha.imprime();
        System.out.println("Elemento removido: " + pilha.remove());

        pilha.imprime();
    }
}