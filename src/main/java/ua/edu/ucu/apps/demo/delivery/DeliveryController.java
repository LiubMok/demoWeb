package ua.edu.ucu.apps.demo.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/delivery")
public class DeliveryController {
    private DeliveryService deliveryService;

    @Autowired
    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping(path = "/all_deliveries")
    public List<Delivery> getDeliveries() {
        return deliveryService.getAllDeliveries();
    }
}
