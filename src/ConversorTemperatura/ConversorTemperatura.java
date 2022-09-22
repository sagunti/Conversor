package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura{

	public void ConvertirGradosFahrenheitaCelsius(double valor) {
		double GradosCelsius = (valor /1.8)-32;
		GradosCelsius =(double)Math.round(GradosCelsius*100d)/100;
		JOptionPane.showMessageDialog(null, "Son" +GradosCelsius+ "Grados Celsius");

	}
	public void ConvertirGradosFahrenheitaKelvin(double valor) {
		double GradosKelvin = (valor-32 )*(5/9) +273.15;
		GradosKelvin =(double)Math.round(GradosKelvin*100d)/100;
		JOptionPane.showMessageDialog(null, "Son" +GradosKelvin+ "Grados Kelvin");

	}
	
	public void ConvertirGradosCelsiusaFah(double valor) {
		double GradosFahrenheit= (valor*(9/5)) +32;
		GradosFahrenheit =(double)Math.round(GradosFahrenheit*100d)/100;
		JOptionPane.showMessageDialog(null, "Son" +GradosFahrenheit+ "Grados Fahrenheit");
	}
	
	public void ConvertirGradosCelsiusaKelvin(double valor) {
		double GradosKelvin= valor +273.15;
		GradosKelvin =(double)Math.round(GradosKelvin*100d)/100;
		JOptionPane.showMessageDialog(null, "Son" +GradosKelvin+ "Grados Kelvin");
	}
	
	public void ConvertirGradosKelvinaFah(double valor) {
		double GradosFahrenheit= (valor-273.15)*(9/5)+32;
		GradosFahrenheit =(double)Math.round(GradosFahrenheit*100d)/100;
		JOptionPane.showMessageDialog(null, "Son" +GradosFahrenheit+ "Grados Fahrenheit");
	}
	public void ConvertirGradosKelvinaCelsius(double valor) {
		double GradosCelsius= (valor-273.15);
		GradosCelsius =(double)Math.round(GradosCelsius*100d)/100;
		JOptionPane.showMessageDialog(null, "Son" +GradosCelsius+ "Grados Celsius");
	}
	
}