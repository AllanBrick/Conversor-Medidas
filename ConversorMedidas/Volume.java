package ConversorMedidas;

public class Volume {

	private double litros;
	private double galao;
	private double oncasLiquida;

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public double getGalao() {
		return galao;
	}

	public void setGalao(double galao) {
		this.galao = galao;
	}

	public double getOncasLiquida() {
		return oncasLiquida;
	}

	public void setOncasLiquida(double oncasLiquida) {
		this.oncasLiquida = oncasLiquida;
	}

	public void litrosToGalao(double litros) {

		System.out.println(litros / 3.785);

	}

	public void litrosToOnca(double litros) {

		System.out.println(litros * 33.814);

	}

	public void galaoToLitros(double galao) {

		System.out.println(galao * 3.785);

	}

	public void galaoToOnca(double galao) {

		System.out.println(galao * 128);

	}

	public void oncaToLitros(double oncasLiquidas) {

		System.out.println(oncasLiquidas / 33.814);

	}

	public void oncaToGalao(double oncasLiquidas) {

		System.out.println(oncasLiquidas / 128);

	}
}
