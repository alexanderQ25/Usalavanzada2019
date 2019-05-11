package edu.usal.dao.implementacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.dao.negocio.Cliente;

public class ClienteDAOimplSerializacion implements ClienteDAO {

	@Override
	public List<Cliente> leerTodoCliente() throws IOException, ClassNotFoundException {
		
		List<Cliente> listadoCliente = new ArrayList<Cliente>();
		FileInputStream archStr = new FileInputStream (new File("profesor.dat"));
		ObjectInputStream Objectinput = new ObjectInputStream (archStr);
		
		listadoCliente = (List<Cliente>) Objectinput.readObject();
		
		Objectinput.close();
		
		
		return listadoCliente;
	}
	
	
	
	

	@Override
	public void AltaCliente(Cliente AltaCliente) throws IOException {
		
		List<Cliente> listadoCliente = new ArrayList<Cliente>();
		
		FileInputStream archSali = new FileInputStream ( new File ("cliente.dat"));
		ObjectInputStream ObjectoArchStr = new ObjectInputStream (archSali);
		
		try {
			listadoCliente = (List<Cliente> ) ObjectoArchStr.readObject();
			
			ObjectoArchStr.close();
		} catch (ClassNotFoundException e) {
			
		System.out.println(e.getMessage());
			
			e.printStackTrace();
		}
		
		
		FileOutputStream archEnt = new FileOutputStream (new File("cliente.dat"));
		ObjectOutputStream ObjectoArchStrSalida = new ObjectOutputStream (archEnt);
		
		listadoCliente.add(AltaCliente);
		ObjectoArchStrSalida.writeObject(listadoCliente);
        ObjectoArchStrSalida.close();
	}
	
	
	

	@Override
	public void ModCliente(Cliente ModicarCliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void BajaCliente(Cliente BajaCliente) {
		// TODO Auto-generated method stub

	}

}
