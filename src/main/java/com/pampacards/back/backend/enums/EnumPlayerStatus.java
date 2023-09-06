package com.pampacards.back.backend.enums;

public enum EnumPlayerStatus {
    SEARCH("SEARCH"), ONLINE("ONLINE"), OFFLINE("OFFLINE");

    private final String valeur;

    private EnumPlayerStatus(String valeur) {
        this.valeur = valeur;
    }

    public String getValeur() {
        return this.valeur;
    }
}
