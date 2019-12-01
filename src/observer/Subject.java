/**
 * Subject interface
 * @author Bryan Vu,William Gusmanov, Keval Varia
 */

package com.company;

public interface Subject {
    /**
     * Register an Observer
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * Unsubscribe or remove an Observer from the list.
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * Notify the Observer of any updates on the bid
     * @param bidInstance
     * @return String message of the update.
     */
    String notifyObserver(Bid bidInstance);
}