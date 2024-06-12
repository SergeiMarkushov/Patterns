package main.java.org.example.creationalPatterns.Prototype;

public class Prototype {
    public static void main(String[] args) {
        Human original = new Human(18, "Vasya");
        Object copy = original.copy();
        System.out.println(original);
        System.out.println(copy);

        HumanFactory factory = new HumanFactory(original);
        Human human = factory.makeCopy();
        System.out.println(human);

    }
}

interface Copyable {
    Object copy();
}

class Human implements Copyable{
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Object copy() {
        Human copy = new Human(age, name);
        return copy;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        setPrototype(human);
    }
    public void setPrototype(Human human) {
        this.human = human;
    }
    Human makeCopy() {
        return (Human) human.copy();
    }
}


