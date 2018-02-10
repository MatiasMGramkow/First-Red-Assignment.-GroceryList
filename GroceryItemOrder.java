public class GroceryItemOrder
{
    // Variabler/Atributter
    private String navn;
    private int antal = 1;
    private double prisPerEnhed;

    // Constructor
    public GroceryItemOrder(int antal, String navn, double prisPerEnhed)
    {
        setNavn(navn);
        setAntal(antal);
        setPrisPerEnhed(prisPerEnhed);
    }

    // Setters
    public void setAntal(int antal)
    {
        this.antal = antal;
    }

    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    public void setPrisPerEnhed(double prisPerEnhed)
    {
        this.prisPerEnhed = prisPerEnhed;
    }


    // Getters
    public int getAntal()
    {
        return antal;
    }

    public String getNavn()
    {
        return navn;
    }

    public double getPrisPerEnhed()
    {
        return prisPerEnhed;
    }

    public double getPris()
    {
        return (antal * prisPerEnhed);
    }

    // toString som laver mine variabler om til String så de er nemme at printe ud.
    @Override
    public String toString()

    {
        return getNavn() + " \t\tx " + getAntal() + ". \t " +  getPrisPerEnhed() + " Kroner";
    }

}

