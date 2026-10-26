package org.example.miniwaze.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime debutIncident;
    private LocalDateTime finIncident;
    private String type;
    private boolean resolu;

    @ManyToOne
    @JoinColumn(name = "troncon_route_id")
    private TronconRoute tronconRoute;

    // getters & setters

    public LocalDateTime getDebutIncident() {
        return debutIncident;
    }

    public void setDebutIncident(LocalDateTime debutIncident) {
        this.debutIncident = debutIncident;
    }

    public LocalDateTime getFinIncident() {
        return finIncident;
    }

    public void setFinIncident(LocalDateTime finIncident) {
        this.finIncident = finIncident;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isResolu() {
        return resolu;
    }

    public void setResolu(boolean resolu) {
        this.resolu = resolu;
    }

    public TronconRoute getTronconRoute() {
        return tronconRoute;
    }

    public void setTronconRoute(TronconRoute tronconRoute) {
        this.tronconRoute = tronconRoute;
    }
}