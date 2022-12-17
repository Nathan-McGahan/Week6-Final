package warGameFinal;

import java.util.ArrayList;


//Player class
public class Player
{
//instance variable
private ArrayList<Card> hand;
private int score;
private String name;

//constructor
public Player(String name)
{
this.name = name;
hand = new ArrayList<>();
score = 0;
}

//return the name
public String getName()
{
return name;
}

//return the score
public int getScore()
{
return score;
}

//prints out information about the player
public void describe()
{
System.out.println ("Player name: " + name);
for(int i=0; i<hand.size(); i++)
{
hand.get(i).describe();
}
}

//removes and returns the top card of the Hand
public Card flip()
{
Card topCard = hand.get(hand.size()-1);

hand.remove(topCard);

return topCard;
}

//takes a Deck as an argument and calls the draw method on the deck,
//adding the returned Card to the hand field
public void draw(Deck deck)
{
Card card = deck.draw();
hand.add(card);
}

//adds 1 to the Player’s score field
public void incrementScore()
{
score = score + 1;
}
}