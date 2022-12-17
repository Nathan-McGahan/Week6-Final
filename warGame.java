package warGameFinal;

public class warGame {
public static void main (String[] args) {
//create an instance of Deck
Deck deck = new Deck();

//create an instance of player1
Player player1 = new Player("Nathan");

//create an instance of player2
Player player2 = new Player("Adrian");

//shuffle the deck
deck.shuffle();

System.out.println("This is the Game of War!");
System.out.println("---------------------------");
System.out.println("Player 1 is " + player1.getName());
System.out.println("Player 2 is " + player2.getName());
System.out.println("---------------------------");


//iterate 52 times calling the Draw method on the other player
for(int i=0; i<52; i++) {
if(i%2==0) {
player1.draw(deck);
} else 
player2.draw(deck);
}


//iterate 26 times and call the flip method for each player.
for(int i=0; i<26; i++)
{
	
Card card1 = player1.flip();
Card card2 = player2.flip();

if (card1.getValue() > card2.getValue()) {
player1.incrementScore();
System.out.println("Player 1 has won this hand.");
} else if 
	(card1.getValue() < card2.getValue()) {
player2.incrementScore();
System.out.println("Player 2 has won this hand.");
} else {
	System.out.println("This hand is a draw.");
}


System.out.println(player1.getName() + " has "+ player1.getScore() + " points");
System.out.println(player2.getName() + " has " + player2.getScore() + " points");
System.out.println("---------------------------");
}


//Print the final score of each player
System.out.println ("Score of " + player1.getName() + ": " + player1.getScore());
System.out.println ("Score of " + player2.getName() + ": " + player2.getScore());

//display the result
if(player1.getScore() > player2.getScore())
System.out.println ("Player 1, " + player1.getName() + ", is the winner.");
else if(player1.getScore() < player2.getScore())
System.out.println ("Player 2, " + player2.getName() + ", is the winner.");
else
System.out.println ("Draw");
}
}

