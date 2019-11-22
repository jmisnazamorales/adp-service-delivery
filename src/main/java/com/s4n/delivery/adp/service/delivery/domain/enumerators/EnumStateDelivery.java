package com.s4n.delivery.adp.service.delivery.domain.enumerators;

import lombok.Getter;

@Getter
public enum EnumStateDelivery {

    A("A", "Active"),
    C("C", "On road"),
    F("F", "Finally");

    private String nameState;

    private String descState;

    EnumStateDelivery(String nameState, String descState){
        this.nameState = nameState;
        this.descState = descState;
    }
}
