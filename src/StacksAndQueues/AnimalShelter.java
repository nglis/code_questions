package StacksAndQueues;

// Animal Shelter works in a FIFO manner
public class AnimalShelter {
    Node head;

    public AnimalShelter(String animal) {
        Animal a = new Animal(animal);
        head = new Node(a);
    }

    public void enqueue(String animal) {
        Animal a = new Animal(animal);
        Node n = new Node(a);

        n.next = head;
        head = n;
    }

    public Animal dequeue() {
        if (head == null)
            return null;

        Node n = head;
        head = head.next;
        return (Animal) n.data;
    }

    public Animal dequeueAnimal(String animal) {
        if (head == null)
            return null;

        Animal a = (Animal) head.data;

        if (a.type == animal) {
            head = head.next;
            return a;
        }

        Node tmp = head;
        while (tmp.next != null) {
            Animal b = (Animal) tmp.next.data;
            if (b.type == animal) {
                tmp.next = tmp.next.next;
                return b;
            }
            tmp = tmp.next;
        }
        return null;
    }

    public Animal dequeueDog() {
        return dequeueAnimal("dog");
    }

    public Animal dequeueCat() {
        return dequeueAnimal("cat");
    }

}

class Animal {
    String type;
    public Animal(String type) {
        this.type = type;
    }
}
