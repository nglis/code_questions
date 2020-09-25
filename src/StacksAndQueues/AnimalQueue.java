package StacksAndQueues;

import java.util.LinkedList;

// AnimalType in place of what should be called Animal
abstract class AnimalType {
    private int order;
    protected String name;
    public AnimalType(String n) {
        name = n;
    }

    public void setOrder(int ord) {
        order = ord;
    }

    public int getOrder() {
        return order;
    }

    public boolean isOlderThan(AnimalType a) {
        return order > a.getOrder();
    }
}

public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();

    private int order;

    public void enqueue(AnimalType a) {
        a.setOrder(order);
        order++;

        if (a instanceof Dog)
            dogs.addLast((Dog) a);
        else if (a instanceof Cat)
            cats.addLast((Cat) a);
    }

    public AnimalType dequeueAny() {
        if (dogs.size() == 0)
            return dequeueCats();
        else if (cats.size() == 0)
            return dequeueDogs();

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderThan(cat))
            return dequeueDogs();
        else
            return dequeueCats();
    }

    public Cat dequeueCats() {
        return cats.poll();
    }

    public Dog dequeueDogs() {
        return dogs.poll();
    }
}

class Dog extends AnimalType {
    public Dog(String n) {
        super(n);
    }
}

class Cat extends AnimalType {
    public Cat(String n) {
        super(n);
    }
}