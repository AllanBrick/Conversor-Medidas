package ConversorMedidas;

public class Peso {

	private double kg;
	private double libras;
	private double oncas;

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	public double getLibras() {
		return libras;
	}

	public void setLibras(double libras) {
		this.libras = libras;
	}

	public double getOncas() {
		return oncas;
	}

	public void setOncas(double oncas) {
		this.oncas = oncas;
	}

	public void kgToLibras(double kg) {

		System.out.println(kg * 2.205);

	}

	public void kgToOnca(double kg) {

		System.out.println(kg * 35.274);

	}

	public void librasToKg(double libras) {

		System.out.println(libras / 2.205);

	}

	public void librasToOnca(double libras) {

		System.out.println(libras * 16);

	}

	public void oncaToKg(double onca) {

		System.out.println(onca / 35.274);

	}

	public void oncaTolibras(double onca) {

		System.out.println(onca / 16);

	}

}
