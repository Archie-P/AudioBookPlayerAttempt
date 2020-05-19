package com.example.audiobookplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Player extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        /**
         * Displays the data passed on by the intent.
         */
        Intent intent = getIntent();

        int positionTextView = intent.getIntExtra("Position", 0);
            TextView positionView = (TextView) findViewById(R.id.position);
            positionView.setText("Position in List is: " + positionTextView);

        String titleTextView = intent.getStringExtra("titleTransfer");
        TextView titleView = (TextView) findViewById(R.id.book_title);
        titleView.setText("Title: " + titleTextView);

 /*       String authorTextView = getIntent().getStringExtra("bookAuthor");
        TextView authorView = (TextView) findViewById(R.id.author_text_view);
        authorView.setText("Author: " + authorTextView);*/
        }
        }



