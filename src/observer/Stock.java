package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;

//agents buy and sell stock
//might need an agent class
//colleagues
//when a stock is bought/sold, all observers are notified
//
//implements Subject Observer
//Only one stock at a time. it's static in this sort of way.
public class Stock implements Subject {

    /** every stock has a symbol */
    String symbol;

    /** Bid for the stock */
    private Bid latestBid;

    /** Amount per stock used to calculate total amount*/
    private double pricePerStock;

    /** list of subscribers to alert for all changes */
    ArrayList<Agent> subscribers;


    /**
     * default constructor
     */
    Stock(){
        symbol = "N/A";
        //listOfBids = new ArrayList(); //initialize list w/ constructor
        latestBid = null;
        pricePerStock = 0.0;
        subscribers = new ArrayList();
    }

    Stock(String symbol, double pricePerStock, ArrayList<Agent> subscribers){
        this.symbol = symbol;
        this.pricePerStock = pricePerStock;
        this.subscribers = subscribers;
    }

    public double getPricePerStock() {
        return pricePerStock;
    }
    /**
     * alert all subscribers
     */
    public void alert() {
        for (Agent subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    /**
     * returns a copy of the Bid
     * @return
     */
    public Bid getBid(){
        /*
        return new Bid(latestBid) //COPY ?
         */
        return latestBid;
    }


    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObserver() {

    }


    //return stock name, #of shares, #dollar amount for trade
    @Override
    public String toString() {
        return "Symbol: " + symbol;
    }

}
