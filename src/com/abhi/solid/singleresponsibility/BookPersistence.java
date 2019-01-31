package com.abhi.solid.singleresponsibility;

/**
 * Created by Abhinav on 11/29/2018.
 */
public class BookPersistence {
    public void save(Book book){
        System.out.println("Printing Book "+ book.toString());
    }
}
