<h2>📘 Exercício 2</h2>

<p>Este programa implementa uma <strong>fila</strong> usando <strong>lista encadeada</strong> em Java.</p>

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

<h4>2. Classe <code>Fila</code></h4>
<p>Responsável por gerenciar a fila.</p>

<p><strong>Atributos:</strong></p>
<ul>
  <li><code>inicio</code>: representa o primeiro elemento da fila (frente).</li>
  <li><code>fim</code>: representa o último elemento da fila (traseira).</li>
  <li><code>tamanho</code>: conta quantos elementos a fila possui.</li>
</ul>

<p><strong>Métodos:</strong></p>
<ul>
  <li><code>insere(int valor)</code>: Insere um novo elemento no fim da fila.</li>
  <li><code>remove()</code>: Remove e retorna o elemento do início da fila.</li>
  <li><code>imprime()</code>: Exibe todos os elementos da fila.</li>
</ul>

<h4>3. <code>main()</code></h4>
<p>Realiza testes com a fila:</p>

<pre><code>Fila fila = new Fila();

fila.insere(10);
fila.insere(20);
fila.insere(30);

fila.imprime();

System.out.println("Elemento removido: " + fila.remove());

fila.imprime();
</code></pre>

<h3>🧪 Saída Esperada</h3>

<pre><code>Fila: [10, 20, 30]
Elemento removido: 10
Fila: [20, 30]
</code></pre>
