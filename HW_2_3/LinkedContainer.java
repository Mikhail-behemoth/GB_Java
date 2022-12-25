package HW_2_3;

import java.util.Iterator;

import org.w3c.dom.Node;

public class LinkedContainer <E> implements Linked<E>, Iterable<E>, DescendingIterator<E> {
    
    public static void main(String[] args) {
        LinkedContainer<String> stringLinked = new LinkedContainer<>();
        stringLinked.addLast("abc");
        stringLinked.addFirst("cba");
        System.out.println(stringLinked.size());
        System.out.println(stringLinked.getElementByIndex(1));
        
        System.out.println("----------------");
        for (String s: stringLinked) {
            System.out.println(s);
        }
        
        System.out.println("----------------");
        Iterator iterator = stringLinked.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    
    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size = 0;

    public LinkedContainer() {
        lstNode = new Node<E>(null, fstNode, null);
        fstNode = new Node<E>(null,null,lstNode);
    }
    
    @Override
    public void addLast(E e) {
        Node<E> prev = lstNode;
        prev.setCurrentElement(e);
        lstNode = new Node<E>(null,prev,null);
        prev.setNextElement(lstNode);
        size++;
        
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = fstNode;
        next.setCurrentElement(e);
        fstNode = new Node<>(null, null, next);
        next.setPrevElement(fstNode);
        size++;
        
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = fstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target =getNextElement(target);
        }
        return target.getCurrentElement();
    }

    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElement();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;

            @Override
            public boolean hasNext(){
                return counter < size;
            }            
            @Override
            public E next() {
                return getElementByIndex(counter++);
            }
        };
    }

    private class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        private Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public E getCurrentElement() {
            return currentElement;
        }
        public void setCurrentElement(E currentElement){
            this.currentElement = currentElement;
        }
        public Node<E> getNextElement(){
            return nextElement;
        }
        public void setNextElement(Node<E> nextElement){
            this.nextElement = nextElement;
        }
        public Node<E> getPervElement(){
            return prevElement;
        }
        public void setPrevElement(Node<E> prevElement){
            this.prevElement = prevElement;
        }
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int counter = size - 1;
            
            @Override
            public boolean hasNext(){
                return counter >= 0;
            }            
            @Override
            public E next() {
                return getElementByIndex(counter--);
            }
        };
    }
}
