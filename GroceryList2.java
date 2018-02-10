import java.util.ArrayList;

public class GroceryList2
{
    private ArrayList <GroceryItemOrder> liste2 = new ArrayList<>();

    public GroceryList2() {
        liste2 = new ArrayList<>();
    }

    // Tilføj metoden
    public void add (GroceryItemOrder vare)
    {
        if(liste2.size() < 10)
        {
            liste2.add(vare);
        }else
            System.out.println("Du har tilføjet mere end 10 til GroceryList2. Det er kun de 10 første som er blevet tilføjet\n");
    }

    // Laver min liste om til Strings så de kan printes ud sammen
    @Override
    public String toString()
    {
        String value = "";
        for (GroceryItemOrder vare : liste2)
        {
            value += vare + "\n";
        }
        return value;
    }

    // Den totale pris metode
    public double getTotalPris()
    {
        double totalPris = 0.0;
        // fra 0 til listens længde og lægger 1 til hver gang
        for (int i = 0; i < liste2.size(); i++)
        {
            // Hvis listens "i" ikke er null
            if(liste2.get(i) != null)
            {
                // Den totale pris + listens nuværende tals pris
                totalPris = totalPris + liste2.get(i).getPris();
            }
        }
        return totalPris;
    }
}

