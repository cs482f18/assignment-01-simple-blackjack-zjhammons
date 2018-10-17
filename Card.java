package com.example.zjhammons.blackjackgamehammons;

/**
 * This Class creates a Card object that has the Drawable id of the card along with the
 * score associated with the specific card.
 * Version:1 10.4.18
 */
public class Card extends  DeckList { // Why are extending the DeckList? Does not seem to be logical.

   /** Add javadoc comments for your instance variables. E.g., the image id of the Card */
    private int cardImage;
    /** The numeric value of the card */
    private int score;


    /**
     * This constructor creates a new card object
     * @param cardImage // add a description of the parameter e.g. look at the following line
     * @param score the numeric valu of the Card
     */
public Card(int cardImage, int score ) {
    this.cardImage = cardImage;
    this.score = score;
}

//Get the cards image and returns it
public int getCardImage()
{
    return cardImage;
}

//gets the cards point value and returns it
public int getScore()
{
    return score;
}






}
