package Spr2019.Strategy.JE;

/**
 * Strategy Pattern
 * Bass Class
 * @author Jill Eliceiri
 * Feb 12, 2019
 */
public class Bass implements GuitarBehavior {
    
    @Override
    public void playGuitar(){
        System.out.println("\t Playing a neat walking BASS pattern");
        
    }
}
