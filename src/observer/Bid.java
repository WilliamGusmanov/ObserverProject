package observer;

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
    private TransactionType tType;
    private int sharesAmount;



    /**
     * Aggregation: The two transaction types: BUY & SELL
     */
    /**
     * default constructor
     */
    Bid(){
        this.stockInstance = null;
        this.tType = TransactionType.BUY;
    }
    /**
     * constructor
     * @param stockInstance
     * @param tType
     */
    Bid(Stock stockInstance, TransactionType tType){
        this.stockInstance = stockInstance;
        this.tType = tType;
    }

    /**
     * - - - - change contents as per instruction - - - -
     * @return
     */
    @Override
    public String toString() {
        return "Bid{" +
                "stockInstance=" + stockInstance +
                ", tType=" + tType +
                '}';
    }
}
