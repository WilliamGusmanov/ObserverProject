/**
 * Stock implements Subject
 * @author Bryan Vu,William Gusmanov, Keval Varia
 */

package com.company;

import java.util.ArrayList;

public class Stock implements Subject {

    /** every stock has a symbol */
    String symbol;
    /** Amount per stock used to calculate total amount*/
    private double pricePerStock;
    /** list of subscribers to alert for all changes */
    ArrayList<Observer> subscribers;

    /**
     * Default Constructor
     */
    Stock(){
        symbol = "N/A";
        pricePerStock = 0.0;
        subscribers = new ArrayList<>();
    }//end default constructor

    /**
     * Overloaded Constructor
     * @param symbol
     * @param pricePerStock
     */
    Stock(String symbol, double pricePerStock){
        this.symbol = symbol;
        this.pricePerStock = pricePerStock;
        subscribers = new ArrayList<>();
    }//end overloaded constructor


    /**
     * getter method for pricePerStock variable
     * @return pricePerStock
     */
    public double getPricePerStock() {
        return pricePerStock;
    }//end getPricePerStock


    /**
     * Register an observer
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
    	subscribers.add(o);
    }//end registerObserver


    /**
     * Unsubscribe an observer from the list
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
    	subscribers.remove(o);
    }//end removeObserver


    /**
     * Notify the observers for all updates to the Stock
     * @param bidInstance
     * @return alertMessage
     */
    public String notifyObserver(Bid bidInstance) {
        String alertMessage = "";
        for (Observer subscriber : subscribers) {
            alertMessage = alertMessage.concat("Agent - name: " +subscriber.getName() + " " +subscriber.update(bidInstance) + "\n");
        }//end for loop
        return alertMessage;
    }//end alert


    /**
     * Overridden toString method
     * @return String
     */
    @Override
    public String toString() {
        return "Symbol: " + symbol;
    }//end toString
}//end class
