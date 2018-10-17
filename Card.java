package com.example.zjhammons.blackjackgamehammons;

/**
 * This Class creates a Card object that has the Drawable id of the card along with the
 * score associated with the specific card.
 * Version:1 10.4.18
 */
public class Card extends  DeckList{

private int cardImage;
private int score;


    /**
     * This constructor creates a new card object
     * @param cardImage
     * @param score
     */
    public Card(int cardImage, int score )
{
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
