<h2>📘 Exercício 3</h2>

<p>Este programa implementa o <strong>merge</strong> de duas <strong>filas ordenadas</strong> usando <strong>vetores circulares</strong> em Java.</p>

<h3>📦 Estrutura do Código</h3>

<h4>1. Classe <code>FilaVetor</code></h4>
<p>Gerencia a fila utilizando um vetor circular.</p>

<p><strong>Atributos:</strong></p>
<ul>
  <li><code>elementos</code>: array que armazena os valores da fila.</li>
  <li><code>inicio</code>: índice do início da fila.</li>
  <li><code>fim</code>: índice do fim da fila.</li>
  <li><code>capacidade</code>: capacidade máxima da fila.</li>
  <li><code>tamanho</code>: número atual de elementos na fila.</li>
</ul>

<p><strong>Métodos:</strong></p>
<ul>
  <li><code>insere(int valor)</code>: insere um elemento no fim da fila, se não estiver cheia.</li>
  <li><code>remove()</code>: remove e retorna o primeiro elemento da fila.</li>
  <li><code>imprime()</code>: imprime os elementos da fila em ordem.</li>
  <li><code>vazia()</code>: retorna <code>true</code> se a fila estiver vazia.</li>
  <li><code>primeiro()</code>: retorna o primeiro elemento da fila sem removê-lo.</li>
</ul>

<h4>2. Função <code>merge(FilaVetor filaA, FilaVetor filaB)</code></h4>
<p>Realiza a fusão de duas filas ordenadas <code>filaA</code> e <code>filaB</code> em uma nova fila <code>filaC</code>, também ordenada.</p>

<ul>
  <li>Compara os primeiros elementos de <code>filaA</code> e <code>filaB</code>.</li>
  <li>Insere o menor valor na <code>filaC</code>.</li>
  <li>Continua o processo até que todas as filas estejam vazias.</li>
</ul>

<h4>3. <code>main()</code></h4>
<p>Interage com o usuário, preenche as filas A e B, realiza o merge e imprime os resultados.</p>

<pre><code>Scanner scanner = new Scanner(System.in);
FilaVetor filaA = new FilaVetor(10);
FilaVetor filaB = new FilaVetor(10);

System.out.println("Preencha a Fila A (ordenada):");
preencherFila(filaA, scanner);

System.out.println("Preencha a Fila B (ordenada):");
preencherFila(filaB, scanner);

FilaVetor filaC = merge(filaA, filaB);
filaC.imprime();
</code></pre>

<h4>4. Função <code>preencherFila</code></h4>
<p>Permite que o usuário insira valores manualmente para cada fila:</p>
<ul>
  <li>O usuário digita um número por vez.</li>
  <li>Quando digita <code>sair</code>, a entrada termina.</li>
</ul>

<h3>🧪 Exemplo de Saída Esperada</h3>

<pre><code>Preencha a Fila A (ordenada):
Próximo elemento: 1
Próximo elemento: 4
Próximo elemento: 7
Próximo elemento: sair

Preencha a Fila B (ordenada):
Próximo elemento: 2
Próximo elemento: 3
Próximo elemento: 6
Próximo elemento: sair

Fila A:
Fila: [1, 4, 7]

Fila B:
Fila: [2, 3, 6]

Realizando merge...

Fila C (resultado do merge):
Fila: [1, 2, 3, 4, 6, 7]
</code></pre>
