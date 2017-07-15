package org.gestion.autoecole.entitees;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
/**
 * 
 * Description of file Facture.java.
 * 
 * @author adem
 *
 * Date: 15 juil. 2017
 *
 * This copy right notice should not be removed
 */
@Entity
public class Facture implements Serializable {
	
	@Id @GeneratedValue
	private Long idFacture ;
	private double montant ;
	private int nbrSeanceConduite;
	private int nbrSeanceCode;
	@OneToOne 
	private Candidat candidat;

	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture(Long idFacture, double montant, int nbrSeanceConduite, int nbrSeanceCode, Candidat candidat) {
		super();
		this.idFacture = idFacture;
		this.montant = montant;
		this.nbrSeanceConduite = nbrSeanceConduite;
		this.nbrSeanceCode = nbrSeanceCode;
		this.candidat = candidat;
	}

	public Facture(double montant, int nbrSeanceConduite, int nbrSeanceCode, Candidat candidat) {
		super();
		this.montant = montant;
		this.nbrSeanceConduite = nbrSeanceConduite;
		this.nbrSeanceCode = nbrSeanceCode;
		this.candidat = candidat;
	}

	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public int getNbrSeanceConduite() {
		return nbrSeanceConduite;
	}
	public void setNbrSeanceConduite(int nbrSeanceConduite) {
		this.nbrSeanceConduite = nbrSeanceConduite;
	}
	public int getNbrSeanceCode() {
		return nbrSeanceCode;
	}
	public void setNbrSeanceCode(int nbrSeanceCode) {
		this.nbrSeanceCode = nbrSeanceCode;
	}
	public Candidat getCandidat() {
		return candidat;
	}
	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	

}
