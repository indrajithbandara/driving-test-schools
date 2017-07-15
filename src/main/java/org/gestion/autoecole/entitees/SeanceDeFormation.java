package org.gestion.autoecole.entitees;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * Description of file SeanceDeFormation.java.
 * 
 * @author adem Ben Amor.
 *
 *         Date: 15 juil. 2017
 *
 *         This copy right notice should not be removed
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeSeance", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 4)
public class SeanceDeFormation implements Serializable {
	@Id
	@GeneratedValue
	private Long idSeance;
	@Temporal(TemporalType.DATE)
	private Date dateSeance;
	private double prix;
	@ManyToOne
	private Personne personne;
	@ManyToOne
	private Candidat candidat;

	public SeanceDeFormation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeanceDeFormation(Long idSeance, Date dateSeance, double prix, Personne personne, Candidat candidat) {
		super();
		this.idSeance = idSeance;
		this.dateSeance = dateSeance;
		this.prix = prix;
		this.personne = personne;
		this.candidat = candidat;
	}

	public SeanceDeFormation(Date dateSeance, double prix, Personne personne, Candidat candidat) {
		super();
		this.dateSeance = dateSeance;
		this.prix = prix;
		this.personne = personne;
		this.candidat = candidat;
	}

	public Long getIdSeance() {
		return idSeance;
	}

	public void setIdSeance(Long idSeance) {
		this.idSeance = idSeance;
	}

	public Date getDateSeance() {
		return dateSeance;
	}

	public void setDateSeance(Date dateSeance) {
		this.dateSeance = dateSeance;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

}
