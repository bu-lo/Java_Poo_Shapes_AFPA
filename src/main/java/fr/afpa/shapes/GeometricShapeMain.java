package fr.afpa.shapes;
/*
	Objectif : développer des classes représentant des formes géométriques (Rectangle, Cercle et Triangle)
	Pour chacune de ces classes il faudra implémenter deux méthodes :
	 - une qui renverra le périmètre -> double calculatePerimeter()
	 - une qui renverra l'aire -> double calculateArea()

	Pour apprendre à IMPLEMENTER UNE INTERFACE: 
	vous pouvez vous référer au diaporama présenté en formation
	Vous pouvez également regarder la vidéo suivante : https://www.youtube.com/watch?v=OkEwPtRaqY4

	//implémentez une classe "Rectangle" comprenant les attributs présentés sur le diagramme UML contenu dans le sous-dossier "doc"
	
	Le diagramme UML est sous format "uxf". Pour pouvoir le lire il vous faudra le logiciel UMLET
	UMLET est disponible à l'adresse suivante : https://www.umlet.com/

	//implémentez une classe "Circle" comme présentée par le diagramme UML

	//créez une interface nommée "Shape" comprenant deux méthodes abstraites de calcul :
	 - double calculatePerimeter()
	 - double calculateArea()

	//faites en sorte que la classe "Rectangle" implémente l'interface "Shape" et implémentez les deux méthodes 
	Rappel de calcul :
	 - perimetre_rectangle = 2 * longueur + 2 * largeur
	 - aire_rectangle = longueur * largeur

	//faites en sorte que la classe "Circle" implémente l'interface "Shape" et implémentez les deux méthodes
	Rappel de calcul :
	 - périmètre du cercle = 2 * π * rayon
	 - aire_cercle = π * rayon^2

	 La valeur π peut être retrouvée en Java en utilisant "Math.PI" 
	 La puissance de 2 peut être effectuée en utilisant la méthode static "pow" de la classe "Math" 
	 -> plus d'informations par ici https://codegym.cc/fr/groups/posts/fr.575.math-pi-en-java
*/

import java.util.ArrayList;

class GeometricShapeMain
{
	public static void main(String[] args) 
	{
		// instancier plusieurs objets des classes Rectangle et Circle (2 instances de chaque)

		Shape rectangle1 = new Rectangle(3,4);
		Shape rectangle2 = new Rectangle(30,40);

		Shape circle1 = new Circle(5);
		Shape circle2 = new Circle(50);

		// TODO ajouter ces objets à une instance de la classe "ArrayList"
		// plus d'information sur la classe "ArrayList" -> https://info.clg.qc.ca/java/structures/array-list

		ArrayList<Integer> listShapes = new ArrayList<Integer>();
		listShapes.add(rectangle1);
		listShapes.add(rectangle2);
		listShapes.add(circle1);
		listShapes.add(circle2);

		System.out.println("La liste comprends " + listShapes.size() + " élements.");

		// TODO boucler sur les éléments de la liste afin d'afficher le périmètre et l'aire de chaque objet
		ListIterator<Integer> li = listShapes.listIterator<Integer>();
			while (li.hasNext())
				System.out.println(li.next());
		
	}

}
