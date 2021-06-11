package fr.diginamic.jdbc;

import fr.diginamic.entites.Fournisseur;
import fr.diginamic.jdbc.dao.FournisseurDao;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;

/**
 * Classe qui se connecte à la base de données compta et insére un nv
 * fournisseur.
 * 
 * @author RichardBONNAMY
 *
 */
public class TestDelete {

	/**
	 * Point d'entrée de l'application
	 * 
	 * @param args paramètre non utilisé dans cette application
	 */
	public static void main(String[] args) {

		FournisseurDao dao = new FournisseurDaoJdbc();

		Fournisseur fournisseur = dao.extraireById(10);
		dao.delete(fournisseur);

		ConnectionMgr.close();

	}

}
