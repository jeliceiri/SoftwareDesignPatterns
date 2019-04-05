package Spr2019.JE;

/**
 * Decorator Pattern
 * WalkInCloset class
 * @author Jill Eliceiri
 * March 2019
 */
public class WalkInCloset extends HomeDecorator {  

    
    //instance variable
    MyHome home;

    public WalkInCloset(MyHome home) {
            this.home = home;
    }

    @Override
    public String getDescription() {
            return home.getDescription() + ", walk in closet";
    }

    @Override
    public int cost() {
            return 2130 + home.cost();
    }
    
    @Override
    public int area() {
            return 51 + home.area();
    }
    
}


