package Spr2019.Strategy.JE;

/**
 * Strategy Pattern
 * Electric Class
 * @author Jill Eliceiri
 * Feb 12, 2019
 */
public class Electric implements GuitarBehavior {
    @Override
    public void playGuitar(){
        System.out.println("\t Playing a screaming, awesome ELECTRIC guitar solo");
        
    }
}
