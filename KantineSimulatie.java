/**k
 * Deze Klasse maakt een Kantine aan.
 * 
 * Van:  Casper Wolff en Erik Hoekstra
 * Student nummer: (Casper) 308231   en    (Erik) 335939 
 * @version (1)
 */
public class KantineSimulatie {
  private Kantine kantine;
  /**
   * Constructor
   */
  public KantineSimulatie() {
    kantine=new Kantine();
  }

  /**
   * Deze methode simuleert een aantal dagen in het 
   * verloop van de kantine
   * @param dagen
   */
  public void simuleer(int dagen) {
    // for lus voor dagen
    int i=0;
    for(int aantal = 1; aantal <= dagen; aantal++) {
      // per dag nu even vast 10+i personen naar binnen
      // laten gaan, wordt volgende week veranderd
      // for lus voor personen
      for(int j=0;j<10+i;j++){
        kantine.loopPakSluitAan();
      }
      kantine.verwerkRijVoorKassa();
      System.out.println("****************************************************");
      System.out.println("dagtotalen van dag:"+aantal);
      System.out.println("aantal aritkelen:"+kantine.aantalArtikelen());
      System.out.println("geld in kassa:"+kantine.hoeveelGeldInKassa());
      System.out.println("****************************************************");
      kantine.resetKassa();
      // verwerk rij voor de kassa
      // toon dagtotalen (artikelen en geld in kassa)
      // reset de kassa voor de volgende dag
    }
  }
}
