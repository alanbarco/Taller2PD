package application;

public class ViaArea extends Logistica{

	@Override
	protected Transporte TransporteVia() {
		Transporte transporte = new Avion();
		return transporte;
	}
	
}
