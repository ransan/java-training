package design_problems.duck_simulator;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck realDuck = new RealDuck();
        realDuck.performFly();
        realDuck.performQuack();
        realDuck.performSwim();
        realDuck.display();

        Duck woodenDuck = new WoodDuck();
        woodenDuck.performFly();
        woodenDuck.performQuack();
        woodenDuck.performSwim();
        woodenDuck.display();
    }
}
