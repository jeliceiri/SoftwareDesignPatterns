package Spr2019.Strategy.JE;

/**
 * Strategy Pattern
 * GameCharacterSmith Class
 * @author Jill Eliceiri
 * Feb 12, 2019
 */
public class GameCharacterSmith extends GameCharacter {
    
    //constructor
    public GameCharacterSmith(){
        guitarBehavior = new ElectroAcoustic();
    }
    
    @Override
    public void display(){
        System.out.println("Smith Game Character");
    }
    
}
