package application;

public class ViaFerrea extends Logistica{

	@Override
	protected Transporte TransporteVia() {
		Transporte transporte = new Tren();
		return transporte;
	}
	
}
