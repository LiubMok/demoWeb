package ua.edu.ucu.apps.demo.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.ucu.apps.demo.inventory.IInventory;

import java.util.List;

@Service
public class FlowerService {
    @Autowired
    private IInventory inventory;

    public List<FlowerPack> getAllFlowers(){
        return inventory.getAllFlowerPacks();
    }
}
