package ua.edu.ucu.apps.demo.item;

import lombok.Getter;

@Getter
public class BasketDecorator extends ItemDecorator{

    private final double paperPrice = 4D;
    private final Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + paperPrice;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "\n" +
                "{decorator: "  + PaperDecorator.class + "}";
    }
}
