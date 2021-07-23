package chainOfResponsability;

public abstract class CambioDeProducto implements Handler{
	
	
	protected Handler nextHandler;
	
	public CambioDeProducto(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	
	@Override
	public void setNext(Handler handler) {
		this.nextHandler = handler;
		
	}

	public abstract boolean handle(Producto producto);
	
	

}
