package cz.vaclavtolar.android_server.volebnizavod.dto;

import lombok.Getter;

@Getter
public enum Okres {

    BENESOV("CZ0201"),
    BEROUN("CZ0202"),
    KLADNO("CZ0203"),
    KOLIN("CZ0204"),
    KUTNA_HORA("CZ0205"),
    MELNIK("CZ0206"),
    MLADA_BOLESLAV("CZ0207"),
    NYMBURK("CZ0208"),
    PRAHA_VYCHOD("CZ0209"),
    PRAHA_ZAPAD("CZ020A"),
    PRIBRAM("CZ020B"),
    RAKOVNIK("CZ020C");

    private final String code;

    Okres(String code) {
        this.code = code;
    }
}
