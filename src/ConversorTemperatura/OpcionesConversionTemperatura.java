package ConversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesConversionTemperatura {
	ConversorTemperatura temperatura = new ConversorTemperatura();
	
	public void ConvertirTemperatura(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, 
				"Elije la opción de conversión","Menú", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
				{"De Fahrenheit a Celsius","de Fahreheit a Kelvin","de Celsius a Fahrenheit","de Celsius a Kelvin","de Kelvin a Fahreheit", 
						"de Kelvin a Celsius"}, "Seleccion")).toString();
		switch(opcion) {
		case "De Fahrenheit a Celsius":
			temperatura.ConvertirGradosFahrenheitaCelsius(valor);
			break;
			
		case "de Fahreheit a Kelvin":
			temperatura.ConvertirGradosFahrenheitaKelvin(valor);
			break;
		case "de Celsius a Fahrenheit":
			temperatura.ConvertirGradosCelsiusaFah(valor);
			break;
		case "de Celsius a Kelvin":
			temperatura.ConvertirGradosCelsiusaKelvin(valor);
			break;
		case "de Kelvin a Fahreheit":
			temperatura.ConvertirGradosKelvinaFah(valor);
			break;
		case "de Kelvin a Celsius":
			temperatura.ConvertirGradosKelvinaCelsius(valor);
			break;
		}
	}
	
}