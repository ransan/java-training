package design_problems.duck_simulator;

public abstract class Duck {
    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performSwim() {
        System.out.println("<< I can Swim >>");
    }

    abstract void display();
}
