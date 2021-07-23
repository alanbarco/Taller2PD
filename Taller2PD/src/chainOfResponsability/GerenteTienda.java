package chainOfResponsability;

public class GerenteTienda extends CambioDeProducto{

	public GerenteTienda(Handler nextHandler) {
		super(nextHandler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean handle(Producto producto) {
		// aprobación del gerente de la tienda.
		return true;
	}

}
