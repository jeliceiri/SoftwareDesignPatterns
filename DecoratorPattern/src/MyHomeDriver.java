package Spr2019.JE;

/**
 * Decorator Pattern
 * MyHomeDriver class
 * @author Jill Eliceiri
 * March 2019
 */
public class MyHomeDriver {
    
    public static void main(String args[]) {
       
        System.out.println("What would the customer like to add to home order?\n");
        ////Customer order No.1
        System.out.println("1. A basic home that comes with living room");
        MyHome home = new BasicHome();
        System.out.println("\t Description: " + home.getDescription() 
            + "\n\t Cost: $" + home.cost()
            + "\n\t Area: " + home.area() + " total square feet\n");

        //Customer order No.2
        System.out.println("2. A basic home with a big bedroom");
        MyHome home2 = new BasicHome();
        home2 = new BigBedroom(home2);

        System.out.println("\t Description: " + home2.getDescription() 
            + "\n\t Cost: $" + home2.cost()
            + "\n\t Area: " + home2.area() + " total square feet\n");
        
        //Customer order No.3
        System.out.println("3. A basic home"
            + " with a big bedroom, small bedroom, and a bathroom");
        MyHome home3 = new BasicHome();
        home3 = new BigBedroom(home3);
        home3 = new SmallBedroom(home3);
        home3 = new Bathroom(home3);
        
        System.out.println("\t Description: " + home3.getDescription() 
            + "\n\t Cost: $" + home3.cost()
            + "\n\t Area: " + home3.area() + " total square feet\n");
        
        //Customer order No.4
        System.out.println("4. A basic home"
            + " with a kitchen, 2 small bedrooms, bathroom, and a study");
        MyHome home4 = new BasicHome();
        home4 = new Kitchen(home4);
        home4 = new SmallBedroom(home4);
        home4 = new SmallBedroom(home4);
        home4 = new Bathroom(home4);
        home4 = new StudyRoom(home4);
        
        System.out.println("\t Description: " + home4.getDescription() 
            + "\n\t Cost: $" + home4.cost()
            + "\n\t Area: " + home4.area() + " total square feet\n");
        
        //Customer order No.5
        System.out.println("5. A basic home with a walk in closet");
        MyHome home5 = new BasicHome();
        home5 = new WalkInCloset(home5);

        System.out.println("\t Description: " + home5.getDescription() 
            + "\n\t Cost: $" + home5.cost()
            + "\n\t Area: " + home5.area() + " total square feet\n");

    }
}
