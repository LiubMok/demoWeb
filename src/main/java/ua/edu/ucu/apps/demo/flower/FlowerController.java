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

    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping(path = "/all_flowers")
    public List<FlowerPack> getFlowers(){
        return flowerService.getAllFlowers();
    }
}
