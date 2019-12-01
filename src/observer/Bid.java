/**
 * A Bid is a transaction of stocks
 * that includes the stock name, amount. and transaction type
 * bid object, takes in a stock instance in the constructor
 * takes in a transaction type.
 * Everytime there is a bid, an alert should be sent out to all observers
 * @author Bryan Vu,William Gusmanov, Keval Varia
 */

package cecs277OberserverDemo;


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
    }//end default constructor

    /**
     * constructor
     * @param stockInstance type of stock
     * @param tType type of transaction
	 * @param amountOfShares amount of stock shares 
     */
    Bid(Stock stockInstance, int amountOfShares, TransactionType tType){
        this.stockInstance = stockInstance;
        this.sharesAmount = amountOfShares;
        this.tType = tType;
    }//end overloaded constructor

    public double getTradePrice() {
        return (sharesAmount * stockInstance.getPricePerStock());
    }//end getTradePrice


    /**
     * - - - - change contents as per instruction - - - -
     * @return
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
    }//ense toString
}//end class 