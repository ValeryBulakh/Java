package jv.api.lesson.HW4;

import java.util.LinkedList;

class MyQueue {
    private LinkedList<Object> elements = new LinkedList<>();

    public MyQueue() { }

    public MyQueue(LinkedList<Object> linkedList) {
        this.elements = linkedList;
    }

    public void enqueue(Object element) {
        elements.addLast(element);
    }

    public Object dequeue() {
        return elements.removeFirst();
    }

    public Object first() {
        return elements.getFirst();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }
}

public class Dz4 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue("Первый");
        queue.enqueue("Второй");
        queue.enqueue("Третий");

        Object firstElement = queue.dequeue();
        System.out.println("Первый элемент: " + firstElement);

        Object peekElement = queue.first();
        System.out.println("Элемент для просмотра: " + peekElement);

        System.out.println("Очередь пуста? " + queue.isEmpty());

        System.out.println("Размер очереди: " + queue.size());
    }
}