import java.util.*;
/**
 * Deze Klasse maakt een Dienblad aan.
 * 
 * Van:  Casper Wolff en Erik Hoekstra
 * Student nummer: (Casper) 308231   en    (Erik) 335939 
 * @version (1)
 */
public class Dienblad {
  private ArrayList<Artikel> artikelen;
  private String dienblad;
  private String artikel;
  /**
   * Constructor
   */
  public Dienblad() {
    artikelen = new ArrayList<Artikel>();
  }

  /**
   * Methode om artikel aan dienblad toe te voegen
   * @param artikel
   */
  public void voegToe(Artikel artikel) {
    artikelen.add(artikel);
  }
    
  /**
   * Methode om aantal artikelen op dienblad te tellen
   * @return Het aantal artikelen 
   */
  public int getAantalArtikelen() {
    return artikelen.size();
  }

  /**
   * Methode om de totaalprijs van de artikelen 
   * op dienblad uit te rekenen
   * @return De totaalprijs
   */
  public double getTotaalPrijs() {
    double totaalprijs = 0;
    for(Artikel artikel : artikelen) {
          totaalprijs = totaalprijs + artikel.getArtikelprijs();
        }
    return totaalprijs;
  }
}
