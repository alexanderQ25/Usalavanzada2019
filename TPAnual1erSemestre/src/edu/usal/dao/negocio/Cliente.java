package edu.usal.dao.negocio;

import java.util.Date;

public class Cliente {
	
	private String NombreyApellido;
	private int dni;
	private Pasaporte pasaporte;
	private String cuit;
	private Date date;
	private String mail;
    private Telefono telefono;
	private NrodePasajero nrodepasajero;
	private DireccionCompleta direccionCompleta;
	
	public Cliente() {}
	
	
	
	public Cliente(String nombreyApellido, int dni, Pasaporte pasaporte, String cuit, Date date, String mail,
			Telefono telefono, NrodePasajero nrodepasajero, DireccionCompleta direccionCompleta) {
		super();
		NombreyApellido = nombreyApellido;
		this.dni = dni;
		this.pasaporte = pasaporte;
		this.cuit = cuit;
		this.date = date;
		this.mail = mail;
		this.telefono = telefono;
		this.nrodepasajero = nrodepasajero;
		this.direccionCompleta = direccionCompleta;
	}




	public String getNombreyApellido() {
		return NombreyApellido;
	}




	public void setNombreyApellido(String nombreyApellido) {
		NombreyApellido = nombreyApellido;
	}




	public int getDni() {
		return dni;
	}




	public void setDni(int dni) {
		this.dni = dni;
	}




	public Pasaporte getPasaporte() {
		return pasaporte;
	}




	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}




	public String getCuit() {
		return cuit;
	}




	public void setCuit(String cuit) {
		this.cuit = cuit;
	}




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}




	public String getMail() {
		return mail;
	}




	public void setMail(String mail) {
		this.mail = mail;
	}




	public Telefono getTelefono() {
		return telefono;
	}




	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}




	public NrodePasajero getNrodepasajero() {
		return nrodepasajero;
	}




	public void setNrodepasajero(NrodePasajero nrodepasajero) {
		this.nrodepasajero = nrodepasajero;
	}




	public DireccionCompleta getDireccionCompleta() {
		return direccionCompleta;
	}




	public void setDireccionCompleta(DireccionCompleta direccionCompleta) {
		this.direccionCompleta = direccionCompleta;
	}
	
	
	
	
}
