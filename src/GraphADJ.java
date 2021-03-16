import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphADJ<T> {
    int n;
    List<T> valeurs;
    boolean[][] adj;

    public GraphADJ(Graph<T> g){
        this.valeurs = new ArrayList<>();
        n = g.nodes.size();
        adj = new boolean[n][n];
        for (Node<T> noeud : g.nodes){
            valeurs.add(noeud.value);
        }
        for (Node<T> noeud : g.nodes){
            int source_id = valeurs.indexOf(noeud.value);
            for (Node<T> voisin : noeud.neighbors){
                adj[source_id][valeurs.indexOf(voisin.value)] = true;
            }
        }
    }

    public int heuristiqueControle(){
        int[] grandGamma = new int[n];
        for (int i = 0; i < n; i++) {
            int gamma = 1;
            for (int j = 0; j < n; j++) {
                if (adj[i][j] && grandGamma[j] == gamma)
                    gamma = gamma + 1;
            }
            grandGamma[i] = gamma;
        }
        return max(grandGamma);
    }

    public int max(int[] a){
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m)
                m = a[i];
        }
        return m;
    }
}