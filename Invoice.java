import java.util.List;
import java.util.Date;

public class Invoice {
    private int invoiceID;
    private Date date;
    private double finalPrice;
    private double tax;
    private Customer customer;
    private Salesperson salesperson;
    private Vehicle vehicle;
    private TradeInVehicle tradeInVehicle;
    private List<Option> options;

    public Invoice(int invoiceID, Date date, 
                   double finalPrice, double tax,Customer customer, Salesperson salesperson, 
                   Vehicle vehicle,TradeInVehicle tradeInVehicle, List<Option> options) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.finalPrice = finalPrice;
        this.tax = tax;
        this.customer = customer;
        this.salesperson = salesperson;
        this.vehicle = vehicle;
        this.tradeInVehicle = tradeInVehicle;
        this.options = options;
    }
}
