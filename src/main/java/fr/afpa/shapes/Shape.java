package fr.afpa.shapes;

// Interface "Shape"
// pour apprendre à déclarer une interface -> https://gayerie.dev/epsi-b3-java/langage_java/interface.html

// INTERFACE = classe 100% abstraite
// = CONTRAT = ensemble de méthodes obligatoires
// Toute classe qui implémente cette interface devra respecter ce contrat
// Q:-> Classe abstraite ou interface ?

public interface Shape { // que des méthodes abstraites au niv d'une interface
    public abstract double calculatePerimeter(); //ok retirer "public abstract" idem
    public abstract double calculateArea();
}