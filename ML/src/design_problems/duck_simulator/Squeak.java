package design_problems.duck_simulator;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("<< Squeak >>");
    }
}
