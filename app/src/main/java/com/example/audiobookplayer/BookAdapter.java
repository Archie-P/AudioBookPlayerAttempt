package com.example.audiobookplayer;

import android.content.Context;
import androidx.core.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * BookAdapter is an ArrayAdapter that can provide the layout for each list item
 * based on a data source, which is a list of Book objects.
 */
public class BookAdapter extends ArrayAdapter<Book>  {

    /**
     * Create a new BookAdapter object.
     *
     * context is the current context (i.e. Activity) that the adapter is being created in.
     * books is the list of Books to be displayed.
     * colorResourceId is the resource ID for the background color for this list of words
     */
    public BookAdapter(Context context, ArrayList<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }

        // Get the Book Word object located at this position in the list
        Book currentBook = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title_text_view.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the title from the currentWord object and set this text on
        // the title TextView.
        titleTextView.setText(currentBook.getTitleId());

        // Find the TextView in the list_item.xml layout with the ID author_text_view.
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author_text_view);
        // Get the author from the currentBook object and set this text on
        // the author TextView.
        authorTextView.setText(currentBook.getAuthorId());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}