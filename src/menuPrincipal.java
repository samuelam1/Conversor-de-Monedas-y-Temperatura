import javax.swing.JOptionPane;

public class menuPrincipal {

	public static void main(String[] args) {

		boolean continuar = true;

		while (continuar) {

			String[] opciones = { "Conversor de moneda", "Conversor de Temperatura", "Salir" };

			int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción de conversión ", "Menu Principal",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
			int respuesta = JOptionPane.NO_OPTION;

			switch (seleccion) {
			case 0:
				// Logica_para_el_converosr_de_moneda
				Conversor conversorMoneda = new ConversorMoneda();
				conversorMoneda.convertir();

				respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar",
						JOptionPane.YES_NO_OPTION);

				break;

			case 1:
				// Logica_para_el_converosr_de_moneda
				Conversor conversorTemperatura = new ConversorTemperatura();
				conversorTemperatura.convertir();

				respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar",
						JOptionPane.YES_NO_OPTION);

				break;

			case 2:
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				System.exit(0);

				break;

			default:
				break;
			}

			if (respuesta == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				System.exit(0);

			}

		}

	}

}
