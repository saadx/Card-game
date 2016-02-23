package proj2;
import cardgames.*;

/**
 * <p>Title: Project 2: Card Game
 * 
 * <p>Description: This program shuffles the deck and deals three cards,
 * 				   displays the cards, checks if there is a pair, finds the highest value,
 * 				   calculates the sum of the point values and checks and displays who won.
 * 
 * @author Saad Ahmad
 *
 */
public class Project2 {
	public static void main(String[] args)
	{
		GUI theWindow = new GUI();
		Deck theDeck = new Deck();
		theDeck.shuffleDeck();
		
		Card card1 = theDeck.dealCard();
		int card1Val = card1.getValue();
		System.out.println("Card 1 is: " + card1.toString());
		
		Card card2 = theDeck.dealCard();
		int card2Val = card2.getValue();
		System.out.println("Card 2 is: " + card2.toString());
		
		//Statements to deal card3 and display result
		Card card3 = theDeck.dealCard();
		int card3Val = card3.getValue();
		System.out.println("Card 3 is: " + card3.toString());
		
		theWindow.showCard(card1);
		theWindow.showCard(card2);
		//Statement to add card3 to theWindow
		theWindow.showCard(card3);
		
		//Modified if statements to compare with card3 too 
		if (card1Val == card2Val) 
			System.out.println("Pair");
		else if (card1Val == card3Val)
			System.out.println("Pair");
		else if (card2Val == card3Val)
			System.out.println("Pair");
		else
			System.out.println("Not a pair");
		
		//Statements to find the value of highest of the the three cards
		if ((card1Val >= card2Val) && (card1Val >= card3Val))
			System.out.println("The highest value is " + card1Val);
		else if ((card2Val >= card1Val) && (card2Val >= card3Val))
			System.out.println("The highest value is " + card2Val);
		else 
			System.out.println("The highest value is " + card3Val);
		
		//Statements to find the sum of the point values of the three cards
		int sum = (card1.getPointValue() + card2.getPointValue() + card3.getPointValue());
		System.out.println("The sum is " + sum);
		
		//Statements to check who won
		if (sum >= 25)
			System.out.println("You win");
		else
			System.out.println("Computer wins");
	}
}