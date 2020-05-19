package com.example.audiobookplayer;

import java.io.Serializable;

/**
 * Book represents an audiobook to display in the list and play.
 */
public class Book implements Serializable {

    /** String resource ID for the author of the book */
    private int mAuthorId;

    /** String resource ID for the title of the book */
    private int mTitleId;

    /**
     * Create a new Book object.
     *
     * authorId is the string resource ID for the author of the book.
     * titleId is the string resource Id for the title of the book.
     */
    public Book(int authorId, int titleId) {
        mAuthorId = authorId;
        mTitleId = titleId;
    }

    /**
     * Get the string resource ID for the author of the book.
     */
    public int getAuthorId() {
        return mAuthorId;
    }

    /**
     * Get the string resource ID for the title of the book.
     */
    public int getTitleId() {
        return mTitleId;
    }
}
