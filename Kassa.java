import java.util.*;
/**
 * Deze Klasse maakt een Kassa aan.
 * 
 * Van:  Casper Wolff en Erik Hoekstra
 * Student nummer: (Casper) 308231   en    (Erik) 335939 
 * @version (1)
 */
public class Kassa {
    private KassaRij kassarij;
    private int aantalArtikelen = 0;
    private double geldInKassa;
    private Persoon persoon;
    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        this.kassarij = kassarij;
    }

    /**
     * vraag het aantal artikelen en de totaalprijs op.
     * De implementatie wordt later vervangen
     * door een echte betaling door de persoon.
     * @param persoon die moet afrekenen
     */
    public void rekenAf(Persoon persoon) {      

        this.persoon = persoon;

        boolean rijisleeg = kassarij.isErEenRij();

        if(rijisleeg = false)
        {
            System.out.println("Er staat niemand in de rij"); 
            System.out.println(kassarij.isErEenRij()); 
        }else if(rijisleeg = true)
        {
            geldInKassa = geldInKassa + persoon.getTotaalPrijs();
            aantalArtikelen = aantalArtikelen + persoon.getAantalArtikelen();
            kassarij.verwijdereersteuitrij();
        }
    }

    /**
     * Geeft het aantal artikelen dat de kassa
     * heeft gepasseerd,
     * vanaf het moment dat de methode resetWaarden
     * is aangeroepen.
     * @return aantal artikelen
     */
    public int aantalArtikelen() {      
        return aantalArtikelen;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die
     * de kassa zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa
     * is aangeroepen.
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        return geldInKassa;
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() {
        geldInKassa = 0;
        aantalArtikelen = 0;
        System.out.println("De kassa is geleegd en gereset!");
    }
}