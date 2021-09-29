package Exc_17;

public class Book {
    private String author, name;
    private int year, pages;

    Book(String author, String name, int year, int pages){
        this.author=author;
        this.name=name;
        this.year=year;
        this.pages=pages;
    }

    void setAuthor(String author){this.author=author;}
    void setName(String name){this.name=name;}
    void setYear(int year){ this.year=year;}
    void setPages(int pages){this.pages=pages;}

    String getName(){return this.name;}
    String getAuthor(){return this.author;}
    int getPages(){return this.pages;}
    int getYear(){return this.year;}

}
