package com.chaourad.localisation.entites;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class PharmacieService  {
	 @EmbeddedId
	    private PharmacieServiceKey id;
	    private Date dateFin;
	    @ManyToOne
		@JsonIgnore
	    @JoinColumn(name = "pharmacie", insertable = false, updatable = false)
	    private Pharmacie pharmacie;
	    @ManyToOne
	    @JoinColumn(name = "garde", insertable = false, updatable = false)
	    private Garde garde;
		
		public Date getDateFin() {
			return dateFin;
		}
		public void setDateFin(Date dateFin) {
			this.dateFin = dateFin;
		}
		public Pharmacie getPharmacie() {
			return pharmacie;
		}
		public void setPharmacie(Pharmacie pharmacie) {
			this.pharmacie = pharmacie;
		}
		public Garde getGarde() {
			return garde;
		}
		public void setGarde(Garde garde) {
			this.garde = garde;
		}
		public PharmacieService() {
			super();
		}
		public PharmacieServiceKey getId() {
			return id;
		}
		public void setId(PharmacieServiceKey id) {
			this.id = id;
		}
		
	
	    
	    
}
