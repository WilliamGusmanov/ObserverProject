package observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;

public class Agent {
    private String nameOfAgent;
    private Stock currentAlert;
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
     * @param stocksToSubscribe
     */
    Agent(String name, Stock[] stocksToSubscribe) {
        this.nameOfAgent = name;
        this.stockSubscription = (ArrayList<Stock>) Arrays.asList(stocksToSubscribe); //convert Array to Array List using type cast
    }
    /**
     * agent is subscribed to a stock.
     * getBid returns the change that occurred w/ stock.
     */
    public Bid update(Stock stock){
        return stock.getBid();
    }

    @Override
    public String toString() {
        return nameOfAgent + " alerted to Bid- " + currentAlert.toString() + "";
    }
}

//we have stocks, with subscribers.
//whenevever a stock is bought/sold. Notify all subscribers
//agents carry bids on these stocks and subscribe to the notifications of these stocks
//
//
