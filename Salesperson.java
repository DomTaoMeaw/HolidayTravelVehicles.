public class Salesperson{
    private int salespersonID;
    private String name;

    public Salesperson(int salespersonID, String name){
        this.salespersonID = salespersonID;
        this.name = name;
    }
    public int getSalespersonID(){ return salespersonID; }
    public String getName(){ return name; }
}
