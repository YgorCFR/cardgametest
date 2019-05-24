  package br.uff.qet.cardgame.tests;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.*;
import br.uff.qet.cardgame.*;

public class CardTest {
	private final Card card = new Card(Suit.CLUBS, Rank.FIVE);
	
	@Test
	public void getSuitTest () {
		assertNotEquals(Suit.DIAMONDS, card.getSuit());
		assertNotEquals(Suit.HEARTS, card.getSuit());
		assertNotEquals(Suit.SPADES, card.getSuit());
		assertEquals(Suit.CLUBS, card.getSuit());	
	}
	
	@After
	public void getTypeTest () {
		assertNotEquals(Rank.ACE, card.getType());
		assertNotEquals(Rank.EIGHT, card.getType());
		assertEquals(Rank.FIVE, card.getType());
		assertNotEquals(Rank.FOUR, card.getType());
		assertNotEquals(Rank.JACK, card.getType());
		assertNotEquals(Rank.KING, card.getType());
		assertNotEquals(Rank.NINE, card.getType());
		assertNotEquals(Rank.QUEEN, card.getType());
		assertNotEquals(Rank.SEVEN, card.getType());
		assertNotEquals(Rank.SIX, card.getType());
		assertNotEquals(Rank.TEN, card.getType());
		assertNotEquals(Rank.THREE, card.getType());
		assertNotEquals(Rank.TWO, card.getType());
		
	}
	
	@After
	public void getValueTest () {
		for (int i = 1; i < 11; i ++) 
		{
			if (i != 5)
			{
				assertNotEquals(i, card.getValue());
			}	
			else {
				assertEquals(i, card.getValue());
			}
		}
	}
}