import java.util.*;
/**
 * Deze Klasse maakt een Kassarij aan.
 * 
 * Van:  Casper Wolff en Erik Hoekstra
 * Student nummer: (Casper) 308231   en    (Erik) 335939 
 * @version (1)
 */
public class KassaRij 
{
    private ArrayList<Persoon> mensen;

    /**
     * Constructor
     */
    public KassaRij() {
        mensen = new ArrayList<Persoon>();
    }

    /**
     * Persoon sluit achter in de rij aan
     * @param persoon
     */
    public void sluitAchteraan(Persoon persoon) {
        mensen.add(persoon);
    }

    /**
     * Indien er een rij bestaat, de eerste Persoon uit
     * de rij verwijderen en retourneren. 
     * Als er niemand in de rij staat geeft deze null terug.
     * @return Eerste persoon in de rij of null
     */
    public Persoon eerstePersoonInRij() {
        if(mensen.isEmpty()){
            return null;
        }else{
            return mensen.get(0);

        }
    }

    /**
     * Methode kijkt of er personen in de rij staan. 
     * @return Of er wel of geen rij bestaat
     */
    public boolean isErEenRij() {
        return mensen.isEmpty();
    }

    /**
     * Methode verwijderd de eerste persoon uit de kassarij
     */
    public void verwijdereersteuitrij() {
        mensen.remove(0);
    }   
}
