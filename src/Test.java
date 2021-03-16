public class Test {
    public static void main(String[] args) {
        // Graphe 2 du controle
        Graph<Integer> g2 = new Graph<>();
        Node<Integer> n1 = new Node<>(1);
        g2.addNode(n1);
        Node<Integer> n2 = new Node<>(2);
        g2.addNode(n2);
        Node<Integer> n3 = new Node<>(3);
        g2.addNode(n3);
        Node<Integer> n4 = new Node<>(4);
        g2.addNode(n4);
        Node<Integer> n5 = new Node<>(5);
        g2.addNode(n5);
        Node<Integer> n6 = new Node<>(6);
        g2.addNode(n6
        );
        g2.addEdge(n1, n2);
        g2.addEdge(n1, n3);
        g2.addEdge(n2, n4);
        g2.addEdge(n2, n5);
        g2.addEdge(n3, n5);
        g2.addEdge(n3, n6);

        GraphADJ<Integer> g2_adj = new GraphADJ<>(g2);
        System.out.println("nombre chromatique = " + g2_adj.heuristiqueControle());
    }
}
