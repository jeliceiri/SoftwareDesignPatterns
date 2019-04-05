package Spr2019.JE;

/**
 * Decorator Pattern
 * LivingRoom class
 * @author Jill Eliceiri
 * March 2019
 */
public class LivingRoom extends HomeDecorator {  

    
    //instance variable
    MyHome home;

    public LivingRoom(MyHome home) {
            this.home = home;
    }

    @Override
    public String getDescription() {
            return home.getDescription() + ", living room";
    }

    @Override
    public int cost() {
            return 15421 + home.cost();
    }
    
    @Override
    public int area() {
            return 560 + home.area();
    }
    
}


