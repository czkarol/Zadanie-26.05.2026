public class Pracownik{
	String imie;
	int pensja;

	public Pracownik(String imie, int pensja){
		this.imie = imie;
		this.pensja = pensja;
	}
}

class Programista extends Pracownik {
	String jezykProgramowania;

	public Programista(String imie, int pensja, String jezykProgramowania){
		super(imie, pensja);
		this.jezykProgramowania = jezykProgramowania;
	}
}
