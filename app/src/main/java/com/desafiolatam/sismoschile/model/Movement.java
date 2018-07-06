package com.desafiolatam.sismoschile.model;

public class Movement {

    private EarthMovement[] sismos;

    public Movement() {
    }

    public EarthMovement[] getSismos() {
        return sismos;
    }

    public void setSismos(EarthMovement[] sismos) {
        this.sismos = sismos;
    }
}
