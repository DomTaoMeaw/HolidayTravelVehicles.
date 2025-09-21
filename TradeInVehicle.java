public class TradeInVehicle{
    private String serialNumber;
    private String model;
    private int year;
    private double tradeInAllowance;

    public TradeInVehicle(String serialNumber, String model, int year, double tradeInAllowance){
        this.serialNumber = serialNumber;
        this.model = model;
        this.year = year;
        this.tradeInAllowance = tradeInAllowance;
    }
    public String getSerialNumber(){ return serialNumber; }
    public String getModel(){ return model; }
    public int getYear(){ return year; }
    public double getTradeInAllowance(){ return tradeInAllowance; }
}
