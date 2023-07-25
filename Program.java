/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Борис");
        Human h2 = new Human();
        h2.setName("Иван");
        Market market = new Market();
        market.acceptToMarket(h1);
        market.acceptToMarket(h2);
        market.update();
    }
}