package Spr2019.Strategy.JE;

/**
 * Strategy Pattern
 * GameCharacterJohnson Class
 * @author Jill Eliceiri
 * Feb 12, 2019
 */
public class GameCharacterJohnson extends GameCharacter {
    
    public GameCharacterJohnson(){
        guitarBehavior = new Electric();
    }
    
    @Override
    public void display(){
        System.out.println("Johnson Game Character");
    }
    
}
