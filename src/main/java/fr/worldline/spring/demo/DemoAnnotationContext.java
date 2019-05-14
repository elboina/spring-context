package fr.worldline.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Exemple de chargement d'un contexte spring par annotations
 * @author A701298
 *
 */
public class DemoAnnotationContext {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		Developpeur developpeur = (Developpeur) context.getBean("developpeur");
		
		developpeur.setNom("nomD�veloppeur");
		developpeur.setNbAnneesExperience(8);		
	
		SocieteDevLogiciel societe = (SocieteDevLogiciel) context.getBean("societeDevLogiciel");
		
		System.out.println("D�veloppeur soci�t� : " + societe.getDeveloppeur().getNom());
		System.out.println("Exp�rience d�veloppeur soci�t� : " + societe.getDeveloppeur().getNbAnneesExperience());
		
		context.close();
		

	}

}
