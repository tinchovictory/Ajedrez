package logica;

public class Torre extends Pieza{
	
	private static List<Movimiento> movimientos;
	
	static {
		movimientos = new ArrayList(4);
		Movimiento arriba = new Movimiento(0, 1, true, true, false, false);
		Movimiento abajo = new Movimiento(0, -1, true, true, false, false);
		Movimiento izquierda = new Movimiento(-1, 0, true, true, false, false);
		Movimiento derecha = new Movimiento(1, 0, true, true, false, false);
		movimientos.add(arriba);
		movimientos.add(abajo);
		movimientos.add(izquierda);
		movimientos.add(derecha);
		// Faltaría implementar la posibilidad de enroque
	}

	public Torre(Color color){
		super(color);
	}

	@Override
	public List<Movimiento> dameMovimientos() {
		return movimientos;
	}
	
}