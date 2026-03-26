public class KontoBankowe {
	private double saldo;

	public KontoBankowe(double saldo){
		this.saldo = saldo;
	}

	public void wplac(double kwota){
		saldo += kwota;
	}
	public void wyplac(double kwota){
		saldo -= kwota;
	}

	public void getSaldo(){
		System.out.println("Twoje saldo: " + saldo);
	}
}
