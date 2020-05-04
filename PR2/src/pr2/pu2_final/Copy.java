package pr2.pu2_final;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Copy {

	public static void main(String[] args) throws IOException {

		String quelle;
		String ziel;

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte geben Sie den Namen der Datei an, deren Inhalt Sie kopieren moechten: ");
		quelle = sc.nextLine();
		System.out.println("Bitte geben Sie nun den Namen der Datei an, in welche Sie kopieren moechten: ");
		ziel = sc.nextLine();

		copy(quelle, ziel);
		System.out.println("abgeschlossen!");
		sc.close();

	}

	/**
	 * copy()-Methode kopiert einen Text aus einer Datei in eine andere Datei
	 * 
	 * @param quelle String-Wert
	 * @param ziel   String-Wert
	 */
	public static void copy(final String quelle, final String ziel) {
		File file = new File(ziel);
		if (file.exists()) {
			System.err.println("Diese Datei existiert bereits!");
			System.exit(0);
		}
		/**
		 * InputStream lesen liest aus der Datei OutputStream schreibt in die Datei
		 */
		try (InputStream lesen = new FileInputStream(quelle)) {
			try (OutputStream schreiben = new FileOutputStream(ziel)) {
				byte[] buffer = new byte[1024];
				/**
				 * warum -1??
				 */
				int data = -1;

				while ((data = lesen.read(buffer)) > -1) {
					/**
					 * data = 1024 ??
					 */
					schreiben.write(buffer, 0, data);
				}
			} catch (Exception e) {
				System.err.println("Fehler bei der Zieldatei!");
				e.printStackTrace();
			}

		} catch (Exception e) {
			System.err.println("Fehler bei der Quelldatei!");
			e.printStackTrace();
		}
	}
}
