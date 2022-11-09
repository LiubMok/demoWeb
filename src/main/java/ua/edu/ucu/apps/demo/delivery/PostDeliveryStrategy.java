package ua.edu.ucu.apps.demo.delivery;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.item.Item;
import java.util.List;

@Getter
@Setter
public class PostDeliveryStrategy implements Delivery{
    private String name;
    private String description;

    public  PostDeliveryStrategy(){
        this.name = "DHLDelivery";
        this.description = "DHLDelivery delivery";
    }

    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("The items have been delivered with the DHL");
        return true;
    }
}
