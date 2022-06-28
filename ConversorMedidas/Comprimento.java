package ConversorMedidas;

public class Comprimento {

	private double metros;
	private double pes;
	private double polegadas;

	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	public double getPes() {
		return pes;
	}

	public void setPes(double pes) {
		this.pes = pes;
	}

	public double getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(double polegadas) {
		this.polegadas = polegadas;
	}

	public void metrosToPes(double metros) {

		System.out.println(metros * 3.281);

	}

	public void metrosToPolegadas(double metros) {

		System.out.println(metros * 39.37);

	}

	public void pesToMetros(double pes) {

		System.out.println(pes / 3.281);

	}

	public void pesTopolegadas(double pes) {

		System.out.println(pes * 12);

	}

	public void polegadsToMetros(double polegadas) {

		System.out.println(polegadas / 39.37);

	}

	public void polegadasToPes(double polegadas) {

		System.out.println(polegadas / 12);

	}

}
