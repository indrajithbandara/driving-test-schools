package org.gestion.autoecole.entitees;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 * Description of file SeanceDeFormationCode.java.
 * 
 * @author adem Ben Amor.
 *
 *         Date: 15 juil. 2017
 *
 *         This copy right notice should not be removed
 */

@Entity
@DiscriminatorValue("code")
public class SeanceDeFormationCode extends SeanceDeFormation {

	public SeanceDeFormationCode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeanceDeFormationCode(Date dateSeance, double prix, Personne personne, Candidat candidat) {
		super(dateSeance, prix, personne, candidat);
		// TODO Auto-generated constructor stub
	}

	public SeanceDeFormationCode(Long idSeance, Date dateSeance, double prix, Personne personne, Candidat candidat) {
		super(idSeance, dateSeance, prix, personne, candidat);
		// TODO Auto-generated constructor stub
	}

}
