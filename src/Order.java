import java.util.ArrayList;

public class Order {
    public ArrayList<Item> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public float total() {
        float total = 0;
        for(Item item : items) {
            total += item.price;
        }
        return total;
    }
}