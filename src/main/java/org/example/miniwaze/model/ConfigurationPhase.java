package org.example.miniwaze.model;
import jakarta.persistence.*;

@Entity
public class ConfigurationPhase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nomPhase;
    private int dureeVert;
    private int dureeJaune;
    private int dureeRouge;

    @ManyToOne
    @JoinColumn(name = "intersection_id")
    private Intersection intersection;

    public String getNomPhase() {
        return nomPhase;
    }

    public void setNomPhase(String nomPhase) {
        this.nomPhase = nomPhase;
    }

    public int getDureeVert() {
        return dureeVert;
    }

    public void setDureeVert(int dureeVert) {
        this.dureeVert = dureeVert;
    }

    public int getDureeJaune() {
        return dureeJaune;
    }

    public void setDureeJaune(int dureeJaune) {
        this.dureeJaune = dureeJaune;
    }

    public int getDureeRouge() {
        return dureeRouge;
    }

    public void setDureeRouge(int dureeRouge) {
        this.dureeRouge = dureeRouge;
    }

    public Intersection getIntersection() {
        return intersection;
    }

    public void setIntersection(Intersection intersection) {
        this.intersection = intersection;
    }
}
