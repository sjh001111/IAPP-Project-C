package model; 
public class Service extends Record 
{
    private double cost;
    public Service(int id, String name, double cost)
    {
        super(id, name);
        this.cost = cost;
    }

    public String toString()
    {
        return "Service: " + super.toString() + " cost $ " + cost;
    }
}
