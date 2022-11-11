package ua.edu.ucu.apps.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.item.Item;

import java.util.Objects;

@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table
public class  FlowerPack extends Item {
//    @Id
//    @GeneratedValue
//    private int id;
    @Getter
    private Flower flower;
    @Setter
    @Getter
    private int quantity;

    @Override
    public String getDescription() {
        return toString();
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowerPack that = (FlowerPack) o;
        return flower.equals(that.flower);
    }

    @Override
    public String toString() {
        return "FlowerPack{" +
                "flower=" + flower +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(flower);
    }
}
