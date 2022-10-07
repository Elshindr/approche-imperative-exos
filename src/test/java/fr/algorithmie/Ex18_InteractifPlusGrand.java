package fr.algorithmie;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom = "InteractifPlusGrand")
public class Ex18_InteractifPlusGrand {

	/**
	 * Ne pas modifier les informations portées par l'annotation.
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		// TODO Demander à l'utilisateur de saisir 10 nombres entiers
		// TODO Affichez chaque nombre saisi avec Resultat.log
		// TODO Enfin affichez avec Resultat.log le max des 10 nombres

		Scanner scanner = new Scanner(System.in);
		int[] arrVal = new int[10];
		int max = 0;
		int i = 0;

		do {
			System.out.println("Veuillez saisir un nombre : ");
			arrVal[i] = scanner.nextInt();
			if(max<arrVal[i]) {
				max = arrVal[i];
			}
			i++;
		} while (i < 10);

		scanner.close();
		
		for(int j : arrVal) {
			Resultat.log(j);
		}
		Resultat.log(max);
	}

}
