package problem2.problem2after;

public class ExpressShipping implements ShippingMethod {

    @Override
    public double cost(double weightKg) {
        return 50 + 8 * weightKg;
    }
    public String name(){
        return "Express";
    }
}