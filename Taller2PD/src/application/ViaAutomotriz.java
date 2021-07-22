package application;


public class ViaAutomotriz extends Logistica{

	@Override
	protected Transporte TransporteVia() {
		Transporte transporte = new Auto();
		return transporte;
	}
	
}
