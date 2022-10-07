package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;
import outils.*;
import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InversionContenu")
public class Ex05_InversionContenu {

	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	@Test
	@Question(numero=1)
	public void affichageTableauArrayCopy() {
		
		// TODO Créer un tableau nommé arrayCopy et qui contient les mêmes nombres
		// que dans le tableau array mais dans l'ordre inverse.
		int[] arrayCopy = new int[array.length];
		System.out.println("copier");
		for(int i = array.length-1; i>=0; i--) {
			int j = array.length-i-1;
			arrayCopy[j] = array[i];
		}
		
		// TODO LOGUER le contenu de ce tableau arrayCopy
		System.out.println("coller");
		for(int i : arrayCopy) {
			Resultat.log(i);
		}
	}
}
