package com.programmeren4.turnahead.server;


import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class OPPersoonsGegevens {
	
	//voorbeeld voor aanspreking database
	// weet momenteel de namen van de velden niet dus (note/id) gebruikt
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	@Persistent
	private String note;
	@Persistent
	private Date createDate;
 
	//a good way to use constructor
	public OPPersoonsGegevens() {
		this.createDate = new Date();
	}
 
	public OPPersoonsGegevens(String symbol) {
		this();
		this.note = symbol;
	}
 
	public Long getId() {
		return this.id;
	}
 
	public String getNote() {
		return this.note;
	}
 
	public Date getCreateDate() {
		return this.createDate;
	}
 
	public void setNote(String note) {
		this.note = note;
	}
}