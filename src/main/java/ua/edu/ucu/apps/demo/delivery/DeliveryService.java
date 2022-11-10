package ua.edu.ucu.apps.demo.delivery;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {
    public List<Delivery> getAllDeliveries(){
        return List.of(new DHLDeliveryStrategy(), new PostDeliveryStrategy());
    }
}
