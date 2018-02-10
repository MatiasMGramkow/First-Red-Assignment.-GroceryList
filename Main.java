import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {

        // Laver en ny liste
        GroceryList liste = new GroceryList();
        GroceryList2 liste2 = new GroceryList2();

        // Tilføjer nye produkter
        GroceryItemOrder Varen = new GroceryItemOrder(1,"Banan",10.0);
        liste.add(Varen);
        liste2.add(Varen);

        Varen = new GroceryItemOrder(2,"Agurk",20.0);
        liste.add(Varen);
        liste2.add(Varen);

        Varen = new GroceryItemOrder(1,"Kaffe",11.0);
        liste.add(Varen);
        liste2.add(Varen);

        Varen = new GroceryItemOrder(7,"Salat",20.3);
        liste.add(Varen);
        liste2.add(Varen);

        Varen = new GroceryItemOrder(2,"Chips",19.0);
        liste.add(Varen);
        liste2.add(Varen);

        Varen = new GroceryItemOrder(1,"Kage",10.0);
        liste.add(Varen);
        liste2.add(Varen);

        Varen = new GroceryItemOrder(1,"Ost",14.5);
        liste.add(Varen);
        liste2.add(Varen);

        Varen = new GroceryItemOrder(9,"Cola",20.0);
        liste.add(Varen);
        liste2.add(Varen);

        Varen = new GroceryItemOrder(1,"Laks",19.0);
        liste.add(Varen);
        liste2.add(Varen);

        Varen = new GroceryItemOrder(5,"Tun",18.9);
        liste.add(Varen);
        liste2.add(Varen);

        /* // Dette er nummer 11 item, som test hvis listen bliver større end 11
        Varen = new GroceryItemOrder(2,"Nummer 11", 100.0);
        liste.add(Varen);
        liste2.add(Varen);
        */

        // Læser fra filen "Grocerylist.txt" og printer den ud"
        System.out.println("Dette er min liste fra Grocery.txt filen");
        try {
            File file = new File("Grocerylist.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String linje = scanner.nextLine();
                System.out.println(linje); // her printer den
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Printer din liste fra GroceryList
        System.out.println("\nDette er min Indkøbsliste" + "\n" +
                            liste);
        // Viser total beløbet fra Grocerylist.
        System.out.println("Dit totalbeløb er: \t" + liste.getTotalPris() + " Kroner\n");

        // Printer min liste fra GroceryList2
        System.out.println("Dette er min liste fra GroceryList2\n" + liste2);
        // Viser total beløbet fra Grocerylist2.
        System.out.println("Dit totalbeløb er: \t" + liste2.getTotalPris() + " Kroner");


















        /* System.out.println("Velkommen til din virtuelle indkøbsliste \n");
        System.out.println(
                "Herunder kan du gøre følgende\n" +
                        "1. Tilføj nye produkter til din liste\n" +
                        "2. Fjerne nye produkter fra diin liste\n" +
                        "3. Se din indkøbsliste\n"+
                        "4. Tilføj nye produkter til supermarkedet)";
        */

    }
}
