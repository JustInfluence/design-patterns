/**
Fly behaviour implmentation for Ducks that do NOT fly.
(RubberDucks, DecoyDucks).
**/
public class FlyNoWay implements FlyBehaviour {
  public void fly() {
    System.out.println("I can't fly.");
  }
}
