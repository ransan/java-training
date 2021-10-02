package design_problems.duck_simulator;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
       System.out.println("<< Quack >>");
    }
}
