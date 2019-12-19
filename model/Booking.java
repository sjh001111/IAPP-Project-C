package model; 
public class Booking extends Updater
{
    private int id;
    private HairDresser hairDresser;
    private Customer customer;
    private Service service;
    public Booking(int id, HairDresser hairDresser, Customer customer, Service service)
    {
        this.id = id;
        this.hairDresser = hairDresser;
        this.customer = customer;
        this.service = service;
    }

    public String toString()
    {
        return id + " HairDresser: " + hairDresser.getName() + " Customer " + customer.getName() + " Service " + service.getName();
    }

    public void show()
    {
        System.out.println(toString());
    }

}
