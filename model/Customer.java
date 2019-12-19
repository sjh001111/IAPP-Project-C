package model;
public class Customer extends Record
{

    public Customer(int id, String name)
    {
        super(id, name);
    }

    public String toString()
    {
        return "Customer: " + super.toString();
    }
}
