package ua.edu.ucu.apps.demo.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.inventory.IInventory;
import ua.edu.ucu.apps.demo.inventory.InventoryStaticStream;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {

    @Autowired
    private IInventory inventory;

    @GetMapping(path = "/all_flowers")
    public List<FlowerPack> getFlowers(){
        return inventory.getAllFlowerPacks();
    }
}
