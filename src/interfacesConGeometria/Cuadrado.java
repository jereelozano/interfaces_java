package interfacesConGeometria;

import java.util.Objects;

public class Cuadrado extends Figura{
	private double lado;
	
	public Cuadrado(Punto inferiorIzq, int i) throws InvalidCuadradoException {
		super(inferiorIzq);
		setLado(i);
	}
	
	private void setLado(double lado) {
		if (lado <= 0)
			throw new InvalidCuadradoException("Lado negativo o cero...");
		this.lado = lado;
	}
	
	@Override
	public Double getArea() {
		return lado * lado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lado);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuadrado other = (Cuadrado) obj;
		return Double.doubleToLongBits(lado) == Double.doubleToLongBits(other.lado);
	}
	
	
}
