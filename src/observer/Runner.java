package observer;

public class Runner {
    public static void main(String[] args) {
        System.out.println("hello world");
        Stock ORCL = new Stock();
        Stock BA = new Stock();
        Stock TRKX = new Stock();

        Agent Tom = new Agent("Tom Clancey", new Stock[] {BA, TRKX});
        Agent Robert = new Agent("Robert Mitchner", new Stock[] {ORCL, TRKX});

    }
}
