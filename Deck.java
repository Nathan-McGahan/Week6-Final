package warGameFinal;

import java.util.ArrayList;
import java.util.Random;


//Deck class
public class Deck
{
//List of Card
private ArrayList<Card> cards;

//constructor
public Deck()
{
String Rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
String Suit[] = {"Club", "Diamond", "Heart", "Spade"};
cards = new ArrayList<>();

for(int i=0; i<4; i++)
{
for(int j=0; j<13; j++)
{
String name = Rank[j] + " of " + Suit[i];
Card acard = new Card(name, j+1);
cards.add(acard);
}
}
}

//shuffles the cards
public void shuffle()
{
Random rand = new Random();
for(int i=1; i<52; i++)
{
int j = rand.nextInt(52-i) + i;
Card tmp = cards.get(i-1);
cards.set(i-1, cards.get(j));
cards.set(j, tmp);
}
}

//removes and returns the top card of the Cards field
public Card draw()
{
Card topCard = cards.get(cards.size()-1);

cards.remove(topCard);

return topCard;
}
}