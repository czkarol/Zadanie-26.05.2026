public class Ksiazka{
	String tytul;
	String autor;

	public Ksiazka(String tytul, String autor){
		this.tytul = tytul;
		this.autor = autor;
	}

	public void wyswietlInfo(){
		System.out.println("Tytul: " + tytul + ", autor: " + autor);
	}
}
