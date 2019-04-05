package Spr2019.JE;

/**
 * Decorator Pattern
 * StudyRoom class
 * @author Jill Eliceiri
 * March 2019
 */
public class StudyRoom extends HomeDecorator {  

    
    //instance variable
    MyHome home;

    public StudyRoom(MyHome home) {
            this.home = home;
    }

    @Override
    public String getDescription() {
            return home.getDescription() + ", study room";
    }

    @Override
    public int cost() {
            return 14896 + home.cost();
    }
    
    @Override
    public int area() {
            return 550 + home.area();
    }
}


