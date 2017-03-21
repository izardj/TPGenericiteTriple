package presentation;

import metier.ClasseGenerique;
/**
 * Classe Lanceur
 * @author Stagiaire
 *
 */
public class Lanceur {
	/**
	 * Methode permetant de lancer le programme
	 * @param args arguments
	 */
	public static void main(String[] args) {
		
		ClasseGenerique<String, Double, Float> objet = new ClasseGenerique<String, Double, Float>("aaa", 12515754575536687454.25, 1.3f);
		ClasseGenerique<Float, String, Float> objet2 = new ClasseGenerique<Float, String, Float>(1.5f, "bbb", 9.4f);
		ClasseGenerique<String, String, Integer> objet3 = new ClasseGenerique<String, String, Integer>("ccc", "ddd", 36);
		
		System.out.println(objet);
		System.out.println("-----------------------------------------------------------");
		System.out.println(objet2);
		System.out.println("-----------------------------------------------------------");
		System.out.println(objet3);	
	}

}
