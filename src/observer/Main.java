package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Stock ORCL = new Stock("ORCL", 171.05, new ArrayList<Agent>());
        Stock BA = new Stock();
        Stock TRKX = new Stock();

        Bid test = new Bid(ORCL, 20, TransactionType.BUY);
//        System.out.println(test.toString());

        Agent Tom = new Agent("Tom Clancey", test, new ArrayList<Stock>());
        Agent Robert = new Agent("Robert Mitchner", test,  new ArrayList<Stock>());
        System.out.println(Tom.toString());
    }
}
