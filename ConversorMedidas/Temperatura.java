package ConversorMedidas;

public class Temperatura  {

	private double celsius;
	private double fahrenheit;
	private double kelvin;



	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public double getKelvin() {
		return kelvin;
	}

	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}

	public void celsiusToFah(double celsius) {

		System.out.println((celsius * 1.8) + 32);

	}

	public void celsiusToKelvin(double celsius) {

		System.out.println(celsius + 273.15);

	}

	public void fahToCelsius(double fahrenheit) {

		System.out.println((fahrenheit - 32) / 1.8);

	}

	public void fahToKelvin(double fahrenheit) {

		System.out.println(((fahrenheit - 32) / 1.8) + 273.15);

	}

	public void kelvinToCelsius(double kelvin) {

		System.out.println(kelvin - 273.15);

	}

	public void kelvinToFahreinheit(double kelvin) {

		System.out.println(((kelvin - 273.15) * 1.8) + 32);

	}

}
