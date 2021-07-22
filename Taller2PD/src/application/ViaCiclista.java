package application;

public class ViaCiclista extends Logistica{

	@Override
	protected Transporte TransporteVia() {
		Transporte transporte = new Bicicleta();
		return transporte;
	}

}
