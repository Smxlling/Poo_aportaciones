package Modelo;

public class Cuenta {
	private String fechaModificacion;
	private String descripcion;
	private float saldo;
	private float debe;
	private float haber;
	private String catBalance;
	private String catEstado;
	public String getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getDebe() {
		return debe;
	}
	public void setDebe(float debe) {
		this.debe = debe;
	}
	public float getHaber() {
		return haber;
	}
	public void setHaber(float haber) {
		this.haber = haber;
	}
	public String getCatBalance() {
		return catBalance;
	}
	public void setCatBalance(String catBalance) {
		this.catBalance = catBalance;
	}
	public String getCatEstado() {
		return catEstado;
	}
	public void setCatEstado(String catEstado) {
		this.catEstado = catEstado;
	}
	
	public void AgregarSaldo() {
		
	}


}
