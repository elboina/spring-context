package fr.worldline.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Exemple de chargement de contexte spring xml
 * @author A701298
 *
 */
public class DemoXmlSpringContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = (ApplicationContext) new ClassPathXmlApplicationContext("context-beans.xml");
		
		Developpeur developpeur = (Developpeur) context.getBean("developpeur");
		System.out.println("Developpeur name : " + developpeur.getNom());
		System.out.println("Developpeur years of experience number " + developpeur.getNbAnneesExperience());
		
		SocieteDevLogiciel societeDeveloppeur = (SocieteDevLogiciel) context.getBean("societeDeveloppeur");
		System.out.println("SocieteDeveloppeur developpeur : " + societeDeveloppeur.getDeveloppeur().getNom());
		System.out.println("SocieteDeveloppeur chef developeur : " + societeDeveloppeur.getChefDeveloppeur().getNom());

	}

}
