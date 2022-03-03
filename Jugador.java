package examen;

public class Jugador {
	protected String Nombre;
	protected int Dorsal;
	protected int PotenciaDisparo;
	protected int CalidadPorteria;
	protected int Vidas;
	
	public Jugador(String Nombre, int Dorsal, int PotenciaDisparo, int CalidadPorteria, int Vidas) {
		this.Nombre = Nombre;
		this.Dorsal = Dorsal;
		this.PotenciaDisparo = PotenciaDisparo;
		this.CalidadPorteria = CalidadPorteria;
		this.Vidas = 2;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public int getDorsal() {
		return Dorsal;
	}
	public void setDorsal(int dorsal) {
		this.Dorsal = dorsal;
	}
	public int getPotenciaDisparo() {
		return PotenciaDisparo;
	}
	public void setPotenciaDisparo(int potenciaDisparo) {
		this.PotenciaDisparo = potenciaDisparo;
	}
	public int getCalidadPorteria() {
		return CalidadPorteria;
	}
	public void setCalidadPorteria(int calidadPorteria) {
		this.CalidadPorteria = calidadPorteria;
	}
	public int getVidas() {
		return Vidas;
	}
	public void setVidas(int vidas) {
		this.Vidas = vidas;
	}
	@Override
	public String toString() {
		return "Jugador [Nombre=" + Nombre + ", Dorsal=" + Dorsal + ", PotenciaDisparo=" + PotenciaDisparo
				+ ", CalidadPorteria=" + CalidadPorteria + ", Vidas=" + Vidas + "]";
	}
	
	
	
}
