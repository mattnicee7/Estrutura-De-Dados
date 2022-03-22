package listaencadeada;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Node<T> {

    private T element;
    private Node<T> next;

    public Node(T element) {
        this.element = element;
    }

}
