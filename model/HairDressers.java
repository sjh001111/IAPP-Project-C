package model;
public class HairDressers extends Records 
{

    public HairDressers()
    {

    }

    public void add(String name)
    {
        HairDresser hairDresser = new HairDresser (++id, name);
        add(hairDresser);
        updateViews();
    }

    public HairDresser find(int id)
    {    
        return (HairDresser) super.find(id); 
    }

}
