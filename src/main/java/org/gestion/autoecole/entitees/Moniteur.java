package org.gestion.autoecole.entitees;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * Description of file Moniteur.java.
 * 
 * @author adem Ben Amor.
 *
 *         Date: 15 juil. 2017
 *
 *         This copy right notice should not be removed
 */
@Entity
@DiscriminatorValue("monit")

public class Moniteur extends Personne {

	public Moniteur() {
		super();
		role = "moniteur";
	}

	public Moniteur(Long numCin, String nom, String prenom, String genre, Date dateNaissance, String lieuNaissance,
			String email, String ville, String login, String mdp) {
		super(numCin, nom, prenom, genre, dateNaissance, lieuNaissance, email, ville, login, mdp);

	}

}
