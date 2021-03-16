import java.util.HashSet;
import java.util.Set;

public class Graph<T> {
    public Set<Node<T>> nodes;

    public Graph() {
        nodes = new HashSet<>();
    }

    public boolean addNode(Node<T> n){
        return nodes.add(n);
    }

    public boolean addEdge(Node<T> a, Node<T> b){
        if (!nodes.contains(a) || !nodes.contains(b)){
            return false;
        }
        if (!a.neighbors.contains(b))
            a.neighbors.add(b);
        if (!b.neighbors.contains(a))
            b.neighbors.add(a);
        return true;
    }
}
