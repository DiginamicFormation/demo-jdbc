package fr.diginamic.entites;

/**
 * Représente un article
 * 
 * @author DIGINAMIC
 *
 */
public class Article {

	/** identifiant */
	private int id;
	/** désignation */
	private String designation;
	/** référence */
	private String reference;

	/**
	 * Constructeur
	 * 
	 * @param id          identifiant
	 * @param designation désignation
	 * @param reference   référence
	 */
	public Article(int id, String designation, String reference) {
		super();
		this.id = id;
		this.designation = designation;
		this.reference = reference;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * Setter
	 * 
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * Getter
	 * 
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * Setter
	 * 
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}
}
