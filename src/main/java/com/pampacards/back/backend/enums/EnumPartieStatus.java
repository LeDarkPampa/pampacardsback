package com.pampacards.back.backend.enums;

public enum EnumPartieStatus {
    PARTIE_EN_COURS("PARTIE_EN_COURS"),
    PARTIE_TERMINEE("PARTIE_TERMINEE"),
    PARTIE_ABANDONNEE("PARTIE_TERMINEE");

    private final String valeur;

    private EnumPartieStatus(String valeur) {
        this.valeur = valeur;
    }

    public String getValeur() {
        return this.valeur;
    }
}
