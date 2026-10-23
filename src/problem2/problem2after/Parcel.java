package problem2.problem2after;

public class Parcel {
    private double weight;
    public Parcel(double weight) {
        this.weight = weight;
    }
    public double shippingCost(ShippingMethod method) {
        return method.cost(weight);
    }
}