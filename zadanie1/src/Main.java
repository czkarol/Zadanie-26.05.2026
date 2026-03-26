public class Main {
	public static void main(String[] args){
		Samochod samochod1 = new Samochod("Toyota", "Corolla", 2008);
		Samochod samochod2 = new Samochod("Audi", "A4", 2011);

		samochod1.wyswietlInfo();
		samochod2.wyswietlInfo();
	}
}
