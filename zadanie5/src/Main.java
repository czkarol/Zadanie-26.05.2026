import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		ArrayList<Ksiazka> ksiazki = new ArrayList<Ksiazka>();
		ksiazki.add(new Ksiazka("Przedwiosnie", "Stefan Zeromski"));
		ksiazki.add(new Ksiazka("Lalka", "Boleslaw Prus"));
		ksiazki.add(new Ksiazka("Mobydick", "Herman Melville"));
		Biblioteka biblioteka = new Biblioteka(ksiazki);

		biblioteka.wyswietlWszystkie();
	}
}
