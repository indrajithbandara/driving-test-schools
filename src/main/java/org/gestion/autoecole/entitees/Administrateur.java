package org.gestion.autoecole.entitees;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 * Description of file Administrateur.java.
 * 
 * @author adem Ben Amor.
 *
 *         Date: 15 juil. 2017
 *
 *         This copy right notice should not be removed
 */
@Entity
@DiscriminatorValue("admin")
public class Administrateur extends Personne {
	private String nomEcole;

	public Administrateur() {
		super();
		role = "admin";
	}

	public Administrateur(Long numCin, String nom, String prenom, String genre, Date dateNaissance,
			String lieuNaissance, String email, String ville, String login, String mdp, String nomEcole) {
		super(numCin, nom, prenom, genre, dateNaissance, lieuNaissance, email, ville, login, mdp);
		this.nomEcole = nomEcole;
	}

	public String getNomEcole() {
		return nomEcole;
	}

	public void setNomEcole(String nomEcole) {
		this.nomEcole = nomEcole;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
