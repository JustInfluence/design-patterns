public class ModelDuck extends Duck {
  public ModelDuck() {
    // ModelDuck begins life grounded.
    flyBehaviour = new FlyNoWay();
    quackBehaviour = new Quack();
  }

  public void display() {
    System.out.println("I'm a model duck!");
  }
}
