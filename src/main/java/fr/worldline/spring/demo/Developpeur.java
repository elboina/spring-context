package fr.worldline.spring.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component
@Service
public class Developpeur {
	
	private String nom;
	
	private int nbAnneesExperience;	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbAnneesExperience() {
		return nbAnneesExperience;
	}

	public void setNbAnneesExperience(int nbAnneesExperience) {
		System.out.println("Setter developpeur");
		this.nbAnneesExperience = nbAnneesExperience;
	}
	
	@PostConstruct
	public void devConfig() {
		System.out.println("Post construct developpeur");
	}

}
