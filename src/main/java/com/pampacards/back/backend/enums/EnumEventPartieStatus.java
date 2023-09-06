package com.pampacards.back.backend.enums;

public enum EnumEventPartieStatus {
    DEBUT_PARTIE("DEBUT_PARTIE"),
    NOUVEAU_TOUR("NOUVEAU_TOUR"),
    ABANDON("ABANDON"),
    TOUR_EN_COURS("TOUR_EN_COURS"),
    TOUR_TERMINE("TOUR_TERMINE"),
    FIN_PARTIE("FIN_PARTIE");

    private final String valeur;

    private EnumEventPartieStatus(String valeur) {
        this.valeur = valeur;
    }

    public String getValeur() {
        return this.valeur;
    }
}
