package model; 
public class HairDresser extends Record
{

    public HairDresser(int id, String name)
    {
        super(id, name);
    }

    public String toString()
    {
        return "HairDresser: "+ super.toString();
    }
}
