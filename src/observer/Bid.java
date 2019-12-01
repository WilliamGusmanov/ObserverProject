package com.company;

import java.util.ArrayList;

/**
 * bid object, takes in a stock instance in the constructor
 * takes in a transaction type.
 * Everytime there is a bid, an alert should be sent out to all observers
 *
 */
public class Bid {
    /**
     * a reference to the current stock at bid
     */
    private Stock stockInstance;
    private int sharesAmount;
    private TransactionType tType;

    /**
     * Aggregation: The two transaction types: BUY & SELL
     */
    /**
     * default constructor
     */
    Bid(){
        this.stockInstance = null;
        this.tType = TransactionType.BUY;
        sharesAmount = 0;
    }

    /**
     * constructor
     * @param stockInstance
     * @param tType
     */
    Bid(Stock stockInstance, int amountOfShares, TransactionType tType){
        this.stockInstance = stockInstance;
        this.sharesAmount = amountOfShares;
        this.tType = tType;
    }

    public double getTradePrice() {
        return (sharesAmount * stockInstance.getPricePerStock());
    }


    /**
     * - - - - change contents as per instruction - - - -
     * @return
     */
    @Override
    public String toString() {

        String type = "";
        if(tType == TransactionType.BUY){
            type = "Buying ";
        }
        else{
            type = "Selling ";
        }

        return "alerted to Bid- " +
                stockInstance + " " +
                type + sharesAmount +
                " shares for the amount: $" + getTradePrice();
    }
}