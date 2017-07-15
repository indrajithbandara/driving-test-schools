package org.gestion.autoecole.entitees;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * 
 * Description of file Candidat.java.
 * 
 * @author adem Ben Amor.
 *
 *         Date: 15 juil. 2017
 *
 *         This copy right notice should not be removed
 */
@Entity
public class Candidat {
	@Id
	private Long numCin;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String lieuNaissance;
	private String ville;
	@Temporal(TemporalType.DATE)
	private Date dateInscription;
	private String email;
	private String profession;
	private String genre;
	private boolean codeObtenu;
	private boolean permisObtenu;

	@Transient
	private String candidatInformation;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "candidat")
	Facture facture;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "candidat")
	private List<SeanceDeFormation> listSeanceDeFormation;

	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidat(Long numCin, String nom, String prenom, Date dateNaissance, String lieuNaissance, String ville,
			Date dateInscription, String email, String profession, String genre, boolean codeObtenu,
			boolean permisObtenu) {
		super();
		this.numCin = numCin;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.ville = ville;
		this.dateInscription = dateInscription;
		this.email = email;
		this.profession = profession;
		this.genre = genre;
		this.codeObtenu = codeObtenu;
		this.permisObtenu = permisObtenu;
	}

	public Candidat(Long numCin, String nom, String prenom, Date dateNaissance, String lieuNaissance, String ville,
			Date dateInscription, String email, String profession, String genre, boolean codeObtenu,
			boolean permisObtenu, Facture facture, List<SeanceDeFormation> listSeanceDeFormation) {
		super();
		this.numCin = numCin;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.ville = ville;
		this.dateInscription = dateInscription;
		this.email = email;
		this.profession = profession;
		this.genre = genre;
		this.codeObtenu = codeObtenu;
		this.permisObtenu = permisObtenu;
		this.facture = facture;
		this.listSeanceDeFormation = listSeanceDeFormation;
	}

	public Candidat(Long numCin, String nom, String prenom, Date dateNaissance, String lieuNaissance, String ville,
			Date dateInscription, String email, String profession, String genre, boolean codeObtenu,
			boolean permisObtenu, Facture facture) {
		super();
		this.numCin = numCin;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.ville = ville;
		this.dateInscription = dateInscription;
		this.email = email;
		this.profession = profession;
		this.genre = genre;
		this.codeObtenu = codeObtenu;
		this.permisObtenu = permisObtenu;
		this.facture = facture;
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

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean isCodeObtenu() {
		return codeObtenu;
	}

	public void setCodeObtenu(boolean codeObtenu) {
		this.codeObtenu = codeObtenu;
	}

	public boolean isPermisObtenu() {
		return permisObtenu;
	}

	public void setPermisObtenu(boolean permisObtenu) {
		this.permisObtenu = permisObtenu;
	}

	public List<SeanceDeFormation> getListSeanceDeFormation() {
		return listSeanceDeFormation;
	}

	public void setListSeanceDeFormation(List<SeanceDeFormation> listSeanceDeFormation) {
		this.listSeanceDeFormation = listSeanceDeFormation;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	@Override
	public String toString() {
		return "Candidat [numCin=" + numCin + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", lieuNaissance=" + lieuNaissance + ", ville=" + ville + ", dateInscription=" + dateInscription
				+ ", email=" + email + ", profession=" + profession + ", genre=" + genre + ", codeObtenu=" + codeObtenu
				+ ", permisObtenu=" + permisObtenu + "]";
	}

	public String getCandidatInformation() {
		candidatInformation = nom + " " + prenom + " ( CIN : " + numCin + " )";
		return candidatInformation;
	}

	public void setCandidatInformation(String candidatInformation) {
		this.candidatInformation = candidatInformation;
	}

}
