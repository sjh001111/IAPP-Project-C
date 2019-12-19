package model; 

import java.util.*;
public class Salon extends Updater
{
    HairDressers hairDressers = new HairDressers();
    Customers customers = new Customers();
    Services services = new Services();
    LinkedList<Booking> bookings = new LinkedList<Booking>();
    int bookingId = 0;
    public Salon()
    {
    }

    public void booking(int hairDresser, int customer, int service)
    {
        bookings.add(new Booking(++bookingId, hairDressers.find(hairDresser), customers.find(customer), services.find(service)));
        updateViews();
    }

    public String report()
    {
        String str = "";
        str += "HairDressers \n" + hairDressers.toString();
        str += "Customers \n" + customers.toString();
        str += "Services \n" + services.toString();
        str += "Bookings \n";
        for(Booking booking : bookings)
        {
            str += booking.toString();
        }
        return str;
    }

    public HairDressers hairDressers()
    {
        return hairDressers;
    }

    public Customers customers()
    {
        return customers;
    }

    public Services services()
    {
        return services;
    }

    public LinkedList<Booking> bookings()
    {
        return bookings;
    }
}
