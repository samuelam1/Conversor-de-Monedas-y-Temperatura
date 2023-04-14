import javax.swing.JOptionPane;

public class menuPrincipal {

	public static void main(String[] args) {

		String[] opciones = { "Conversor de moneda", "Conversor de Temperatura", "Salir" };

		int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción de conversión ", "Menu Principal",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

		switch (seleccion) {
		case 0:
			// Logica_para_el_converosr_de_moneda
			break;

		case 1:
			// Logica_para_el_converosr_de_moneda
			break;

		case 2:
			System.exit(0);
			break;

		default:
			break;

		}

	}

}
