package ua.edu.ucu.apps.demo.inventory;
import ua.edu.ucu.apps.demo.flower.FlowerPack;
import java.util.List;

public interface IInventory {
    List<FlowerPack> getAllFlowerPacks();
    void addFlowerPack(FlowerPack flowerPack);
    boolean isExist(FlowerPack flowerPack);
    FlowerPack getFlowerPack(FlowerPack flowerPack);
}

