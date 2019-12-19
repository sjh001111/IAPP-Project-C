package model;
public class Customers extends Records 
{

    public Customers()
    {

    }

    public void add(String name)
    {
        Customer customer = new Customer (++id, name);
        add(customer);
        updateViews();
    }

    public Customer find(int id)
    {    
        return (Customer) super.find(id); 
    }
}
