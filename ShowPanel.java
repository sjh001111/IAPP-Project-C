import model.*; 
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class ShowPanel extends JPanel implements MyObserver
{  
    private Salon salon;
    private JTextArea view = new JTextArea(7, 65);
    private JScrollPane scroll = new JScrollPane(view);
    
    public ShowPanel(Salon salon)
    {   
        this.salon = salon;
        setup();
        build();
    }

    public void setup()
    {   
        salon.attach(this);
        salon.hairDressers().attach(this);
        salon.customers().attach(this);
        salon.services().attach(this);
        Iterator<Record> it1;
        it1 = salon.hairDressers().records().iterator();
        while(it1.hasNext())
            it1.next().attach(this);
        it1 = salon.customers().records().iterator();
        while(it1.hasNext())
            it1.next().attach(this);
        it1 = salon.services().records().iterator();
        while(it1.hasNext())
            it1.next().attach(this);
        Iterator<Booking> it2;
        it2 = salon.bookings().iterator();
        while(it2.hasNext())
            it2.next().attach(this);
    } 

    public void build()
    {      
        //add(view);
        add(scroll);
    }

    public void update()
    {
        view.setText(salon.report());
    }

}