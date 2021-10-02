package design_problems.duck_simulator;

public class FlyWithoutWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("<< Can't Fly >>");
    }
}
