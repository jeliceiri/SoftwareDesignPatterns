package Spr2019.JE;

/**
 * Decorator Pattern
 * BigBedroom class
 * @author Jill Eliceiri
 * March 2019
 */
public class BigBedroom extends HomeDecorator {
    
    //instance variable
    MyHome home;

    public BigBedroom(MyHome home) {
            this.home = home;
    }

    @Override
    public String getDescription() {
            return home.getDescription() + ", big bedroom";
    }

    @Override
    public int cost() {
            return 12561 + home.cost();
    }
    
    @Override
    public int area() {
            return 450 + home.area();
    }
    
}
