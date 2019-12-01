/**
 * Runner class for the Observer design pattern
 * @author Bryan Vu,William Gusmanov, Keval Varia
 */

package cecs277OberserverDemo;

public class Main {
    public static void main(String[] args) {
      Stock ORCL = new Stock("ORCL", 171.05);
      Stock BA = new Stock("BA",5);
      Stock TRKX = new Stock("TRKX", 6.812);
      Agent Tom = new Agent("Tom Clancey");
      Agent Robert = new Agent("Robert Mitchner");
      Agent Noah = new Agent("Noa ben Shea");
      Agent Richard = new Agent("Robert Rohr");
      ORCL.registerObserver(Tom);
      ORCL.registerObserver(Robert);
      ORCL.registerObserver(Noah);
      ORCL.registerObserver(Richard);
      System.out.print(Tom.trade(ORCL, 20, TransactionType.BUY));
      BA.registerObserver(Tom);
      BA.registerObserver(Robert);
      System.out.print(Tom.trade(BA, 10, TransactionType.SELL));
      TRKX.registerObserver(Robert);
      TRKX.registerObserver(Noah);
      System.out.print(Noah.trade(TRKX, 30, TransactionType.BUY));
    }//end main
}//end class 
