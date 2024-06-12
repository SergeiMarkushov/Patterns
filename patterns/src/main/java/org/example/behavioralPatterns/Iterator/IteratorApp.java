package main.java.org.example.behavioralPatterns.Iterator;

public class IteratorApp {
    public static void main(String[] args) {
        Tasks c = new Tasks();
        Iterator it = c.getIterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}

interface Iterator {
    boolean hasNext();
    Object next();
}
// Agregate
interface Container {
    Iterator getIterator();
}

//ConcreteAggregate
class Tasks implements Container{
    String[] tasks = {"Build the house", "make a child", "Grow the tree"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < tasks.length;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}

