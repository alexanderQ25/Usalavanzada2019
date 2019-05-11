package edu.usal.dao.implementacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.dao.negocio.Cliente;


public class ClienteDAOimplArchivo implements ClienteDAO {
	
	
	
    private File archivo;
	
	private FileWriter archivoWriter;
	private FileReader archivoReader;
	
	private BufferedWriter archivobufferwriter;
	private BufferedReader archivobufferreader;
	



	@Override
	public List<Cliente> leerTodoCliente() throws IOException {

		archivo = new File("Cliente.txt");
		archivoReader = new FileReader(archivo);
		
		archivobufferreader = new BufferedReader(archivoReader);
		String val;
		
		List<Cliente> listadoCliente = new ArrayList<Cliente>();
		
		while ((val = archivobufferreader.readLine()) != null) {
			
			listadoCliente.add(ParseCliente(val));
		
		}
	
		return listadoCliente;
	}


	private Cliente ParseCliente(String val) {
		
		String [] atributos = val.split(";");
		
		Cliente cliente = new Cliente();
		cliente.setNombreyApellido(atributos[0]);
	   // cliente.setDni(Integer.valueOf(atributos[2]));
	   // cliente.setMail(atributos[1]);
	
		return cliente;

	}


	@Override
	public void AltaCliente(Cliente AltaCliente) throws IOException {
		
		archivo = new File ("Cliente.txt");
	    archivoWriter = new FileWriter(archivo);	
		
		archivobufferwriter = new BufferedWriter (archivoWriter);
	    
		String str  =  SaveCliente (AltaCliente);
		
		archivobufferwriter.write(str);
		archivobufferwriter.close();
		archivoWriter.close();
		
	}


	private String SaveCliente(Cliente altaCliente) {
		
		
		
		return altaCliente.getMail() + altaCliente.getDni() + altaCliente.getNombreyApellido();
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
