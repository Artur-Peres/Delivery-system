import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Grafo {
     private int vertices[][];

     public Grafo(final int numVertices){
         vertices = new int[numVertices][numVertices];
     }

     public void criarAresta(final int noOrigem, final int noDestino, final int peso){
         if (peso>=1){
             vertices[noOrigem][noDestino]= peso;
             vertices[noDestino][noOrigem]= peso;
         } else {
             System.out.println("O peso do nó origem ["+noOrigem+"] para o nó destino ["+noDestino+"] não deve ser negativo!");
         }
     }

     private int getMaisPerto(final int listaCustos[], final Set<Integer> naoVisitados){
         int menorDistancia= Integer.MAX_VALUE;
         int noProximo= 0;
         for (Integer i : naoVisitados){
             if (listaCustos[i] < menorDistancia){
                menorDistancia= listaCustos[i];
                noProximo = i;
             }
         }
         return noProximo;
     }

     private List<Integer> getVizinhos(final int no){
         List<Integer> vizinhos= new ArrayList<Integer>();
         for (int i= 0; i< vertices.length; i++){
            if (vertices[no][i]> 0){
                vizinhos.add(i);
            }
         }
         return vizinhos;
     }

     private int getCusto(final int noOrigem, final int noDestino){
         return vertices[noOrigem][noDestino];
     }

    public List<Integer> caminhoMenor(final int noOrigem, final int noDestino){
        int custo[]= new int[vertices.length];
        int antecessor[]= new int[vertices.length];
        Set<Integer> naoVisitado= new HashSet<Integer>();

        custo[noOrigem]= 0;

        for (int v= 1; v< vertices.length; v++){
            if (v != noOrigem){
                custo[v]= Integer.MAX_VALUE;
            }
            antecessor[v]= -1;
            naoVisitado.add(v);
        }
        while (!naoVisitado.isEmpty()){
            int noMaisPerto= getMaisPerto(custo, naoVisitado);
            naoVisitado.remove(noMaisPerto);
            for (Integer vizinhos : getVizinhos(noMaisPerto)){
                int custoTotal = custo[noMaisPerto] + getCusto(noMaisPerto, vizinhos);
                if (custoTotal < custo[vizinhos]) {
                    custo[vizinhos] = custoTotal;
                    antecessor[vizinhos]= noMaisPerto;
                }
            }
            if (noMaisPerto == noDestino) {
                return caminhoMaisPerto(antecessor, noMaisPerto);
            }
        }
        return null;
    }

    public List<Integer> caminhoMaisPerto(final int antecessor[], int noMaisPerto){
        List<Integer> caminho = new ArrayList<Integer>();
        caminho.add(noMaisPerto);

        while (antecessor[noMaisPerto]!= -1){
            caminho.add(antecessor[noMaisPerto]);
            noMaisPerto= antecessor[noMaisPerto];
        }
        Collections.reverse(caminho);
        return caminho;
    }
}
