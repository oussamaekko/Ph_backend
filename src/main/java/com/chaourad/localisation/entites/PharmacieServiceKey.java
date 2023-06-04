package com.chaourad.localisation.entites;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Embeddable;

@Embeddable
public class PharmacieServiceKey implements Serializable {
	private int pharmacie;
	private int garde;

	private Date dateDebut;

	public int getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(int pharmacie) {
		this.pharmacie = pharmacie;
	}

	public int getGarde() {
		return garde;
	}

	public void setGarde(int garde) {
		this.garde = garde;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public PharmacieServiceKey() {
		super();
	}

}
