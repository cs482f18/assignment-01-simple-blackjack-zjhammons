package com.example.zjhammons.blackjackgamehammons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

//Create view
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the user clicks the new game button,
     * it creates the deck and deals the fisrt two cards for each player
     *
     * Version:5 (10.10.18)
     *
     */


    /**
     * This method is called when the user clicks the new game button,
     * it creates the deck and deals the fisrt two cards for each player
     *
     * Version:5 (10.10.18)
     *
     */
    public void play(View v)
    {
        //get the dealer and player scores
        EditText dealerScore = (EditText) findViewById(R.id.dealerScore);
        EditText playerScore = (EditText) findViewById(R.id.playerScoreReal);

        //Populate and shuffle a new deck of Card objects
        DeckList dealerHand = new DeckList();
        ArrayList<Card> c = dealerHand.deckPopulate();
        Collections.shuffle(c);
        Collections.shuffle(c);

        //Set the score and card images for the dealer
        ImageView dealerCard1 = (ImageView) findViewById(R.id.dealerCard1);
        dealerCard1.setImageResource(c.get(2).getCardImage());
         dealerScore.setText(" " + c.get(2).getScore());
        ImageView dealerCard2 = (ImageView) findViewById(R.id.dealerCard2);
        dealerCard2.setImageResource( c.get(3).getCardImage() );
        dealerScore.setText(" " + c.get(3).getScore());

        ImageView dealerCard3 = (ImageView) findViewById(R.id.dealerCard3);
        ImageView dealerCard4 = (ImageView) findViewById(R.id.dealerCard4);
        ImageView dealerCard5 = (ImageView) findViewById(R.id.dealerCard5);

        //Set the score and card images for the dealer
        ImageView playerCard1 = (ImageView) findViewById(R.id.playerCard1);
        playerCard1.setImageResource( c.get(4).getCardImage() );
        playerScore.setText(" " + c.get(4).getScore());
        ImageView playerCard2 = (ImageView) findViewById(R.id.playerCard2);
        playerCard2.setImageResource( c.get(5).getCardImage() );
        playerScore.setText(" " + c.get(5).getScore());
        ImageView playerCard3 = (ImageView) findViewById(R.id.playerCard3);
        ImageView playerCard4 = (ImageView) findViewById(R.id.playerCard4);
        ImageView playerCard5 = (ImageView) findViewById(R.id.playerCard5);
    }
}
