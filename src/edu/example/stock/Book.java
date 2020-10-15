package edu.example.stock;

public class Book {
    /**
     * Basic description: Data Class for Books
     */
    private String authorFirstName;
    private String authorLastName;
    private String title;
    // private String isbn;  ignore for now,TODO add later
    private int price;

    //Default constructor to set everything to none for later overwriting
    public Book() {
        this.authorFirstName = "none";
        this.authorLastName = "none";
        this.title = "none";
        this.price = 0;
    }

    //Constructor with author and title
    public Book(String author, String title){
        setAuthorName(author);
        this.title = title;
    }
    //constructor with price
    public Book(String author, String title, double price){
        setAuthorName(author);
        this.title = title;
        setPrice(price);

    }

    // getters & setters
    protected void setAuthorName(String author){
        String[] names = author.split(" ");
        authorFirstName = names[0];
        authorLastName = names[1];
    }
    protected String getAuthor(){
        return authorFirstName + " " + authorLastName;
    }

    /* Setters for price are two:
        1. Set the price for a passed int (for internal commands)
        2. Calculate the integer value equal to the passed double
     */
    protected void setPrice(int newPrice){
        price = newPrice;
    }
    protected void setPrice(double newPrice){
        price = (int)(newPrice * 100);
    }

    //returns price for calculations
    protected int getInteralPrice(){
        return price;
    }
    //returns readable price
    protected double getPrice(){
        double  cents = (price % 100.0) / 100.0;
        double dollars = (price - price % 100.0) / 100.0;
        return dollars + cents;
    }
    protected  String getTitle(){
        return title;
    }

    //lets override toString() (which all classes have)
    @Override
    public String toString() {
        return "\nYour book is \"" + title + "\""+
                " written by " + authorFirstName + " " + authorLastName +
                ".\nWith a price of $" + getPrice() + "!";
    }
}
