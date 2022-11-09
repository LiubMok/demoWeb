package ua.edu.ucu.apps.demo.payment;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PayPalPaymentStrategy implements Payment {
    private  String name;

    private String description;

    public PayPalPaymentStrategy(){
        this.name = "PayPAl";
        this.description = "PayPal payment";
    }
    @Override
    public boolean pay() {
        System.out.println("paid with PayPal");
        return true;
    }
}