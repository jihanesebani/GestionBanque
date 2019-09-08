package com.application.banque.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum Type {
    VIREMENT("virement"),
    RETRAIT("retrait");
    private String type_operation;
}
