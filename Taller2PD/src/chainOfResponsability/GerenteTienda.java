package chainOfResponsability;

public class GerenteTienda extends CambioDeProducto{

	public GerenteTienda(Handler nextHandler) {
		super(nextHandler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean handle(Producto producto) {
		// aprobaci�n del gerente de la tienda.
		return true;
	}

}
