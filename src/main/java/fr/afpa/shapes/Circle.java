package fr.afpa.shapes;

// implémenter la classe Circle
// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs

// CLASS Circle implémente INTERFACE Shape
public class Circle implements Shape{

    private double radius; 

    public Circle(double radius){
        this.radius = radius;
    }

    // GETTER & SETTER

    //RADIUS
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    

/*
        Rappel de calcul :
	 - périmètre du cercle = 2 * π * rayon
	 - aire_cercle = π * rayon^2

     La valeur π peut être retrouvée en Java en utilisant "Math.PI" 
	 La puissance de 2 peut être effectuée en utilisant la méthode static "pow" de la classe "Math" 
	 -> plus d'informations par ici https://codegym.cc/fr/groups/posts/fr.575.math-pi-en-java
 */

    @Override
    public double calculatePerimeter(){
        return (2 * this.radius) * Math.PI;     //Math.PI
    }

    @Override
    double calculateArea(){
        return Math.PI * Math.pow(this.radius,2);     //Math.pow
    }

}