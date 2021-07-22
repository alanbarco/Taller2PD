package application;


public abstract class Logistica {
	public void planEntrega() {
		
	}
	protected abstract Transporte TransporteVia();
	public Transporte crearTransporte() {
		return this.TransporteVia();
	}

}
