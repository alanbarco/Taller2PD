package chainOfResponsability;

public class AtencionAlUsuario extends CambioDeProducto {

	public AtencionAlUsuario(Handler nextHandler) {
		super(nextHandler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean handle(Producto producto) {
		//Verifiar La garantia
		return true;
	}

}
