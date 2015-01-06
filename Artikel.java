
/**
 * Deze Klasse maakt een Artikel aan.
 * 
 * Van:  Casper Wolff en Erik Hoekstra
 * Student nummer: (Casper) 308231   en    (Erik) 335939 
 * @version (1)
 */
public class Artikel
{
    private String naam;
    private double prijs;

    /**
     * Constructor
     */
    public Artikel(String artikelnaam, double artikelprijs)
    {
        naam = artikelnaam;
        prijs = artikelprijs;
    }

    /**
     * Getter voor Artikel naam.
     */
    public  String  getArtikelnaam()
    {
        return naam;
    }

    /**
     * Getter voor Artikel prijs.
     */
    public  double  getArtikelprijs()
    {
        return prijs;
    }

    /**
     * Veranderd de naam van het Artikel
     */
    public void setNaam(String replacementNaam)
    {
        naam = replacementNaam;
    }

    /**
     * Veranderd de prijs van het Artikel
     */
    public void setPrijs(double replacementPrijs)
    {
        prijs = replacementPrijs;
    }

    /**
     * laat de waarden van de instantievariabelen zien.
     */
    public void DrukAf()  
    {  
        System.out.println("#######################");  
        System.out.println("# Artikel naam: " + getArtikelnaam());  
        System.out.println("# Artikel Prijs: " + getArtikelprijs());       
        System.out.println("#######################");  
    } 
}
