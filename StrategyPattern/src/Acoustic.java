package Spr2019.Strategy.JE;

/**
 * Strategy Pattern
 * @author Jill Eliceiri
 * Feb 12, 2019
 */
public class Acoustic implements GuitarBehavior {
    
    @Override
    public void playGuitar(){
        System.out.println("\t Playing a beautiful ACOUSTIC Gibson");
        
    }
    
}