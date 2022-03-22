package listaencadeada;

import lombok.val;

public class ChainedList<T> {

    private Node<T> head;

    public void add(T element) {
        Node<T> node = new Node<>(element);
        node.setNext(head);
        this.head = node;
    }

    @Override
    public String toString() {
        val stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        Node<T> node = head;

        while (node != null) {
            stringBuffer.append(node.getElement() + " ");
            node = node.getNext();
        }

        stringBuffer.append("]");

        return stringBuffer.toString();
    }

}
