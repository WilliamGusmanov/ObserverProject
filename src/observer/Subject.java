/**
 * Subject interface
 * @author Bryan Vu,William Gusmanov, Keval Varia
 */

package cecs277OberserverDemo;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    String notifyObserver(Bid bidInstance);
}