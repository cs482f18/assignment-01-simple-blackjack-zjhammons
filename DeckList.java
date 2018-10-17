package com.example.zjhammons.blackjackgamehammons;

import android.annotation.SuppressLint;

import java.util.ArrayList;

//I changed the name of this class from decklist to DeckList and it needed to add this to work
@SuppressLint("Registered")


/**
 * This class creates an arraylist of card objects used as the carddeck for the game
 * Version:2 10.9.18
 */
public class DeckList extends MainActivity
{

    //Initialize the deck of Arraylist of cards
private ArrayList<Card> deck;

//Constructor
public  DeckList()
{
    deck = new ArrayList<Card>();
}

    /**
     * This method creates new card objects with the drawable int of the card and the point value
     * and stores them in the ArrayList<Card>
     * @return the deck of card objects
     */
    public ArrayList<Card>  deckPopulate()
{
    Card spadeK = new Card(R.drawable.king_of_spades, 10);
    deck.add(spadeK);
    Card spadeQ = new Card(R.drawable.queen_of_spades, 10);
    deck.add(spadeQ);
    Card spadeJ = new Card(R.drawable.jack_of_spades, 10);
    deck.add(spadeJ);
    Card spade10 = new Card(R.drawable.ten_of_spades, 10);
    deck.add(spade10);
    Card spade9 = new Card(R.drawable.nine_of_spades, 9);
    deck.add(spade9);
    Card spade8 = new Card(R.drawable.eight_of_spades, 8);
    deck.add(spade8);
    Card spade7 = new Card(R.drawable.seven_of_spades, 7);
    deck.add(spade7);
    Card spade6 = new Card(R.drawable.six_of_spades, 6);
    deck.add(spade6);
    Card spade5 = new Card(R.drawable.five_of_spades, 5);
    deck.add(spade5);
    Card spade4 = new Card(R.drawable.four_of_spades, 4);
    deck.add(spade4);
    Card spade3 = new Card(R.drawable.three_of_spades, 3);
    deck.add(spade3);
    Card spade2 = new Card(R.drawable.two_of_spades, 2);
    deck.add(spade2);
    Card spadeA = new Card(R.drawable.ace_of_spades, 1);
    deck.add(spadeA);

    Card clubK = new Card(R.drawable.king_of_clubs, 10);
    deck.add(clubK);
    Card clubQ = new Card(R.drawable.queen_of_clubs, 10);
    deck.add(clubQ);
    Card clubJ = new Card(R.drawable.jack_of_clubs, 10);
    deck.add(clubJ);
    Card club10 = new Card(R.drawable.ten_of_clubs, 10);
    deck.add(club10);
    Card club9 = new Card(R.drawable.nine_of_clubs, 9);
    deck.add(club9);
    Card club8 = new Card(R.drawable.eight_of_clubs, 8);
    deck.add(club8);
    Card club7 = new Card(R.drawable.seven_of_clubs, 7);
    deck.add(club7);
    Card club6 = new Card(R.drawable.six_of_clubs, 6);
    deck.add(club6);
    Card club5 = new Card(R.drawable.five_of_clubs, 5);
    deck.add(club5);
    Card club4 = new Card(R.drawable.four_of_clubs, 4);
    deck.add(club4);
    Card club3 = new Card(R.drawable.three_of_clubs, 3);
    deck.add(club3);
    Card club2 = new Card(R.drawable.two_of_clubs, 2);
    deck.add(club2);
    Card clubA = new Card(R.drawable.ace_of_clubs, 1);
    deck.add(clubA);

    Card heartK = new Card(R.drawable.king_of_hearts, 10);
    deck.add(heartK);
    Card heartQ = new Card(R.drawable.queen_of_hearts, 10);
    deck.add(heartQ);
    Card heartJ = new Card(R.drawable.jack_of_hearts, 10);
    deck.add(heartJ);
    Card heart10 = new Card(R.drawable.ten_of_hearts, 10);
    deck.add(heart10);
    Card heart9 = new Card(R.drawable.nine_of_hearts, 9);
    deck.add(heart9);
    Card heart8 = new Card(R.drawable.eight_of_hearts, 8);
    deck.add(heart8);
    Card heart7 = new Card(R.drawable.seven_of_hearts, 7);
    deck.add(heart7);
    Card heart6 = new Card(R.drawable.six_of_hearts, 6);
    deck.add(heart6);
    Card heart5 = new Card(R.drawable.five_of_hearts, 5);
    deck.add(heart5);
    Card heart4 = new Card(R.drawable.four_of_hearts, 4);
    deck.add(heart4);
    Card heart3 = new Card(R.drawable.three_of_hearts, 3);
    deck.add(heart3);
    Card heart2 = new Card(R.drawable.two_of_hearts, 2);
    deck.add(heart2);
    Card heartA = new Card(R.drawable.ace_of_hearts, 1);
    deck.add(heartA);

    Card dimK = new Card(R.drawable.king_of_diamonds, 10);
    deck.add(dimK);
    Card dimQ = new Card(R.drawable.queen_of_diamonds, 10);
    deck.add(dimQ);
    Card dimJ = new Card(R.drawable.jack_of_diamonds, 10);
    deck.add(dimJ);
    Card dim10 = new Card(R.drawable.ten_of_diamonds, 10);
    deck.add(dim10);
    Card dim9 = new Card(R.drawable.nine_of_diamonds, 9);
    deck.add(dim9);
    Card dim8 = new Card(R.drawable.eight_of_diamonds, 8);
    deck.add(dim8);
    Card dim7 = new Card(R.drawable.seven_of_diamonds, 7);
    deck.add(dim7);
    Card dim6 = new Card(R.drawable.six_of_diamonds, 6);
    deck.add(dim6);
    Card dim5 = new Card(R.drawable.five_of_diamonds, 5);
    deck.add(dim5);
    Card dim4 = new Card(R.drawable.four_of_diamonds, 4);
    deck.add(dim4);
    Card dim3 = new Card(R.drawable.three_of_diamonds, 3);
    deck.add(dim3);
    Card dim2 = new Card(R.drawable.two_of_diamonds, 2);
    deck.add(dim2);
    Card dimA = new Card(R.drawable.ace_of_diamonds, 1);
    deck.add(dimA);
    return deck;
}

    /**
     * This method takes the first card from the list and returns it.
     * It removes it from the deck so the same card cannot be used twice
     * @return the card
     */
    public Card drawCard(){
        Card topCard = deck.get(deck.size() - 1);
        deck.remove((deck.size()) - 1);
        topCard.getCardImage();
        return topCard;
    }

}