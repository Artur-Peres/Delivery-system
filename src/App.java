public class App {
    private static final int r1= 0;
    private static final int r2= 2;
    private static final int r3= 3;
    private static final int r4= 4;
    private static final int r5= 5;
    private static final int r6= 6;
    private static final int r7= 7;
    private static final int r8= 8;
    private static final int r9= 9;
    private static final int r10= 10;

    public static void main(String[] args) {

        Grafo grafo= new Grafo(10);
        //rua 1
        grafo.criarAresta(r1, r2, 16);
        grafo.criarAresta(r2, r3,14);
    }
}
