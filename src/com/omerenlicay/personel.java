package com.omerenlicay;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class personel {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)

	private int personelid;
	private String personelAdi;
	private String personelSoyadi;
	//-------------------------------------
	public int getPersonelid() {
		return personelid;
	}
	public void setPersonelid(int personelid) {
		this.personelid = personelid;
	}
	
	//------------------------------------
	public String getPersonelAdi() {
		return personelAdi;
	}
	
	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}
	
	//--------------------------------------------------	
	public String getPersonelSoyadi() {
		return personelSoyadi;
	}
	public void setPersonelSoyadi(String personelSoyadi) {
		this.personelSoyadi = personelSoyadi;
	}
	
	
	
}
