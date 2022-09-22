package Principal;
import javax.swing.*;

import ConversorMonedas.OpcionesConversion;
import ConversorTemperatura.OpcionesConversionTemperatura;
public class principal {

	public static void main(String[]args) {
		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesConversionTemperatura conversiontemp = new OpcionesConversionTemperatura();
				
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión","Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas","Conversor de Temperatura"}, "Elegir").toString();
			switch(opciones) {
			case "Conversor de Monedas" :
			String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
			double valorRecibido = Double.parseDouble(input);
			conversion.ConvertirMonedas(valorRecibido);
			int respuesta =JOptionPane.showConfirmDialog(null,"¿Desea Continuar?");
			if(JOptionPane.OK_OPTION == respuesta) {
				System.out.println("Si");
			}
			else {
				JOptionPane.showInternalMessageDialog(null, "Programa finalizado");
				
			}
			break;
			
			
			case "Conversor de Temperatura" :
				String inputTem = JOptionPane.showInputDialog(null, "Ingrese un valor temperatura");
				double valorRecibidoTem = Double.parseDouble(inputTem);
				conversiontemp.ConvertirTemperatura(valorRecibidoTem);
				
			
			
			int respuesta1 =JOptionPane.showConfirmDialog(null,"¿Desea Continuar?");
			if(JOptionPane.OK_OPTION == respuesta1) {
				System.out.println("Si");
			}
			else {
				
				JOptionPane.showInternalMessageDialog(null, "Programa finalizado");
				
			}
			break;
			}
		}
	}
}
