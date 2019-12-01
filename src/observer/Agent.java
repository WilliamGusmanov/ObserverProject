package com.company;

//CHANGES 5:10 PM WG
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;

public class Agent implements Observer{
    private String nameOfAgent;
    private Stock currentAlert;
    private Bid latestBid;

    private ArrayList<Stock> stockSubscription;
//name
    /**
     * default constructor
     */
    Agent(){
        this.nameOfAgent = "N/A";
        stockSubscription = new ArrayList<>();
    }

    /**
     * takes in name and list of stocks to subscribe to
     * @param name
     * @param stockSubscription
     */
    Agent(String name, Bid latestBid, ArrayList<Stock> stockSubscription) {
        this.nameOfAgent = name;
        this.latestBid = latestBid;
        this.stockSubscription = stockSubscription;
    }


    /**
     * takes in a bid whether its a buy or sale.
     * whenever trade is called, the trade becomes the latest bid.
     * @param bidInstance
     */
    public void trade(Bid bidInstance){
        latestBid = bidInstance;
        currentAlert.alert(); //notify all subscribers about trade
    }


    /**
     * agent is subscribed to a stock.
     * getBid returns the change that occurred w/ stock.
     */
    public Bid update(Stock stock){
        return stock.getBid();
    }


    @Override
    public String update(Bid newBid) {
        return "";
    }


    @Override
    public String toString() {
        return "Agent - name: " +  nameOfAgent + " " + latestBid.toString();
    }
}

//we have stocks, with subscribers.
//whenevever a stock is bought/sold. Notify all subscribers
//agents carry bids on these stocks and subscribe to the notifications of these stocks
//
//
