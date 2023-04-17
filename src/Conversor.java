
abstract class Conversor {

	protected double valor;

	public void convertir() {
		obtenerValor();
		mostrarResultado();

	}

	protected abstract void obtenerValor();

	protected abstract void mostrarResultado();

}
