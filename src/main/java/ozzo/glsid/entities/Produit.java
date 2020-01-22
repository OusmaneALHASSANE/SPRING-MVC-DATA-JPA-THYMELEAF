package ozzo.glsid.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Produit implements Serializable{
@Id @GeneratedValue
	private Long id;
@Column(length=50)

@NotNull
	private String designation;
@DecimalMin("100")
    private Double prix;
    private Integer quantite;
	public Produit(@NotNull String designation, Double prix, Integer quantite) {
	super();
	this.designation = designation;
	this.prix = prix;
	this.quantite = quantite;
}
	public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
	public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Double getPrix() {
	return prix;
}
public void setPrix(Double prix) {
	this.prix = prix;
}
public Integer getQuantite() {
	return quantite;
}
public void setQuantite(Integer quantite) {
	this.quantite = quantite;
}
	
}
