package problem1.problem1after;

public class InvoiceCalculator {
    public double subtotal(InvoiceData invoiceData){
        double sum=0;
        for (InvoiceData.InvoiceLine line: invoiceData.getLines()){
            sum+=line.price();
        }
        return sum;
    }
    public double total(InvoiceData invoiceData){
        return subtotal(invoiceData)*1.20;
    }
}
