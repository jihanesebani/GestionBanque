package com.application.banque.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum Status {
    GESTIONNAIRE("gestionnaire"),
    GUICHETIER("guichetier"),
    DIRCTEUR_AGENCE("directeur de l'agence");
    private String role;
}
