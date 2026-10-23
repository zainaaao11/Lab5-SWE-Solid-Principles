package problem1.problem1after;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.FileWriter;
public class InvoiceRepository {
    public void save(InvoiceData invoiceData) throws IOException {
        try (FileWriter fw = new FileWriter(invoiceData.getCustomer() + ".txt")) {
            fw.write(new InvoicePrinter().print(invoiceData));
        }
    }
}
