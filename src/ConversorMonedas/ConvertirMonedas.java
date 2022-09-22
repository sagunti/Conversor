package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor /144.91;
		monedaDolar =(double)Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" +monedaDolar+ "Dólares");

	}
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor /142.63;
		monedaEuro =(double)Math.round(monedaEuro*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" +monedaEuro+ "Euros");

	}
	public void ConvertirPesosALibras(double valor) {
		double monedaLibras = valor /163.11;
		monedaLibras =(double)Math.round(monedaLibras*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" +monedaLibras+ "Libras");

	}
	public void ConvertirLibrasaPesos(double valor) {
		double monedaPesos = valor / 0.0061;
		monedaPesos =(double)Math.round(monedaPesos*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" +monedaPesos+ "Pesos");

	}
	public void ConvertirEurosaPesos(double valor) {
		double monedaPesos = valor / 0.0070;
		monedaPesos =(double)Math.round(monedaPesos*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" +monedaPesos+ "Pesos");

	}
	
	public void ConvertirDolaraPesos(double valor) {
		double monedaPesos = valor / 0.0069;
		monedaPesos =(double)Math.round(monedaPesos*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" +monedaPesos+ "Pesos");

	}
}
