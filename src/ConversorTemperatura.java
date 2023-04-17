import javax.swing.JOptionPane;

public class ConversorTemperatura extends Conversor {

	private String[] opcionesTemperatura = { "Celcius(C) a Kelvin(K)", "Celcius(C) a Fahrenheit(F)",
			"Celcius(C) a Reaumur(R)", "Kelvin(K) a Celcius(C)", "Fahrenheit(F) a Celcius(C)",
			"Reaumur(R) a Celcius(C)" };

	private double resultado;

	@Override
	protected void obtenerValor() {
		while (true) {
			try {
				valor = Double.parseDouble(
						JOptionPane.showInputDialog(null, "Ingrese el valor de la temperatura que deseas convertir"));
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Por favor ingrese un valor numerico valido");
			}
		}

	}

	@Override
	protected void mostrarResultado() {
		String temperaturaSeleccionada = (String) JOptionPane.showInputDialog(null,
				"Elige la conversión que deseas realizar", "Temperatura", JOptionPane.PLAIN_MESSAGE, null,
				opcionesTemperatura, opcionesTemperatura[0]);

		try {
			switch (temperaturaSeleccionada) {
			case "Celcius(C) a Kelvin(K)":
				resultado = valor + 273.15;
				break;
			case "Celcius(C) a Fahrenheit(F)":
				resultado = (valor * 9 / 5) + 32;
				break;
			case "Celcius(C) a Reaumur(R)":
				resultado = valor * 4 / 5;
				break;
			case "Kelvin(K) a Celcius(C)":
				resultado = valor - 273.15;
				;
				break;
			case "Fahrenheit(F) a Celcius(C)":
				resultado = (valor - 32) * 5 / 9;
				break;
			case "Reaumur(R) a Celcius(C)":
				resultado = valor * 5 / 4;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida");
				break;
			}
			JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Por favor ingrese un valor numerico valido");
		}

	}

}
