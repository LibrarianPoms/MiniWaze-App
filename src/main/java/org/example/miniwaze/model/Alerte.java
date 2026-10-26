package org.example.miniwaze.model;


import jakarta.persistence.*;
@Entity
public class Alerte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;
    private String message;

    @ManyToOne
    @JoinColumn(name = "troncon_route_id")
    private TronconRoute tronconRoute;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TronconRoute getTronconRoute() {
        return tronconRoute;
    }

    public void setTronconRoute(TronconRoute tronconRoute) {
        this.tronconRoute = tronconRoute;
    }
}
