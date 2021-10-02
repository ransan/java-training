package design_problems.duck_simulator;

public class WoodDuck extends Duck {

    public WoodDuck() {
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyWithoutWings();
    }

    @Override
    void display() {
        System.out.println("<< I am WoodenDuck >>");
    }
}
