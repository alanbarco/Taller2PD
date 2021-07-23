package chainOfResponsability;

public class Cliente {
	
	private static CambioDeProducto crearCadenParaCambio() {
		CambioDeProducto manejadorGerente = new AtencionAlUsuario(null);
		CambioDeProducto manejadorJefeIn = new JefeInventario(manejadorGerente);
		CambioDeProducto manejadorDepartamentoCLiente = new DepartamentoTecnico(manejadorJefeIn);
        return new AtencionAlUsuario(manejadorDepartamentoCLiente);
      //Se crear los manejadores y la cadena 
    }
	

}
