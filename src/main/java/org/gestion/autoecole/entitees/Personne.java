package org.gestion.autoecole.entitees;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * 
 * Description of file Personne.java.
 * 
 * @author adem Ben Amor.
 *
 *         Date: 15 juil. 2017
 *
 *         This copy right notice should not be removed
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypePersonne", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 5)

public class Personne implements Serializable {

	@Id
	private Long numCin;
	private String nom;
	private String prenom;
	private String genre;
	private Date dateNaissance;
	private String lieuNaissance;
	private String email;
	private String ville;
	private String login;
	private String mdp;
	protected String role;
	private boolean enabled = true;

	@Transient
	private String personneInformation;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "personne")
	private List<SeanceDeFormation> listSeanceFormation;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(Long numCin, String nom, String prenom, String genre, Date dateNaissance, String lieuNaissance,
			String email, String ville, String login, String mdp, List<SeanceDeFormation> listSeanceFormation) {
		super();
		this.numCin = numCin;
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.email = email;
		this.ville = ville;
		this.login = login;
		this.mdp = mdp;
		this.listSeanceFormation = listSeanceFormation;
	}

	public Personne(Long numCin, String nom, String prenom, String genre, Date dateNaissance, String lieuNaissance,
			String email, String ville, String login, String mdp) {
		super();
		this.numCin = numCin;
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.email = email;
		this.ville = ville;
		this.login = login;
		this.mdp = mdp;
	}

	public Long getNumCin() {
		return numCin;
	}

	public void setNumCin(Long numCin) {
		this.numCin = numCin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getLieuNaissance() {
		return lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public List<SeanceDeFormation> getListSeanceFormation() {
		return listSeanceFormation;
	}

	public void setListSeanceFormation(List<SeanceDeFormation> listSeanceFormation) {
		this.listSeanceFormation = listSeanceFormation;
	}

	public String getPersonneInformation() {
		personneInformation = nom + " " + prenom + " ( CIN : " + numCin + " )";
		return personneInformation;
	}

	public void setPersonneInformation(String personneInformation) {
		this.personneInformation = personneInformation;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}