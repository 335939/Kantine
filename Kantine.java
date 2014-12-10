import java.util.Iterator;
/**
 * Deze Klasse maakt een Kantine aan.
 * 
 * Van:  Casper Wolff en Erik Hoekstra
 * Student nummer: (Casper) 308231   en    (Erik) 335939 
 * @version (1)
 */
public class Kantine {
    private Kassa kassa;
    private KassaRij kassarij;

    /**
     * Constructor
     */
    public Kantine() {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }

    /**
     * In deze methode wordt een Persoon en Dienblad
     * gemaakt en aan elkaar
     * gekoppeld. Maak twee Artikelen aan en plaats
     * deze op het dienblad.
     * Tenslotte sluit de Persoon zich aan bij de rij
     * voor de kassa.
     */
    public void loopPakSluitAan() {
        Persoon persoonKantine = new Persoon(1234134, "hoi", "hoi", 26, 1, 1994, 'M');
        Dienblad dienbladpersoon = new Dienblad();
        Artikel honing = new Artikel("honing", 3);
        Artikel pasta = new Artikel("pasta", 5);
        persoonKantine.pakDienblad(dienbladpersoon);        
        persoonKantine.pakArtikel(honing);
        persoonKantine.pakArtikel(pasta);
        kassarij.sluitAchteraan(persoonKantine);
    }

    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() {

        while(kassarij.isErEenRij() == false)
        {
            Persoon persoonkassa = kassarij.eerstePersoonInRij();
            kassa.rekenAf(persoonkassa);                    

        }
    }

    /**
     * Deze methode telt het geld uit de kassa
     * @return hoeveelheid geld in kassa
     */
    public double hoeveelGeldInKassa() {
        return kassa.hoeveelheidGeldInKassa();
    }

    /**
     * Deze methode geeft het aantal gepasseerde artikelen.
     * @return het aantal gepasseerde artikelen
     */
    public int aantalArtikelen(){
        return kassa.aantalArtikelen();
    }

    /**
     * Deze methode reset de bijgehouden telling van
     * het aantal artikelen
     * en "leegt" de inhoud van de kassa.
     */
    public void resetKassa() {
        kassa.resetKassa();
    }
}