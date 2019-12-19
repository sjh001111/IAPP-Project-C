import model.*; 
import java.awt.*;
import javax.swing.*;
public class HairDressingWindow extends JFrame
{
    public HairDressingWindow(Salon salon)
    {   
        super("Snippers");
        setup();
        build(salon);
        setVisible(true);   
    }

    private void setup()
    {   setSize(800, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
    } 

    private void build(Salon salon)
    {   
        add(new Tabber(salon)); 
    }
    private class Tabber extends JTabbedPane
    {
        public Tabber(Salon salon)
        {  
            add("Add", new AddPanel(salon));
            add("Show", new ShowPanel(salon));
        }
    }
}
