package fr.diginamic.jdbc;

import java.util.List;

import fr.diginamic.entites.Fournisseur;
import fr.diginamic.jdbc.dao.FournisseurDao;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;
import fr.diginamic.jdbc.utils.ConnectionMgr;

public class TestSelect {

	public static void main(String[] args) {

		FournisseurDao dao = new FournisseurDaoJdbc();
		List<Fournisseur> fournisseurs = dao.extraire();
		for (Fournisseur four : fournisseurs) {
			System.out.println(four);
		}

		ConnectionMgr.close();

	}

}
