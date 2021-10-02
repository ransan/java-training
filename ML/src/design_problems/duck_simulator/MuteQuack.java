package design_problems.duck_simulator;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("<< Can't Quack >>");
    }
}
