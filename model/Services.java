package model;  
public class Services extends Records
{

    public Services()
    {

    }

    public void add(String name, double price)
    {
        Service service = new Service (++id, name, price);
        add(service);
        updateViews();
    }

    public Service find(int id)
    {    
        return (Service) super.find(id); 
    }
}
