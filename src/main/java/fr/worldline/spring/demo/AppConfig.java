package fr.worldline.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Classe de configuration pour une configuration spring par Java
 * @author A701298
 *
 */
//@Configuration
public class AppConfig {
	
	@Bean
	public Developpeur developpeur() {
		Developpeur developpeur = new Developpeur();
		developpeur.setNom("Boinahassani");
		developpeur.setNbAnneesExperience(1);
		return developpeur;
	}
	
	@Bean
	public Developpeur chefDeveloppeur() {
		Developpeur cheDeveloppeur = new Developpeur();
		cheDeveloppeur.setNom("Saïd");
		cheDeveloppeur.setNbAnneesExperience(10);
		return cheDeveloppeur;
	}
	
	@Bean
	public SocieteDevLogiciel societeDevLogiciel() {
		SocieteDevLogiciel societeDevLogiciel = new SocieteDevLogiciel();
		societeDevLogiciel.setDeveloppeur(developpeur());
		societeDevLogiciel.setChefDeveloppeur(chefDeveloppeur());
		return societeDevLogiciel;
	}

}
