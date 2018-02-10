public class GroceryList
{
    // Laver en ny liste ud fra  GroceryItemOrder Construktoren
    private GroceryItemOrder[] liste;
    private int tællerIndex = 0;

    public GroceryList()
    {
        liste = new GroceryItemOrder[10];
        this.tællerIndex = 0;


    }

    // Tilføj metoden
    public boolean add(GroceryItemOrder vare)
    {
            boolean tilføjet;

            // For at undgå execption
            try
            {
                // Fortæller at listen ud fra det index den har skal være lig med vare
                liste[tællerIndex] = vare;

                // lægger 1 til "tællerIndex" hver gang den kører
                tællerIndex++;

                tilføjet = true;

            } catch (Exception e)
            {
                tilføjet = false;

            }
            return tilføjet;
    }

    // Laver min liste om til Strings så de kan printes ud sammen
    @Override
    public String toString()
    {
        String value = "";
        for (GroceryItemOrder vare : liste)
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
        for (int i = 0; i < liste.length; i++)
        {
            // Hvis listens "i" ikke er null
            if(liste[i] != null)
            {
                // Den totale pris + listens nuværende tals pris
                totalPris = totalPris + liste[i].getPris();
            }
        }
        return totalPris;
    }


}