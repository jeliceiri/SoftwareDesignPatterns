package Spr2019.Strategy.JE;

/**
 * Strategy Pattern
 * ElectroAcoustic Class
 * @author Jill Eliceiri
 * Feb 12, 2019
 */
public class ElectroAcoustic implements GuitarBehavior {
    
    @Override
    public void playGuitar(){
        System.out.println("\t Playing an ELECTRO-acoustic guitar");
        
    }
}