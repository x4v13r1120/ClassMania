package edu.example.stock;

import java.text.DecimalFormat;

public class Stock {/**
 * Creating a Stock class
 */
private static DecimalFormat df2 = new DecimalFormat("#.##");

public String tickerSymbol;
    public String companyName;
    public int price;
    public double percentChange;
    public int totalShares;
    public long marketCap;

    //default constructor to set everything to none will be over written
    public Stock(){
        this.tickerSymbol = "none";
        this.companyName = "none";
        this.price = 0;
        this.totalShares = 0;
    }
    public Stock(String tickerSymbol, String companyName, int price, int totalShares){
        setTickerSymbol(tickerSymbol.toUpperCase());
        setCompanyName(companyName);
        setPrice(price);
        setTotalShares(totalShares);
        percentChange = 0;
        marketCap = price * totalShares;
    }

    public Stock(String tickerSymbol, String companyName, Double price){
        setTickerSymbol(tickerSymbol.toUpperCase());
        setCompanyName(companyName);
        setPrice(price);

    }

    //getters and setters
    public void setTickerSymbol(String newTickerSymbol){
        tickerSymbol = newTickerSymbol;
    }

    public String getTickerSymbol(){

        return tickerSymbol;
    }
    public void setCompanyName(String newCompanyName){
        companyName = newCompanyName;
    }

    public String getCompanyName(){
        return companyName;
    }
    /* Setters for price are two:
      1. Set the price for a passed int (for internal commands)
        2. Calculate the integer value equal to the passed double
    */
    //returns price for calculations
    protected int getInternalPrice(){
        return price ;
    }

    public void setPrice(int newPrice){
        price = newPrice;
    }
    public void setPrice(double newPrice){
        price = (int)(newPrice * 100);
    }
    public void setTotalShares(int newTotalShares){
        totalShares = newTotalShares;
    }
    public int getTotalShares(){
        return totalShares;
    }
    //returns readable price
    protected double getPrice(){
        double  cents = (price % 100.0) / 100;
        double dollars = (price - price % 100.0) / 100.0;
        return dollars + cents;
    }

    //This method will change the price by change (change can be positive or negative).  It should also recalculate percentChange and marketCap
    public void setAdjustPrice(int change){
        int newPrice = price + change;
        percentChange = (newPrice - price) / (double)price;
        marketCap = (newPrice * totalShares);
        price = newPrice;
    }

    @Override
    public String toString() {
        return "Ticker Symbol: " + getTickerSymbol() +
                "\nCompany Name: " + getCompanyName() +
                "\nCurrent Price: $" + getPrice() +" (" + df2.format(percentChange) +"%)" +
                "\nMarket Cap: " + marketCap;
    }

}
