package design_problems.duck_simulator;

public class RealDuck extends Duck {

    public RealDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("<< RealDuck >>");
    }

}
