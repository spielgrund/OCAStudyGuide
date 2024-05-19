package Aufgaben_06;

import java.util.Objects;

public class Konto implements Comparable<Konto> {
	private int kontonummer;
	private double saldo;

	public Konto() {
	}

	public Konto(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	public Konto(int kontonummer, double saldo) {
		this.kontonummer = kontonummer;
		this.saldo = saldo;
	}

	public Konto(Konto k) {
		kontonummer = k.kontonummer;
		saldo = k.saldo;
	}

	public int getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(int nr) {
		kontonummer = nr;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double betrag) {
		saldo = betrag;
	}

	public void zahleEin(double betrag) {
		saldo += betrag;
	}

	public void zahleAus(double betrag) {
		saldo -= betrag;
	}

	public String toString() {
		return kontonummer + " " + saldo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Konto konto = (Konto) o;
		return kontonummer == konto.kontonummer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(kontonummer, saldo);
	}

	public int compareTo(Konto obj) {
		return kontonummer - ((Konto) obj).kontonummer;
	}
}
