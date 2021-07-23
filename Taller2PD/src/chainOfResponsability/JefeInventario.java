package chainOfResponsability;

public class JefeInventario extends CambioDeProducto{

	public JefeInventario(Handler nextHandler) {
		super(nextHandler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean handle(Producto producto) {
		// certificar la existencia del producto en bodega para reposición
		return true;
	}

}
