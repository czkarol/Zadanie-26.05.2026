public class Main{
	public static void main(String[] args){
		Pracownik prac = new Pracownik("Jan", 4000);
		Programista prog = new Programista("Konrad", 6000, "Java");
		Menadzer men = new Menadzer("Grzegorz", 10000, 2000);

		System.out.println(prac.imie);
		System.out.println(prog.jezykProgramowania);
		System.out.println(men.premia);
	}
}
