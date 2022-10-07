package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.*;
import outils.ExerciceRunner;
import outils.Question;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="CalculMoyenne")
public class Ex08_CalculMoyenne {
	
	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */
	@Test
	@Question(numero=1)
	public void calculMoyenne() {
		
		//TODO Calculez et LOGUEZ la moyenne des valeurs du tableau (la moyenne doit être une valeur décimale).
		double moy = 0;
		double somme = 0;
		
		for(int i : array) {
			somme+= (double)i;
		}
		
		Resultat.log(somme/array.length);
	}
	
	@Test
	@Question(numero=2)
	public void calculMoyenneValeursPositives() {
		
		//TODO Calculez et LOGUEZ la moyenne des valeurs POSITIVES du tableau
		double somme = 0;
		int nbVal = 0;
		
		for(int i : array) {
			if(i>=0) {				
				somme += i;
				nbVal++;
				
			}
		}
		
		Resultat.log(somme/nbVal);
	}

}
