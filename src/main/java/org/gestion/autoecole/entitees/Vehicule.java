package org.gestion.autoecole.entitees;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity

public class Vehicule  implements Serializable{
	
	@Id @GeneratedValue
	private long idVehicule ;
	private String modele ;
	private String marque ;
	private String matricule ;
	private String couleur ;
	@Temporal(TemporalType.DATE)
	private Date dateAchat ;
	
	@Transient
	private String vehiculeInformation;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "vehicule")
	private List<SeanceDeFormationConduite> listSeanceConduite;

	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vehicule(long idVehicule, String modele, String marque, String matricule, String couleur, Date dateAchat) {
		super();
		this.idVehicule = idVehicule;
		this.modele = modele;
		this.marque = marque;
		this.matricule = matricule;
		this.couleur = couleur;
		this.dateAchat = dateAchat;
	}

	public Vehicule(String modele, String marque, String matricule, String couleur, Date dateAchat) {
		super();
		this.modele = modele;
		this.marque = marque;
		this.matricule = matricule;
		this.couleur = couleur;
		this.dateAchat = dateAchat;
	}

	public long getIdVehicule() {
		return idVehicule;
	}

	public void setIdVehicule(long idVehicule) {
		this.idVehicule = idVehicule;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public List<SeanceDeFormationConduite> getListSeanceConduite() {
		return listSeanceConduite;
	}

	public void setListSeanceConduite(List<SeanceDeFormationConduite> listSeanceConduite) {
		this.listSeanceConduite = listSeanceConduite;
	}

	public String getVehiculeInformation() {
		vehiculeInformation = marque + " "+modele+" ( idVehicule : "+idVehicule+" )";
		return vehiculeInformation;
	}
	

	public void setVehiculeInformation(String vehiculeInformation) {
		this.vehiculeInformation = vehiculeInformation;
	}

}
