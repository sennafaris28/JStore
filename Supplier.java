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
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
    public int getId()
    /***
     * Accessor for ID
     */
    {
        return id;
    }
    public String getName()
    /***
     * Accessor for name
     */
    {
        return name;
    }
    public String getEmail()
    /***
     * Accessor for email
     */
    {
        return email;
    }
    public String getPhoneNumber()
    /***
     * Accessor for Phone Number
     */
    {
        return phoneNumber;
    }
    public Location getLocation()
    /***
     * Accessor for Location
     */
    {
        return location;
    }
    public void setId(int id)
    /***
     * Mutator of ID
     */
    {
        this.id = id;
    }
    public void setName(String name)
    /***
     * Mutator of name
     */
    {
        this.name = name;
    }
    public void setEmail(String email)
    /***
     * Mutator of email
     */
    {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber)
    /***
     * Mutator of Phone Number
     */
    {
        this.phoneNumber = phoneNumber;
    }
    public void setLocation(Location location)
    /***
     * Mutator of Location
     */
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