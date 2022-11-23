package ua.edu.ucu.apps.demo.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Receiver implements User {
    private Status status;

    @Override
    public void update() {
        if(status.equals(Status.IDLE)){
            setStatus(Status.DELIVERY);
        } else if (status.equals(Status.DELIVERY)) {
            setStatus(Status.PAYMENT);
        } else if (status.equals(Status.PAYMENT)) {
            setStatus(Status.ORDER);
        } else if (status.equals(Status.ORDER)) {
            setStatus(Status.DELIVERED);
        }
    }
}
