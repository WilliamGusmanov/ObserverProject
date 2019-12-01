/**
 * Agent implements Observer
 * @author Bryan Vu,William Gusmanov, Keval Varia
 */

package cecs277OberserverDemo;


public class Agent implements Observer{
	/**
	 * the name of the agent
	 */
    private String nameOfAgent;
    /**
     * the latest bid made by that agent
     */
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
     * @param bidInstance
     */
    public String trade(Stock stockInstance, int amountOfShares, TransactionType tType){
        Bid newBid = new Bid(stockInstance,amountOfShares,tType);
        return stockInstance.notifyObserver(newBid); //notify all subscribers about trade
    }//end trade 

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

    
    @Override
    public String toString() {
        return "Agent - name: " +  nameOfAgent + " " + latestBid.toString();
    }//end toString
}//end class