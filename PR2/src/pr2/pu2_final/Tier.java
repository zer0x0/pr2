package pr2.pu2_final;

import java.text.DecimalFormat;

public class Tier implements Runnable {
	protected int xAchse; 
	protected int yAchse; 
	protected int lebensenergie = 0; 
	protected int random = (int)(Math.random()*(99-0)+1)+0; 
	protected Thread id; 
	protected static int anzahl = 0; 

	/**
	 * Tierkonstruktor mit Lebensenergie
	 * lebensenergie random int-Wert
	 */
	protected Tier() {
		this.lebensenergie = random; 
	}

	public static void main(String[] args) {

		/**
		 * Aufruf der create()- Methode um Tier-Objekte zu erzeugen // auskommentierter bereich wenn dynamisch aufgerufen werden soll
		 */
		//		Thread ti = new Thread();
		//		ti.start();
		//		create();
		//		Thread t2 = new Thread(); 
		//		t2.start(); 
		//		create(); 
		Tier.create();
		Hase.create(); 
		Hase.create(); 
		Hase.create(); 
		
	}

	/**
	 * �berschriebene run()-Methode von Interface Runnable
	 * sinkt die Lebensenergie eines Tieres um 1 bei jedem Durchlauf
	 * output: Anzahl der Lebensenrgie des Tieres nach jedem Durchlauf bis 0 und das Tier stirbt
	 * move()-Methode wird aufgerufen 
	 * nach jedem Durchlauf schl�ft der Thread f�r 100ms
	 */
	@Override
	public void run() {
		while(this.lebensenergie > 0) {
			System.out.println(id.getName() + " hat " + lebensenergie + " Lebensenergie! ");
			this.lebensenergie --; 
			move(); 
			if(lebensenergie == 0) {
				System.out.println(id.getName() + " ist leider verstorben");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
	/**
	 * create()-Methode erzeugt neue Tierinstanz und startet dabei nebenlaufiges Leben der Tiere
	 * number = zufaellige Lebenskraft zwischen 0 und 99
	 * Tier-Objekte werden gezaehlt
	 * Tier-Thread wird ueber df.format und setName()-Methode fortlaufent nummeriert und benannt
	 * @return Tier-Objekt
	 */
	public static synchronized Tier create() {
// factory wegen synchronized ** muss sync sein wegen thread 
		Tier ti = new Tier(); 
		ti.id = new Thread(ti);
		// weil anzahl++ static variable is
		anzahl++;
		DecimalFormat df = new DecimalFormat("000");
		String c = df.format(anzahl);
		String name = "Tier-" + c; 
		ti.id.setName(name);
		ti.id.start(); 
		return ti; 			
	}
	/**
	 * move()-Methode erzeugt Bewegung der Tiere
	 * x und y Positionen werden per Zufallszahl festgelegt
	 * output: x und y Positionen
	 */
	public synchronized void move() {
		int zufallsZahl = (int)(Math.random()*(4-0)+1)+0; 
		switch(zufallsZahl) {
		case 1:
			this.xAchse = this.xAchse - 1;
			System.out.println("Gehe links " + " X: " + this.xAchse + "\t" + "Y: " + this.yAchse);
			break;
		case 2:
			this.xAchse = this.xAchse + 1;
			System.out.println("Gehe rechts " + " X: " + this.xAchse + "\t" + "Y: " + this.yAchse);
			break;
		case 3:
			this.yAchse = this.yAchse - 1;
			System.out.println("Gehe runter " + " X: " + this.xAchse + "\t" + "Y: " + this.yAchse);
			break;
		case 4:
			this.yAchse = this.yAchse + 1;
			System.out.println("Gehe hoch " + " X: " + this.xAchse + "\t" + "Y: " + this.yAchse);
			break;
		default: 
			this.xAchse = this.xAchse + 0; 
			this.yAchse = this.yAchse + 0; 
			System.out.println("Bleibe stehen");
			break; 
		}

	}
}
