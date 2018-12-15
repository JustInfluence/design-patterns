public abstract class Duck {
  // Declare two reference vars for the behaviour
  // interface types. All duck sub-classes inherit these.
  FlyBehaviour flyBehaviour;
  QuackBehaviour quackBehaviour;

  public Duck() {}

  public abstract void display();

  public void setFlyBehaviour(FlyBehaviour fb) {
    flyBehaviour = fb;
  }

  public void setQuackBehaviour(QuackBehaviour qb) {
    quackBehaviour = qb;
  }

  public void performFly() {
    // Delegate behaviour class
    flyBehaviour.fly();
  }

  public void performQuack() {
    // Delegate behaviour class
    quackBehaviour.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}
