/**
 * Supplier Class
 *
 * @Senna Faris
 * @version 28/02/19
 */
public class Supplier
{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    /**
     * Constructor
     */
    public Supplier()
    {
        int id;
        String name;
        String email;
        int phoneNumber;
        Location location;
    }
    /**
     * List of accessors to access the instance value
     */
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public Location getLocation()
    {
        return location;
    }
    /**
     * List of mutator to modify the instance value
     */
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public void setLocation(Location location)
    {
        this.location = location;
    }
    /**
     * This method is to print the name value of the instance
     */
    public void printData()
    {
        System.out.println(name);
    }
}