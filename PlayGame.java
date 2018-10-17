package com.example.zjhammons.blackjackgamehammons;

/**
 * This class will consist of all the methods to play the blackjack game
 * Version:1 10.10.18
 */
public class PlayGame {

//Create deck variable
private DeckList deck;

    /**
     * This method creates a new deck and populates it for the game
     */
    public void playGame()
{
    deck = new DeckList();
    deck.deckPopulate();
}

    /**
     * This method deals the first two cards when the user clicks new game.
     */
    public void dealFirstTwo()
{
    Card p1 = deck.drawCard();
    p1.getCardImage();
    Card p2 = deck.drawCard();
}














}
