package Task3;

public class Customer
{
    private String firstName;
    private String lastName;
    private String username;
    private int id;

    public Customer(String firstName, String lastName, String username)
    {

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;

    }

    @Override
    public String toString()
    {
        return "Navn: "+firstName+" "+lastName+ "\n"+ "Username: "+username+"\n"+ "ID: "+id+"\n";
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getUsername()
    {
        return username;
    }

    public int getId()
    {
        return id;
    }
}
