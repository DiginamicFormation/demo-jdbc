package fr.diginamic.jdbc;

import fr.diginamic.entites.Fournisseur;
import fr.diginamic.jdbc.dao.FournisseurDao;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;

public class TestInsertion {

	public static void main(String[] args) {

		FournisseurDao dao = new FournisseurDaoJdbc();
		dao.insert(new Fournisseur(10, "Unimétal"));

		ConnectionMgr.close();

	}

}
