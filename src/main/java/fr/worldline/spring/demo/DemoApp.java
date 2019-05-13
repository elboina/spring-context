package fr.worldline.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Exemple de chargement de configuration spring java
 * @author A701298
 *
 */
public class DemoApp {

	public static void main(String[] args) {	
		
		
		AbstractApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		
		Developpeur developpeur = (Developpeur) context.getBean("developpeur");
		System.out.println("Developpeur name : " + developpeur.getNom());
		System.out.println("Developpeur years of experience number " + developpeur.getNbAnneesExperience());
		
		SocieteDevLogiciel societeDeveloppeur = (SocieteDevLogiciel) context.getBean("societeDevLogiciel");
		System.out.println("SocieteDeveloppeur developpeur : " + societeDeveloppeur.getDeveloppeur().getNom());
		System.out.println("SocieteDeveloppeur chef developeur : " + societeDeveloppeur.getChefDeveloppeur().getNom());
		
		context.close();
		

	}

}
