/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natasha
 */
public class Book {
    private String author;
    private String bookName;
    private int pages;
    
    public Book(String author, String name, int pages) {
        this.author = author;
        this.bookName = name;
        this.pages = pages;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getName() {
        return this.bookName;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public String toString() {
        return this.author + ", " + this.bookName + ", " + this.pages + " pages";
    }
}
