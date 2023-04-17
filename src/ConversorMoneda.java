
import javax.swing.JOptionPane;

public class ConversorMoneda extends Conversor {

	private String[] opcionesMoneda = { "COP A USD", "COP A EUR", "COP A GBP", "COP A JPY", "COP A KRW", "USD A COP",
			"EUR A COP", "GBP A COP", "JPY A COP", "KRW A COP" };

	@Override
	protected void obtenerValor() {
		while (true) {

			try {
				valor = Double
						.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea convertir:"));
				break;

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Por favor ingrese un valor numerico válido");
			}
		}

	}

	@Override
	protected void mostrarResultado() {
		String monedaSeleccionada = (String) JOptionPane.showInputDialog(null,
				"Elige la moneda a la que deseas convertir tu dinero:", "Monedas", JOptionPane.PLAIN_MESSAGE, null,
				opcionesMoneda, opcionesMoneda[0]);

		if (valor < 0) {
			JOptionPane.showMessageDialog(null, "El valor ingresado debe ser positivo");
			return;
		}

		double resultado = 0.0;

		switch (monedaSeleccionada) {

		case "COP A USD":
			resultado = valor / 4436.82;
			break;
		case "COP A EUR":
			resultado = valor / 4847.21;
			break;
		case "COP A GBP":
			resultado = valor / 5489.24;
			break;
		case "COP A JPY":
			resultado = valor / 33.04;
			break;
		case "COP A KRW":
			resultado = valor / 3.35;
			break;
		case "USD A COP":
			resultado = valor * 4436.82;
			break;
		case "EUR A COP":
			resultado = valor * 4847.21;
			break;
		case "GBP A COP":
			resultado = valor * 5489.24;
			break;
		case "JPY A COP":
			resultado = valor * 33.04;
			break;
		case "KRW A COP":
			resultado = valor * 3.35;
			break;
		default:
			JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna moneda");
			return;

		}

		JOptionPane.showMessageDialog(null, valor + " " + monedaSeleccionada.substring(0, 3) + "="
				+ String.format("%.2f", resultado) + " " + monedaSeleccionada.substring(6, 9));

	}

}
