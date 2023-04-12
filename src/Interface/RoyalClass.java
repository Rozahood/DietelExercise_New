package Interface;

public class RoyalClass implements RoyalInterface{

    @Override
    public void eat(){
        RoyalInterface.sleep();
    }

  static void cook(){
            System.out.println("I am cooking");
        }
}
