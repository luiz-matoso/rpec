<h2>📘 Exercício 3</h2>

<p>Este programa implementa o <strong>merge</strong> de duas <strong>filas ordenadas</strong> usando <strong>listas encadeadas</strong> em Java.</p>

<h3>📦 Estrutura do Código</h3>

<h4>1. Classe <code>No</code></h4>
<p>Representa um <strong>nó da lista encadeada</strong>:</p>

<pre><code>static class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}
</code></pre>

<ul>
  <li><code>valor</code>: armazena o número.</li>
  <li><code>proximo</code>: aponta para o próximo nó.</li>
</ul>

<h4>2. Classe <code>FilaLista</code></h4>
<p>Responsável por gerenciar a fila.</p>

<p><strong>Atributos:</strong></p>
<ul>
  <li><code>inicio</code>: representa o início da fila.</li>
  <li><code>fim</code>: representa o final da fila.</li>
  <li><code>tamanho</code>: quantidade de elementos na fila.</li>
</ul>

<p><strong>Métodos:</strong></p>
<ul>
  <li><code>insere(int valor)</code>: insere um elemento no fim da fila.</li>
  <li><code>remove()</code>: remove e retorna o elemento do início da fila.</li>
  <li><code>imprime()</code>: imprime os elementos da fila em ordem.</li>
  <li><code>vazia()</code>: verifica se a fila está vazia.</li>
  <li><code>primeiro()</code>: retorna o primeiro valor da fila (sem remover).</li>
</ul>

<h4>3. Função <code>merge(FilaLista filaA, FilaLista filaB)</code></h4>
<p>Realiza a fusão de duas filas ordenadas <code>filaA</code> e <code>filaB</code> em uma nova fila <code>filaC</code>, também ordenada.</p>

<ul>
  <li>Compara os primeiros elementos de <code>filaA</code> e <code>filaB</code>.</li>
  <li>Insere o menor valor em <code>filaC</code>.</li>
  <li>Repete o processo até que ambas as filas estejam vazias.</li>
</ul>

<h4>4. <code>main()</code></h4>
<p>Interage com o usuário, preenche as filas A e B, realiza o merge e imprime o resultado:</p>

<pre><code>Scanner scanner = new Scanner(System.in);
FilaLista filaA = new FilaLista();
FilaLista filaB = new FilaLista();

System.out.println("Preencha a Fila A (ordenada):");
preencherFila(filaA, scanner);

System.out.println("Preencha a Fila B (ordenada):");
preencherFila(filaB, scanner);

System.out.println("Realizando merge...");
FilaLista filaC = merge(filaA, filaB);

filaC.imprime();
</code></pre>

<h4>5. Função <code>preencherFila</code></h4>
<p>Auxilia na entrada de dados via terminal:</p>
<ul>
  <li>Usuário digita números ordenados.</li>
  <li>O processo para quando digita "sair".</li>
</ul>

<h3>🧪 Exemplo de Saída Esperada</h3>

<pre><code>Preencha a Fila A (ordenada):
Próximo elemento: 1
Próximo elemento: 3
Próximo elemento: 5
Próximo elemento: sair

Preencha a Fila B (ordenada):
Próximo elemento: 2
Próximo elemento: 4
Próximo elemento: 6
Próximo elemento: sair

Fila A:
Fila: [1, 3, 5]

Fila B:
Fila: [2, 4, 6]

Realizando merge...

Fila C (resultado do merge):
Fila: [1, 2, 3, 4, 5, 6]
</code></pre>
