package fr.worldline.spring.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Component
@Repository
public class SocieteDevLogiciel {
	
	private String nomSociete;
	
	@Autowired
	private Developpeur developpeur;
	
	@Autowired	
	private Developpeur chefDeveloppeur;
	
	public SocieteDevLogiciel() {
		System.out.println("Instantation objet societeDevLogiciel");
	}

	public String getNomSociete() {
		return nomSociete;
	}

	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}

	public Developpeur getDeveloppeur() {
		return developpeur;
	}

	public void setDeveloppeur(Developpeur developpeur) {
		System.out.println("Association objet développeur " + developpeur.getNom());
		this.developpeur = developpeur;
	}

	public Developpeur getChefDeveloppeur() {
		return chefDeveloppeur;
	}

	public void setChefDeveloppeur(Developpeur chefDeveloppeur) {
		this.chefDeveloppeur = chefDeveloppeur;
	}
	
	@PostConstruct
	private void gestionCache() {
		System.out.println("SocieteDevLogiciel post construct cache mngt");
	}
	
	@PreDestroy
	private void clearCache() {
		System.out.println("Cache cleared before destroy");
	}

	
	

}
