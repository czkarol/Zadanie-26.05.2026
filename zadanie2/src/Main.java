public class Main{
	public static void main(String[] args){
		KontoBankowe kb = new KontoBankowe(20000);
		kb.wyplac(5000);
		kb.getSaldo();
	}
}
