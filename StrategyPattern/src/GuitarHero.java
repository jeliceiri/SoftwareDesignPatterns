package Spr2019.Strategy.JE;

/**
 * Strategy Pattern
 * GuitarHero the main controlling class
 * @author Jill Eliceiri
 * Feb 12, 2019
 */
public class GuitarHero {
    
    public static void main(String[] args) {
        
        //create and instantiate new game character object
        GameCharacter player1 = new GameCharacterEmily();
        player1.display();
        player1.performPlayGuitar();
        
        //dynamically change the guitar behavior
        player1.setGuitarBehavior(new Weird());
        player1.display();
        player1.performPlayGuitar();
        
        //create and instantiate new game character object
        GameCharacter player2 = new GameCharacterJames();
        player2.display();
        player2.performPlayGuitar();
        
        //dynamically change the guitar behavior
        player2.setGuitarBehavior(new SemiAcoustic());
        player2.display();
        player2.performPlayGuitar();

        //create and instantiate new game character object
        GameCharacter player3 = new GameCharacterJohnson();
        player3.display();
        player3.performPlayGuitar();
        
        //dynamically change the guitar behavior
        player3.setGuitarBehavior(new Bass());
        player3.display();
        player3.performPlayGuitar();
        
        //create and instantiate new game character object
        GameCharacter player4 = new GameCharacterSmith();
        player4.display();
        player4.performPlayGuitar();
        
        //dynamically change the guitar behavior
        player4.setGuitarBehavior(new Acoustic());
        player4.display();
        player4.performPlayGuitar();
        
    }// main
}
