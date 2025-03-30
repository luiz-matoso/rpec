public class Pilha {
    private int[] pilha;
    private int topo;
    private final int MAX;

    public Pilha(int tamanho) {
        this.MAX = tamanho;
        this.pilha = new int[MAX];
        this.topo = -1;
    }

    public boolean pilhaVazia() {
        return (topo == -1);
    }

    public boolean pilhaCheia() {
        return (topo == MAX - 1);
    }

    public void empilhaElemento(int elemento) {
        if (pilhaCheia()) {
            System.out.println("Erro: Pilha cheia");
            return;
        }
        topo = topo + 1;
        pilha[topo] = elemento;
    }

    public int desempilhaElemento() {
        if (pilhaVazia()) {
            System.out.println("Erro: Pilha vazia");
            return -1;
        }
        int elemento = pilha[topo];
        topo = topo - 1;
        return elemento;
    }

    public int consultaTopo() {
        if (pilhaVazia()) {
            System.out.println("Erro: Pilha vazia");
            return -1;
        }
        return pilha[topo];
    }

    public void imprimePilha() {
        if (pilhaVazia()) {
            System.out.println("Pilha vazia");
            return;
        }

        System.out.print("Pilha (topo -> base): ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }

    // Testes:
    public static void main(String[] args) {
        Pilha p = new Pilha(3);

        System.out.println("Pilha vazia? " + p.pilhaVazia());

        p.empilhaElemento(10);
        p.empilhaElemento(20);
        p.empilhaElemento(30);

        p.imprimePilha();
        System.out.println("Topo: " + p.consultaTopo());

        System.out.println("Desempilhado: " + p.desempilhaElemento());
        p.imprimePilha();

        p.empilhaElemento(40);
        p.imprimePilha();

        System.out.println("Pilha cheia? " + p.pilhaCheia());
    }
}