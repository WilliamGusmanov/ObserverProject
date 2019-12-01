/**
 * Agent implements Observer
 * @author Bryan Vu,William Gusmanov, Keval Varia
 */

package com.company;

public class Agent implements Observer{
	/** the name of the agent */
    private String nameOfAgent;
    /** the latest bid made by that agent */
    private Bid latestBid;


    /**
     * default constructor
     */
    Agent(){
        this.nameOfAgent = "N/A";
    }//default constructor


    /**
     * Overloaded constructor for the Agent
     * @param name name of the agent
     */
    Agent(String name) {
        this.nameOfAgent = name;
    }//end overloaded constructor


    /**
     * takes in a bid whether its a buy or sale.
     * whenever trade is called, the trade becomes the latest bid.
     * @param stockInstance
     * @param amountOfShares
     * @param tType
     * @return notification message
     */
    public String trade(Stock stockInstance, int amountOfShares, TransactionType tType){
        Bid newBid = new Bid(stockInstance,amountOfShares,tType);
        return stockInstance.notifyObserver(newBid); //notify all subscribers about trade
    }//end trade 


    /**
     * Return the details about the new big to be updated.
     * @param newBid
     * @return String containing details about the new bid
     */
    @Override
    public String update(Bid newBid) {
        return newBid.toString();
    }//end update


    /**
     * getter method for the name of the agent
     * @return name of the agent 
     */
    public String getName() {
    	return nameOfAgent;
    }


    /**
     * Overriden toString method
     * @return
     */
    @Override
    public String toString() {
        return "Agent - name: " +  nameOfAgent + " " + latestBid.toString();
    }//end toString
}//end class