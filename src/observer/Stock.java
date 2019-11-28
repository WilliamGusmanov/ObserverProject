package observer;

import java.util.ArrayList;
import java.util.Arrays;

//agents buy and sell stock
//might need an agent class
//colleagues
//when a stock is bought/sold, all observers are notified
//
//implements Subject Observer
//Only one stock at a time. it's static in this sort of way.
public class Stock {
    /**
     * every stock has a symbol
     */
    String symbol;

    /**
     * list of bids
     */
    //ArrayList<Bid> listOfBids;

    Bid latestBid;

    ArrayList<Agent> subscribers;
    /**
     * default constructor
     */
    Stock(){
        symbol = "N/A";
        //listOfBids = new ArrayList(); //initialize list w/ constructor
        latestBid = null;
        subscribers = new ArrayList();
    }

    Stock(String symbol, Agent[] subscribers){
        this.symbol = symbol;
        this.subscribers = (ArrayList<Agent>)(Arrays.asList(subscribers));
        latestBid = null;
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
     * takes in a bid whether its a buy or sale.
     * whenever trade is called, the trade becomes the latest bid.
     * @param bidInstance
     */
    public void trade(Bid bidInstance){
        latestBid = bidInstance;
        alert(); //notify all subscribers about trade
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


    //return stock name, #of shares, #dollar amount for trade
    @Override
    public String toString() {
        return super.toString();
    }
}
