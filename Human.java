public class Human extends Actor {
    @Override
    public void setMakeOrder(boolean status) {
        isMakeOrder = status;
    }

    @Override
    public void setTakeOrder(boolean status) {
        isTakeOrder = status;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        super.name = name;
    }
}
