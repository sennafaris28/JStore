
/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
    private String province;
    private String description;
    private String city;
    public Location()
    {
        String province;
        String description;
        String city;
    }
    public String getProvince()
    {
       return province;
    }
    public String getCity()
    {
        return city;
    }
    public String getDescription()
    {
        return description;
    }
    public void setProvince(String province) 
    {
        this.province = province;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public void printData()
    {
        System.out.println(province);
    }
}
