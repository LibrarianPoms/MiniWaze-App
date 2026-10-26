package org.example.miniwaze.model;

import jakarta.persistence.*;

@Entity
public class TronconRoute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private double longueurMetres;
    private int nombreVoies;
    private int limiteVitesse;
    private boolean estBloque;

    @ManyToOne
    @JoinColumn(name = "intersection_depart_id")
    private Intersection intersectionDepart;

    @ManyToOne
    @JoinColumn(name = "intersection_arrivee_id")
    private Intersection intersectionArrivee;

    // getters & setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLongueurMetres() {
        return longueurMetres;
    }

    public void setLongueurMetres(double longueurMetres) {
        this.longueurMetres = longueurMetres;
    }

    public int getNombreVoies() {
        return nombreVoies;
    }

    public void setNombreVoies(int nombreVoies) {
        this.nombreVoies = nombreVoies;
    }

    public int getLimiteVitesse() {
        return limiteVitesse;
    }

    public void setLimiteVitesse(int limiteVitesse) {
        this.limiteVitesse = limiteVitesse;
    }

    public boolean isEstBloque() {
        return estBloque;
    }

    public void setEstBloque(boolean estBloque) {
        this.estBloque = estBloque;
    }

    public Intersection getIntersectionDepart() {
        return intersectionDepart;
    }

    public void setIntersectionDepart(Intersection intersectionDepart) {
        this.intersectionDepart = intersectionDepart;
    }

    public Intersection getIntersectionArrivee() {
        return intersectionArrivee;
    }

    public void setIntersectionArrivee(Intersection intersectionArrivee) {
        this.intersectionArrivee = intersectionArrivee;
    }
}
