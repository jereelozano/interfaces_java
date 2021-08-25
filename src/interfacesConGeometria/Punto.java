package interfacesConGeometria;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.util.Objects;

public class Punto implements Desplazable {
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	private void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	private void setY(double y) {
		this.y = y;
	}

	public Punto(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	public double distancia(Punto otro) {
		return sqrt(pow(this.x - otro.x, 2) + pow(this.y - otro.y, 2));
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.setX(this.getX() + deltaX);
		this.setY(this.getY() + deltaY);
	}

	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

}
