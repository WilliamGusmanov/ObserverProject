/**
 * Observer interface 
 * @author Bryan Vu,William Gusmanov, Keval Varia
 */

package com.company;

public interface Observer {
    /**
     * Update the agent about the bid and stock
     * @param newBiD
     * @return String of the update message
     */
    String update(Bid newBiD);

    /**
     * Get subscriber name
     * @return
     */
    String getName();
}//end interface
