package problem1.problem1after;
import java.util.ArrayList;
import java.util.List;

public class InvoiceData {
    public static record InvoiceLine(String item, double price) {}
    private String custumor;
    private List<InvoiceLine> lines=new ArrayList<InvoiceLine>();

    public InvoiceData(String custumor) {
        this.custumor = custumor;
    }

    public String getCustomer(){
        return this.custumor;
    }

    public void setCustumor(String custumor){
        this.custumor=custumor;
    }
    public List<InvoiceLine> getLines(){
        return this.lines;
    }
}
