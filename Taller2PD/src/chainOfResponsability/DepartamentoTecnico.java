package chainOfResponsability;

public class DepartamentoTecnico extends CambioDeProducto{

	public DepartamentoTecnico(Handler nextHandler) {
		super(nextHandler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean handle(Producto producto) {
		// constatar que el tipo de fallo se encuentre dentro de lo cubierto por la garantía
		return true;
	}

}
