package Spr2019.JE;

/**
 * Decorator Pattern
 * Kitchen class
 * @author Jill Eliceiri
 * March 2019
 */
public class Kitchen extends HomeDecorator {  

    
    //instance variable
    MyHome home;

    public Kitchen(MyHome home) {
            this.home = home;
    }

    @Override
    public String getDescription() {
            return home.getDescription() + ", kitchen";
    }

    @Override
    public int cost() {
            return 13544 + home.cost();
    }
    
    @Override
    public int area() {
            return 500 + home.area();
    }
    
}


