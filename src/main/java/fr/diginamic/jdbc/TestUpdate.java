package fr.diginamic.jdbc;

import fr.diginamic.jdbc.dao.FournisseurDao;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;

public class TestUpdate {

	public static void main(String[] args) {

		FournisseurDao dao = new FournisseurDaoJdbc();
		dao.update("Unimétal", "Exométal");

		ConnectionMgr.close();

	}

}
