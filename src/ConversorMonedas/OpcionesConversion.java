package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, 
				"Elije la opción de conversión","Menú", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
				{"De pesos a Dólar","de pesos a Euros","de pesos a Libras","de Libras a pesos","de Euros a pesos", "de Dólares a pesos"}, "Seleccion")).toString();
		switch(opcion) {
		case "De pesos a Dólar":
			monedas.ConvertirPesosADolares(valor);
			break;
			
		case "de pesos a Euros":
			monedas.ConvertirPesosAEuros(valor);
			break;
		case "de pesos a Libras":
			monedas.ConvertirPesosALibras(valor);
			break;
		case "de Libras a pesos":
			monedas.ConvertirLibrasaPesos(valor);
			break;
		case "de Euros a pesos":
			monedas.ConvertirEurosaPesos(valor);
			break;
		case "de Dólares a pesos":
			monedas.ConvertirDolaraPesos(valor);
			break;
		}
	}
	
}
