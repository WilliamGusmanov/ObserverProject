/**
 * Stock implements Subject
 * @author Bryan Vu,William Gusmanov, Keval Varia
 */

package cecs277OberserverDemo;

import java.util.ArrayList;

public class Stock implements Subject {

    /** every stock has a symbol */
    String symbol;


    /** Amount per stock used to calculate total amount*/
    private double pricePerStock;

    /** list of subscribers to alert for all changes */
    ArrayList<Observer> subscribers;


    /**
     * default constructor
     */
    Stock(){
        symbol = "N/A";
        //listOfBids = new ArrayList(); //initialize list w/ constructor
        pricePerStock = 0.0;
        subscribers = new ArrayList<>();
    }//end default constructor

    Stock(String symbol, double pricePerStock){
        this.symbol = symbol;
        this.pricePerStock = pricePerStock;
        subscribers = new ArrayList<>();
    }//end overloaded constructor

    public double getPricePerStock() {
        return pricePerStock;
    }//end getPricePerStock
    
    /**
     * alert all subscribers
     */
    public String notifyObserver(Bid bidInstance) {
    	String alertMessage = "";
        for (Observer subscriber : subscribers) {
            alertMessage = alertMessage.concat("Agent - name: " +subscriber.getName() + " " +subscriber.update(bidInstance) + "\n");
        }//end for loop
        return alertMessage;
    }//end alert


    @Override
    public void registerObserver(Observer o) {
    	subscribers.add(o);
    }//end registerObserver

    @Override
    public void removeObserver(Observer o) {
    	subscribers.remove(o);
    }//end removeObserver

    //return stock name, #of shares, #dollar amount for trade
    @Override
    public String toString() {
        return "Symbol: " + symbol;
    }//end toString
}//end class
