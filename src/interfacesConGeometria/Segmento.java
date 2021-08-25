package interfacesConGeometria;

public class Segmento implements Comparable<Segmento>, Desplazable, EsParalelo{
	
	private Punto puntoA;
	private Punto puntoB;
	
	public Segmento(Punto puntoA, Punto puntoB) {
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}
	
	public Double getLargo() {
		return this.puntoA.distancia(puntoB);
	}
	
	@Override
	public void desplazar(double ejeX, double ejeY) {
		this.puntoA.desplazar(ejeX, ejeY);
		this.puntoB.desplazar(ejeX, ejeY);
	}
	
	@Override
	public int compareTo(Segmento o) {
		return this.getLargo().compareTo(o.getLargo());
	}
	
	@Override
	public boolean esParaleloAX() {
		return this.puntoA.getY() == this.puntoB.getY();
	}
	
	@Override
	public boolean esParaleloAY() {
		return this.puntoA.getX() == this.puntoB.getX();
	}
	
	@Override
	public boolean esParalelo(EsParalelo s) {
		if (s instanceof Segmento) {
			Segmento otro = (Segmento) s;
			
			double a = this.puntoB.getY() - this.puntoA.getY();
			double b = this.puntoB.getX() - this.puntoA.getX();
			double c = otro.puntoB.getY() - otro.puntoA.getY();
			double d = otro.puntoB.getX() - otro.puntoA.getX();
			return (a / b == c / d);
		}
		return false;
	}
	
	
	
}
