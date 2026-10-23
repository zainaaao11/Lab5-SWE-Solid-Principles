package problem1.problem1after;
import java.util.List;
public class InvoicePrinter {
    public String print(InvoiceData invoiceData){
        List<InvoiceData.InvoiceLine> lines=invoiceData.getLines();
        StringBuilder sb=new StringBuilder();
        sb.append(String.format("Invoice for %s\n", invoiceData.getCustomer()));
        for (InvoiceData.InvoiceLine line: lines){
            sb.append(String.format("%s  %.2f\n", line.item(), line.price()));
        }
        return sb.toString();
    }
}
