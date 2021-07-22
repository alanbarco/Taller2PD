package application;

public class ViaFluvial extends Logistica{

	@Override
	protected Transporte TransporteVia() {
		Transporte transporte = new Barco();
		return transporte;
	}
	
}
