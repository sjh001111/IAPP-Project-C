import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import model.*;
public class AddPanel extends JPanel
{
    private Salon salon;
    public AddPanel(Salon salon)
    {   
        this.salon = salon;
        setup();
        build();   
    }

    private void setup()
    {   
        setLayout(new GridLayout(4, 1));    
    }

    private void build()
    {   
        add(new AddHairDresser());
        add(new AddCustomer());
        add(new AddService());
        add(new AddBooking());
    }
    private class AddHairDresser extends JPanel implements MyObserver
    {
        private JLabel     l0 = new JLabel("Hairdresser");
        private JLabel     l1 = new JLabel("Name");
        private JTextField t1 = new JTextField(10);
        private JButton    b1 = new JButton("Add");

        public AddHairDresser()
        {
            setup();
            build();
        }

        private void setup()
        {  
            b1.addActionListener(new HairDresserListener());
        }

        private void build()
        {
            add(l0);
            add(l1);
            add(t1);
            add(b1);
        }

        public void update()
        {

        }
        private class HairDresserListener implements ActionListener
        {   
            public void actionPerformed(ActionEvent e)
            {   
                salon.hairDressers().add(t1.getText());
            }
        }
    }
    private class AddCustomer extends JPanel implements MyObserver
    {
        private JLabel     l0 = new JLabel("Customer");
        private JLabel     l1 = new JLabel("Name");
        private JTextField t1 = new JTextField(10);
        private JButton    b1 = new JButton("Add");
        
        public AddCustomer()
        {
            setup();
            build();
        }

        private void setup()
        {    
            b1.addActionListener(new CustomerListener());
        }

        private void build()
        {
            add(l0);
            add(l1);
            add(t1);
            add(b1);
        }

        public void update()
        {

        }
        private class CustomerListener implements ActionListener
        {   
            public void actionPerformed(ActionEvent e)
            {   
                salon.customers().add(t1.getText());
            }
        }
    }
    private class AddService extends JPanel implements MyObserver
    {
        private JLabel     l0 = new JLabel("Service");
        private JLabel     l1 = new JLabel("Name");
        private JTextField t1 = new JTextField(10);
        private JLabel     l2 = new JLabel("Cost");
        private JTextField t2 = new JTextField(10);
        private JButton    b1 = new JButton("Add");
        
        public AddService()
        {
            setup();
            build();
        }

        private void setup()
        {   
            b1.addActionListener(new ServiceListener());
        }

        private void build()
        {
            add(l0);
            add(l1);
            add(t1);
            add(l2);
            add(t2);
            add(b1);
        }

        public void update()
        {

        }
        private class ServiceListener implements ActionListener
        {   
            public void actionPerformed(ActionEvent e)
            {   
                salon.services().add(t1.getText(), Double.parseDouble(t2.getText()));
                }
        }
    }
    private class AddBooking extends JPanel implements MyObserver
    {
        private JLabel     l0 = new JLabel("Booking");
        private JLabel     l1 = new JLabel("Hairdresser ID");
        private JTextField t1 = new JTextField(10);
        private JLabel     l2 = new JLabel("Customer ID");
        private JTextField t2 = new JTextField(10);
        private JLabel     l3 = new JLabel("Service ID");
        private JTextField t3 = new JTextField(10);
        private JButton    b1 = new JButton("Add");
        
        public AddBooking()
        {
            setup();
            build();
        }

        private void setup()
        {   
            b1.addActionListener(new BookingListener());
        }

        private void build()
        {
            add(l0);
            add(l1);
            add(t1);
            add(l2);
            add(t2);
            add(l3);
            add(t3);
            add(b1);
        }

        public void update()
        {

        }
        private class BookingListener implements ActionListener
        {   
            public void actionPerformed(ActionEvent e)
            {   
                salon.booking(Integer.parseInt(t1.getText()), Integer.parseInt(t2.getText()), Integer.parseInt(t2.getText()));
            }
        }
    }
}
