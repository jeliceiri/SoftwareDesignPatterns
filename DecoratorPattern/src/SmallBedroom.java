package Spr2019.JE;

/**
 * Decorator Pattern
 * SmallBedroom class
 * @author Jill Eliceiri
 * March 2019
 */
public class SmallBedroom extends HomeDecorator {  

    
    //instance variable
    MyHome home;

    public SmallBedroom(MyHome home) {
            this.home = home;
    }

    @Override
    public String getDescription() {
            return home.getDescription() + ", small bedroom";
    }

    @Override
    public int cost() {
            return 10000 + home.cost();
    }
    
    @Override
    public int area() {
            return 300 + home.area();
    }
    
}


