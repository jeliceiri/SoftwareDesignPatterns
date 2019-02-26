package Spr2019.Strategy.JE;

/**
 * Strategy Pattern
 * @author Jill Eliceiri
 * Feb 12, 2019
 */
public class GameCharacterEmily extends GameCharacter {
    
    //constructor
    public GameCharacterEmily(){
        guitarBehavior = new Acoustic();
    }
    
    @Override
    public void display(){
        System.out.println("Emily Game Character");
    }
}
