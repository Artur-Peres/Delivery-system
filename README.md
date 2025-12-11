# Sistema de Cálculo de Menor Caminho com Dijkstra  
Projeto Acadêmico – Matemática Aplicada à Computação (ADS)

## Descrição do Projeto
Este é um projeto acadêmico desenvolvido para a disciplina **Matemática Aplicada à Computação** do curso de **Análise e Desenvolvimento de Sistemas (ADS)**.

O objetivo do projeto é **simular um sistema de delivery de um restaurante**, utilizando o algoritmo de **Dijkstra** para calcular o menor caminho entre os pontos (ruas) de uma cidade fictícia.  
O sistema determina o trajeto mais eficiente para a entrega dos pedidos, levando em conta as distâncias entre os locais.

---

## Funcionalidades
- Representação de um grafo onde cada nó é uma rua e cada aresta representa a distância entre eles.  
- Cálculo do menor caminho entre o restaurante e o cliente usando o algoritmo de Dijkstra.  
- Obtenção dinâmica do próximo nó mais próximo ainda não visitado.  
- Exibição dos custos mínimos de deslocamento.  
- Registro do caminho percorrido.

---

## Estrutura do Algoritmo
Métodos principais:
- `caminhoMenor(final int noOrigem, final int noDestino)` – Executa o algoritmo de Dijkstra.  
- `getMaisPerto(final int listaCustos[], final Set<Integer> naoVisitados)` – Retorna o nó ainda não visitado com menor custo atual.

---

## Fluxo Geral do Sistema de Delivery
1. O sistema inicia no ponto do restaurante.  
2. O grafo é carregado com todos os bairros e distâncias entre eles.  
3. O algoritmo de Dijkstra calcula o menor caminho até o cliente solicitado.  
4. O sistema retorna o custo total da rota e o caminho percorrido.  

---

## Como Executar
1. Certifique-se de ter o JDK instalado.  
2. Compile o projeto:  
   ```bash
   javac Main.java
   java Main

## Autores
https://github.com/Artur-Peres     
https://github.com/JonathamAraujo
