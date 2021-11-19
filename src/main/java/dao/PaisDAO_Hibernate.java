package dao;

import java.util.List;
import javax.persistence.EntityManager;


import dominio.Pais;

import util.ConnectionBD;

public class PaisDAO_Hibernate implements PaisDAO {
	
	private static EntityManager manager;

		
		public List<Pais> getPais() {
			
			manager = ConnectionBD.conectar();

			List<Pais> paises = manager
					.createQuery("SELECT p FROM pais p", Pais.class).getResultList();
			
			manager.clear();
			
		//	manager.wait();
			
			return paises;
		    
	
		}
}
