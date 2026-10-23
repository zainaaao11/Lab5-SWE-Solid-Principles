package problem2.problem2after;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(2);
        List<ShippingMethod> methods = new ArrayList<>();
        methods.add(new StandardShipping());
        methods.add(new ExpressShipping());
        methods.add(new DroneShipping());
        for (ShippingMethod method : methods) {
            System.out.printf("%s: %.2f MAD\n", method.name(), parcel.shippingCost(method));
        }
        //adding a new type of shipping won't affect the existing ones
        PickupShipping pickupShipping=new PickupShipping();
        methods.add(pickupShipping);
        System.out.printf("%s: %.2f MAD\n", pickupShipping.name(), parcel.shippingCost(pickupShipping));
    }
}

//Answers to the last two questions
/*
7)We implemented The Strategy Pattern, because each shipping method implements the same ShippingMethod interface with its own cost calculation and its own name.
8)No. Adding the destination country would require changing the interface and implementations. This shows that a design cannot realistically be closed against every possible future change.
*/