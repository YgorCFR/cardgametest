/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */

import cardgame.Card;
import cardgame.Dealer;
import cardgame.Deck;
import cardgame.Game;
import cardgame.Player;
import cardgame.Rank;
import cardgame.Suit;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.core.CombinableMatcher;
import org.junit.After;
import org.junit.Test;

public class CardTest {
    
    
    private final Card card = new Card(Suit.CLUBS, Rank.JACK);
    private final Dealer dealer = new Dealer();
    private final Deck deck = new Deck();
    private final Player player = new Player("Ygor");
    private final Game game = new Game();
    
    Rank rank;
    
    
    public  void jogar(){     
       testaCard();
       testaDealer();
       testaDeck();
       testaGame();
    }

    @Test
    public void testaCard() {
        assertEquals(Suit.DIAMONDS, card.getSuit());
        assertEquals(3, card.getValue());
        assertEquals(Rank.KING, card.getType());
    }
    
    @Test
    public void testaDealer() {
        assertEquals(5,dealer.countUnshuffledCards());
        assertEquals(1002, dealer.countCards());
    }
    
    @Test
    public void testaDeck(){
        assertNull("deveser nulo", deck.dealCard());
    }
    
    @Test
    public void testaGame(){
        assertNotNull("nãodeve ser nulo", game.countPlayers());
        assertSame("deve ser o mesmo", "KLO", game.checkWinner());
    }
}