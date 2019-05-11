package edu.usal.factory;

import edu.usal.dao.implementacion.ClienteDAOimplArchivo;
import edu.usal.dao.implementacion.ClienteDAOimplSerializacion;
import edu.usal.dao.interfaces.ClienteDAO;

public class FactoryCliente {
	
	
	
	public static ClienteDAO getImplementacion(String source)
	{
		
		
		if (source.equals("archivo"))
		{
			
			
			return new ClienteDAOimplArchivo();
			
			
		}else if (source.equals("serializacion")){
			
			
			return new ClienteDAOimplSerializacion();
			
		}
		
		return null;
			
		
	}
	
	
	

}
