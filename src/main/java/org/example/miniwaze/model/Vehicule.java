package org.example.miniwaze.model;


import jakarta.persistence.*;

@Entity
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean estVehiculeUrgence;
    private int positionDansTroncon;
    private double vitesse;
    private String destination;

    @ManyToOne
    @JoinColumn(name = "troncon_actuel_id")
    private TronconRoute tronconActuel;

    // getters & setters

    public boolean isEstVehiculeUrgence() {
        return estVehiculeUrgence;
    }

    public void setEstVehiculeUrgence(boolean estVehiculeUrgence) {
        this.estVehiculeUrgence = estVehiculeUrgence;
    }

    public int getPositionDansTroncon() {
        return positionDansTroncon;
    }

    public void setPositionDansTroncon(int positionDansTroncon) {
        this.positionDansTroncon = positionDansTroncon;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public TronconRoute getTronconActuel() {
        return tronconActuel;
    }

    public void setTronconActuel(TronconRoute tronconActuel) {
        this.tronconActuel = tronconActuel;
    }
}
