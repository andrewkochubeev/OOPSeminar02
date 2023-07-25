import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    List<Actor> queue;

    Market() {
        queue = new ArrayList<>();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add((Actor) actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder == false)
                actor.setMakeOrder(true);
            System.out.println(actor.getName() + " сделал заказ");
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isTakeOrder == false)
                actor.setTakeOrder(true);
            System.out.println(actor.getName() + " получил заказ");
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder) {
                releasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);

    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " вошел в магазин");
        takeInQueue(actor);

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            queue.remove(actor);
            System.out.println(actor.getName() + " вышел из магазина");
        }

    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

}
