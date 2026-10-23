package problem1.problem1after;
import java.util.List;

public class Test {
    public static void main(String[] args){
        InvoiceData invoiceData=new InvoiceData("ALAMI Samir");
        InvoiceCalculator invoiceCalculator=new InvoiceCalculator();
        InvoicePrinter invoicePrinter=new InvoicePrinter();
        List<InvoiceData.InvoiceLine> lines=invoiceData.getLines();
        lines.add(new InvoiceData.InvoiceLine("Laptop", 9000.00));
        lines.add(new InvoiceData.InvoiceLine("Mouse", 150.00));
        lines.add(new InvoiceData.InvoiceLine("USB cable", 50.00));
        double subTotal=invoiceCalculator.subtotal(invoiceData);
        double total=invoiceCalculator.total(invoiceData);
        System.out.println(invoicePrinter.print(invoiceData));
        System.out.printf("Subtotal  %.2f\n", subTotal);
        System.out.printf("TOTAL  %.2f\n", total);
    }
}
