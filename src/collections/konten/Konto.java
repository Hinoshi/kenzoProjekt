package collections.konten;

public class Konto {
	private final int kontonummer;
	private double saldo;
	private Transaktion last;

	public class Transaktion {
		private final String name;
		private final double betrag;

		public Transaktion(String name, double betrag) {
			this.name = name;
			this.betrag = betrag;
		}

		public String toString() {
			return kontonummer + ": " + name + " " + betrag + ", Saldo " + saldo;
		}
	}

	public Konto(int kontonummer, double saldo) {
		this.kontonummer = kontonummer;
		this.saldo = saldo;
	}

	public Transaktion getLast() {
		return last;
	}

	public void zahleEin(double betrag) {
		saldo += betrag;
		last = new Transaktion("Einzahlung", betrag);
	}

	public void zahleAus(double betrag) {
		saldo -= betrag;
		last = new Transaktion("Auszahlung", betrag);
	}
}
