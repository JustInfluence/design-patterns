public class MallardDuck extends Duck {
  /**
  A MallardDuck uses the quack class to handle its quack.
  So when performQuack() is called, the responsibility for the
  quack is delegated to the Quack object.

  And it uses FlyWithWings as its FlyBehavious type.
  **/
  public MallardDuck() {
    quackBehaviour = new Quack();
    flyBehaviour = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Mallard Duck!");
  }
}
