package ua.edu.ucu.apps.demo.inventory;
import org.springframework.stereotype.Component;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.flower.FlowerColor;
import ua.edu.ucu.apps.demo.flower.FlowerPack;
import ua.edu.ucu.apps.demo.flower.FlowerType;

import java.util.ArrayList;
import java.util.List;

@Component
public class InventoryStaticStream implements IInventory {
    private static final List<FlowerPack> db = new ArrayList<>();

    public InventoryStaticStream() {
//        createInventory();
    }

    @Override
    public List<FlowerPack> getAllFlowerPacks() {
//        List<FlowerPack> packs = new ArrayList<>();
//        for (Flower flower : db) {
//            packs.forEach(flowerPack -> {
//                if (flowerPack.getFlower().equals(flower)) {
//                    flowerPack.setQuantity(flowerPack.getQuantity() + 1);
//                }
//                else {
//                    packs.add(new FlowerPack(flower, 1));
//                }
//            });
//        }
        return db;
    }

    /**
     * method to add new flowerPack into our database
     */
    @Override
    public void addFlowerPack(FlowerPack flowerPack) {
        if (db.contains(flowerPack)) {
            FlowerPack flowerPack2 = db.stream().filter(flowerPack1 -> flowerPack1.equals(flowerPack)).findFirst().get();
            flowerPack2.setQuantity(flowerPack.getQuantity() + flowerPack2.getQuantity());
            db.remove(flowerPack);
            db.add(flowerPack2);
        } else {
            db.add(flowerPack);
        }
    }

    /**
     * method to find flowerPack from database
     * for searching flowerPack is used
     */
    @Override
    public FlowerPack getFlowerPack(FlowerPack flowerPack) {
        for (FlowerPack flower_Pack : db) {
            if (flower_Pack.equals(flowerPack)) {
                return flower_Pack;
            }
        }
        return null;
    }


    /**
     * method checks whether database contains such flowerPack
     */
    @Override
    public boolean isExist(FlowerPack flowers) {
        for (FlowerPack flowerPack : db) {
            if (flowerPack.equals(flowers)) {
                return true;
            }
        }
        return false;
    }
//    public void createInventory(){
//        addFlowerPack(new FlowerPack( new Flower(1, 40, FlowerColor.RED, 25, FlowerType.ROSE), 15));
//        addFlowerPack(new FlowerPack( new Flower(2, 40, FlowerColor.RED, 25, FlowerType.ROSE), 15));
//        addFlowerPack(new FlowerPack( new Flower(3, 40, FlowerColor.BLUE, 25, FlowerType.ROSE), 15));
//        addFlowerPack(new FlowerPack( new Flower(4, 40, FlowerColor.YELLOW, 25, FlowerType.ROSE), 15));
//        addFlowerPack(new FlowerPack( new Flower(5, 25, FlowerColor.RED, 15, FlowerType.TULIP), 15));
//        addFlowerPack(new FlowerPack( new Flower(6, 25, FlowerColor.BLUE, 15, FlowerType.TULIP), 15));
//        addFlowerPack(new FlowerPack( new Flower(7, 25, FlowerColor.YELLOW, 15, FlowerType.TULIP), 15));
//        addFlowerPack(new FlowerPack(new Flower(8, 25, FlowerColor.YELLOW, 10, FlowerType.CHAMOMILE), 15));
//    }
}

