package org.example.miniwaze.model;

import jakarta.persistence.*;

@Entity
public class FeuTricolore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String phaseActuelle;
    private double tempsRestant;
    private String mode;

    @ManyToOne
    @JoinColumn(name = "intersection_id")
    private Intersection intersection;

    // getters & setters

    public String getPhaseActuelle() {
        return phaseActuelle;
    }

    public void setPhaseActuelle(String phaseActuelle) {
        this.phaseActuelle = phaseActuelle;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Intersection getIntersection() {
        return intersection;
    }

    public void setIntersection(Intersection intersection) {
        this.intersection = intersection;
    }

    public double getTempsRestant() {
        return tempsRestant;
    }

    public void setTempsRestant(double tempsRestant) {
        this.tempsRestant = tempsRestant;
    }
}
