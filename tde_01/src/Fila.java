public class Fila {
    private int[] fila;
    private int inicio;
    private int fim;
    private final int MAX;

    public Fila(int tamanho) {
        this.MAX = tamanho + 1;
        this.fila = new int[MAX];
        this.inicio = 0;
        this.fim = 0;
    }

    public boolean filaVazia() {
        return (inicio == fim);
    }

    public boolean filaCheia() {
        return ((fim + 1) % MAX == inicio);
    }

    public void insereElemento(int elemento) {
        if (filaCheia()) {
            System.out.println("Erro: Fila cheia");
            return;
        }
        fila[fim] = elemento;
        fim = (fim + 1) % MAX;
    }

    public int removeElemento() {
        if (filaVazia()) {
            System.out.println("Erro: Fila vazia");
            return -1;
        }
        int elemento = fila[inicio];
        inicio = (inicio + 1) % MAX;
        return elemento;
    }

    public void imprimeFila() {
        if (filaVazia()) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.print("Fila (inicio -> fim): ");
        int i = inicio;
        while (i != fim) {
            System.out.print(fila[i] + " ");
            i = (i + 1) % MAX;
        }
        System.out.println();
    }

    // Testes:
    public static void main(String[] args) {
        Fila f = new Fila(3);

        System.out.println("Fila vazia? " + f.filaVazia());

        f.insereElemento(10);
        f.insereElemento(20);
        f.insereElemento(30);

        f.imprimeFila();
        System.out.println("Fila cheia? " + f.filaCheia());

        System.out.println("Removido: " + f.removeElemento());
        f.imprimeFila();

        f.insereElemento(40);
        f.imprimeFila();

        System.out.println("Removido: " + f.removeElemento());
        System.out.println("Removido: " + f.removeElemento());
        f.imprimeFila();

        System.out.println("Fila vazia? " + f.filaVazia());
    }
}