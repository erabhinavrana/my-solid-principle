package com.abhi.solid.singleresponsibility;

import com.abhi.solid.singleresponsibility.BookOperations;
import com.abhi.solid.singleresponsibility.BookPersistence;

/**
 * Created by Abhinav on 11/29/2018.
 */
public class Book implements BookOperations {
    private int numberOfPages;
    private String authorName;
    private BookPersistence bookPersistence;

    public Book(String authorName, int numberOfPages){
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.bookPersistence = new BookPersistence();
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public void print(){
        System.out.println("Printing the book....");
    }

    @Override
    public void save(){
        bookPersistence.save(this);
    }

    @Override
    public String toString() {
        return authorName +" - "+ numberOfPages;
    }
}
