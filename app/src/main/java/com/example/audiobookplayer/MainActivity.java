package com.example.audiobookplayer;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audiobooks_list);

        // Create a list of books
        final ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book(R.string.author_book1, R.string.title_book1));
        books.add(new Book(R.string.author_book2, R.string.title_book2));
        books.add(new Book(R.string.author_book3, R.string.title_book3));
        books.add(new Book(R.string.author_book4, R.string.title_book4));
        books.add(new Book(R.string.author_book5, R.string.title_book5));
        books.add(new Book(R.string.author_book6, R.string.title_book6));
        books.add(new Book(R.string.author_book7, R.string.title_book7));
        books.add(new Book(R.string.author_book8, R.string.title_book8));
        books.add(new Book(R.string.author_book9, R.string.title_book9));
        books.add(new Book(R.string.author_book10, R.string.title_book10));

        // Create a BookAdapter that creates list items for the items in the Book list.
        BookAdapter adapter = new BookAdapter(this, books);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // audiobooks_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        // Set a click listener to start the player activity when the list item is clicked on

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Book book = (Book) adapterView.getItemAtPosition(position);
                Object bookTitle = book.getTitleId();
               String intentTitleId = String.valueOf(bookTitle);
                Intent player = new Intent(MainActivity.this, Player.class);
                player.putExtra("Position", position);
               player.putExtra("titleTransfer", intentTitleId);



/*                player.putExtra("bookTitle", books.get(position).getTitleId());
                player.putExtra(" bookAuthor", books.get(position).getAuthorId());*/
                startActivity(player);
            }
        });

    }
}
