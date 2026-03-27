import java.util.ArrayList;

public class Biblioteka{
	ArrayList<Ksiazka> ksiazki;

	public Biblioteka(ArrayList<Ksiazka> ksiazki){
		this.ksiazki = ksiazki;
	}

	public void dodajKsiazke(Ksiazka ksiazka){
		ksiazki.add(ksiazka);
	}

	public void wyswietlWszystkie(){
		for (Ksiazka ksiazka : ksiazki){
			ksiazka.wyswietlInfo();
		}
	}
}
