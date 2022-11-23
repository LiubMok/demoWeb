package ua.edu.ucu.apps.demo.order;

import lombok.Getter;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.item.Item;
import ua.edu.ucu.apps.demo.payment.Payment;
import ua.edu.ucu.apps.demo.user.User;
import ua.edu.ucu.apps.demo.user.UserService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {
    @Getter
    private final List<Item> items = new LinkedList<>();

    @Getter
    private final List<User> users = new ArrayList<>();

    @Getter
    private Payment payment;
    @Getter
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
    }

    public boolean processOrder() {
        return !items.isEmpty() && payment != null && delivery != null;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }


    public void addUser(User user){
        users.add(user);
    }
    public void removeUser(User user){
        users.remove(user);
    }

    public void notifyUsers(){
        users.forEach(User::update);
    }
}
