public class DuckSim {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();

    Duck model = new ModelDuck();
    /**
    The first call to performFly() delegates the flyBehaviour
    object sets in the ModelDucks's constructor.
    **/
    model.performFly();
    /**
    This invokes the models inheritted behaviour setter.
    **/
    model.setFlyBehaviour(new FlyRocketPowered());
    /**
    This allows us to change the dukcs behaviour at Runtime.
    **/
    model.performFly();

    Duck modelDuck = new ModelDuck();
    modelDuck.setQuackBehaviour(new QuackMimicCall());
    modelDuck.performQuack();
  }
}
