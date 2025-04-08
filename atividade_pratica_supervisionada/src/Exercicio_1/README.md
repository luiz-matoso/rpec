<h2>📘 Exercício 1</h2>

<p>Este programa implementa uma <strong>pilha</strong> usando <strong>lista encadeada</strong> em Java.
<h3>📦 Estrutura do Código</h3>

<h4>1. Classe <code>No</code></h4>
<p>Representa um <strong>nó da lista encadeada</strong>:</p>

<pre><code>static class No {
    int valor;
    No proximo;
}
</code></pre>

<ul>
  <li><code>valor</code>: armazena o número.</li>
  <li><code>proximo</code>: aponta para o próximo nó.</li>
</ul>

<h4>2. Classe <code>Pilha</code></h4>
<p>Responsável por gerenciar a pilha.</p>

<p><strong>Atributos:</strong></p>
<ul>
  <li><code>topo</code>: representa o elemento no topo da pilha.</li>
  <li><code>tamanho</code>: conta quantos elementos a pilha possui.</li>
</ul>

<p><strong>Métodos:</strong></p>
<ul>
  <li><code>insere(int valor)</code>: Insere um novo elemento no topo da pilha.</li>
  <li><code>remove()</code>: Remove e retorna o elemento do topo.</li>
  <li><code>imprime()</code>: Exibe todos os elementos da pilha.</li>
</ul>

<h4>3. <code>main()</code></h4>
<p>Realiza testes com a pilha:</p>

<pre><code>Pilha pilha = new Pilha();

pilha.insere(10);
pilha.insere(20);
pilha.insere(30);

pilha.imprime();
System.out.println("Elemento removido: " + pilha.remove());
pilha.imprime();
</code></pre>

<h3>🧪 Saída Esperada</h3>

<pre><code>Pilha: [30, 20, 10]
Elemento removido: 30
Pilha: [20, 10]
</code></pre>