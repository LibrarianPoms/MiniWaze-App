package org.example.miniwaze.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class HistoriqueTrajet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime heureEntree;
    private LocalDateTime heureSortie;

    @ManyToOne
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;

    @ManyToOne
    @JoinColumn(name = "troncon_id")
    private TronconRoute troncon;

    // getters & setters

    public LocalDateTime getHeureEntree() {
        return heureEntree;
    }

    public void setHeureEntree(LocalDateTime heureEntree) {
        this.heureEntree = heureEntree;
    }

    public LocalDateTime getHeureSortie() {
        return heureSortie;
    }

    public void setHeureSortie(LocalDateTime heureSortie) {
        this.heureSortie = heureSortie;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public TronconRoute getTroncon() {
        return troncon;
    }

    public void setTroncon(TronconRoute troncon) {
        this.troncon = troncon;
    }
}
