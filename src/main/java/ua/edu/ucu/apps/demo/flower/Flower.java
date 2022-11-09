package ua.edu.ucu.apps.demo.flower;
import lombok.*;
import ua.edu.ucu.apps.demo.item.Item;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Flower extends Item {
    @Setter
    @Getter
    private double sepalLength;
    @Getter
    private FlowerColor color;
    @Setter
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;
    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }
    public void setColor(FlowerColor flowerColor) {
        this.color = flowerColor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return color == flower.color &&
                flowerType == flower.flowerType;
    }

    @Override
    public int hashCode() {
//        return Objects.hash(sepalLength, color, price, flowerType);
        return Objects.hash(color, flowerType);
    }

    @Override
    public String getDescription() {
        return toString();
    }
}
