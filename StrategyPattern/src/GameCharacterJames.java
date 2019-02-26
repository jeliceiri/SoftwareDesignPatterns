package Spr2019.Strategy.JE;

/**
 * Strategy Pattern
 * GameCharacterJames Class
 * @author Jill Eliceiri
 * Feb 12, 2019
 */
public class GameCharacterJames extends GameCharacter {
    
    //constructor
    public GameCharacterJames(){
        guitarBehavior = new Bass();
    }
    
    @Override
    public void display(){
        System.out.println("James Game Character");
    }
    
}
