package main.java.org.example.Delegate;

public class DelegatePatternExampleWaiter {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Guest guest = new Guest();
        guest.makeOrder(waiter, new Beef());

        guest.makeOrder(waiter,new Chicken());

        guest.makeOrder(waiter,new Salmon());


    }
}

interface Dish {
    void bring();
}

class Chicken implements Dish {
    @Override
    public void bring() {
        System.out.println(" chicken");
    }
}
class Beef implements Dish {
    @Override
    public void bring() {
        System.out.println(" beef");
    }
}
class Salmon implements Dish {
    @Override
    public void bring() {
        System.out.println(" salmon");
    }
}

class Waiter {
    Dish dish;

    void setDish(Dish dish) {
        this.dish = dish;
    }
    void bringDish(){
        System.out.print("Here is yours");
        dish.bring();
    }

}

class Guest {
    void makeOrder(Waiter waiter, Dish dish){
        waiter.setDish(dish);
        waiter.bringDish();
    }
}
