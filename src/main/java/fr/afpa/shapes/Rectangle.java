package fr.afpa.shapes;

//implémenter la classe Rectangle
// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs

// CLASS Rectangle implémente INTERFACE Shape
public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

//GETTER & SETTER

//LENGTH
public double getLength() {
    return length;
}

public void setLength(double length) {
    this.length = length;
}

//WIDTH
public double getWidth() {
    return width;
}

public void setWidth(double width) {
    this.width = width;
}

    /*
        Rappel de calcul :
	 - perimetre_rectangle = 2 * longueur + 2 * largeur
	 - aire_rectangle = longueur * largeur 
     */

    @Override
    public double calculatePerimeter(){
        return this.width*2 + this.length*2;
    }

    @Override
    public double calculateArea(){
        return this.length * this.width;
    }

    @Override
    public String toString(){
        return "Rectangle: " + this.length + ", " + this.width + " "
        + "\n | - Perimeter : " + calculatePerimeter() + " "
        + "\n | - Area : " + calculateArea() + "." ;
    }

}