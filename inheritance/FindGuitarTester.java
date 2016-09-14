package inheritance;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Erik on 14-9-2016.
 */
public class FindGuitarTester {
    public static void main(String[] args) {
        // Set up Rick’s guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);

        List matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                System.out.println(" We have a " +
                        guitar.getSpec().getBuilder() + " " + guitar.getSpec().getModel() + " " +
                        guitar.getSpec().getNumStrings() + "-string " +
                        guitar.getSpec().getType() + " guitar:\n " +
                        guitar.getSpec().getBackWood() + " back and sides,\n " +
                        guitar.getSpec().getTopWood() + " top.\n You can have it for only $" +
                        guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }
    private static void initializeInventory(Inventory inventory) {
        inventory.addInstrument("V95693",
                1499.95, new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6));

        inventory.addInstrument("V9512",
                1549.95, new GuitarSpec(Builder.FENDER,
                "Stratocastor", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER, 6));
    }
}
