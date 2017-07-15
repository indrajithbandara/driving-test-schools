package org.gestion.autoecole.entitees;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * 
 * Description of file SeanceDeFormationConduite.java.
 * 
 * @author adem Ben Amor.
 *
 *         Date: 15 juil. 2017
 *
 *         This copy right notice should not be removed
 */
@Entity
@DiscriminatorValue("cond")
public class SeanceDeFormationConduite extends SeanceDeFormation {

	@ManyToOne
	private Vehicule vehicule;

	public SeanceDeFormationConduite() {
		super();
	}

	public SeanceDeFormationConduite(Long idSeance, Date dateSeance, double prix, Personne personne, Candidat candidat,
			Vehicule vehicule) {
		super(idSeance, dateSeance, prix, personne, candidat);
		this.vehicule = vehicule;
	}

	public SeanceDeFormationConduite(Date dateSeance, double prix, Personne personne, Candidat candidat,
			Vehicule vehicule) {
		super(dateSeance, prix, personne, candidat);
		this.vehicule = vehicule;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

}
