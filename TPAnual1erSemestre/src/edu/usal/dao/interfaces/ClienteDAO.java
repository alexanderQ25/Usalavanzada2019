package edu.usal.dao.interfaces;

import java.io.IOException;
import java.util.List;

import edu.usal.dao.negocio.Cliente;

public interface ClienteDAO {
	
	
	public List<Cliente> leerTodoCliente() throws IOException, ClassNotFoundException;
	public void AltaCliente(Cliente AltaCliente) throws IOException;
	public void ModCliente (Cliente ModicarCliente);
	public void BajaCliente (Cliente BajaCliente);
	

}
