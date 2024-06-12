package main.java.org.example.behavioralPatterns.State;

public class StateApp2 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Work());

        human.doSomething();
        human.doSomething();
        human.doSomething();
        human.doSomething();
        human.doSomething();
        human.doSomething();

    }
}

class Human {
    private Activity state;

    public void setState(Activity activity) {
        this.state = activity;
    }

    public void doSomething() {
        state.doSomething(this);
    }
}

interface Activity {
    void doSomething(Human human);
}

class Work implements Activity {

    @Override
    public void doSomething(Human human) {
        System.out.println("Working!");
        human.setState(new Weekend());
    }
}

class Weekend implements Activity {
    private int count = 0;

    @Override
    public void doSomething(Human human) {
        if (count < 3) {
            System.out.println("Weekend!");
            count++;
        } else {
            human.setState(new Work());
        }
    }
}