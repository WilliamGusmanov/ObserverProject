/**
 * A Bid is a transaction of stocks
 * that includes the stock name, amount. and transaction type
 * bid object, takes in a stock instance in the constructor
 * takes in a transaction type.
 * Everytime there is a bid, an alert should be sent out to all observers
 * @author Bryan Vu,William Gusmanov, Keval Varia
 */

package com.company;

public class Bid {
    /** a reference to the current stock at bid */
    private Stock stockInstance;
    /** Number of shares of this particular stock*/
    private int sharesAmount;
    /** Transaction type: Buy or Sell*/
    private TransactionType tType;


    /**
     * default constructor
     */
    Bid(){
        this.stockInstance = null;
        this.tType = TransactionType.BUY;
        sharesAmount = 0;
    }//end default constructor


    /**
     * Overloaded constructor
     * @param stockInstance type of stock
     * @param tType type of transaction
	 * @param amountOfShares amount of stock shares 
     */
    Bid(Stock stockInstance, int amountOfShares, TransactionType tType){
        this.stockInstance = stockInstance;
        this.sharesAmount = amountOfShares;
        this.tType = tType;
    }//end overloaded constructor


    /**
     * Product of number of share and price per share. This gives us the whole trade price.
     * @return whole trade value for this stock instance
     */
    public double getTradePrice() {
        return (sharesAmount * stockInstance.getPricePerStock());
    }//end getTradePrice


    /**
     * - - - - change contents as per instruction - - - -
     * @return String of details about this bid
     */
    @Override
    public String toString() {

        String type = "";
        if(tType == TransactionType.BUY){
            type = "Buying ";
        }//end if
        else{
            type = "Selling ";
        }// end lse

        return "alerted to Bid- " +
                stockInstance + " " +
                type + sharesAmount +
                " shares for the amount: $" + getTradePrice();
    }//end toString
}//end class 