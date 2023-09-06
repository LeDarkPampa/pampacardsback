package com.pampacards.back.backend.enums;

public enum EnumDemandeStatus {
    DEMANDE_ENVOYEE("DEMANDE_ENVOYEE"),
    DEMANDE_RECUE("DEMANDE_RECUE"),
    DEMANDE_ACCEPTEE("DEMANDE_ACCEPTEE"),
    DEMANDE_REFUSEE("DEMANDE_REFUSEE"),
    DEMANDE_CLOSE("DEMANDE_CLOSE");

    private final String valeur;

    EnumDemandeStatus(String valeur) {
        this.valeur = valeur;
    }

    public String getValeur() {
        return this.valeur;
    }
}
