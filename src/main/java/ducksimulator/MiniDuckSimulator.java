package ducksimulator;

public class MiniDuckSimulator  {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("-----------------");

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        //change the FlyBehavior dynamically
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
