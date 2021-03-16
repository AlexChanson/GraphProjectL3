import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Node<T> {
    public T value;
    public List<Node<T>> neighbors;

    public Node(T elem) {
        this.value = elem;
        this.neighbors = new ArrayList<>();
    }

    public Node(T value, List<Node<T>> neighbors) {
        this.value = value;
        this.neighbors = neighbors;
    }

}
