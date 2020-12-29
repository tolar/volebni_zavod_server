package cz.vaclavtolar.android_server.volebnizavod.dto;

import lombok.Getter;

@Getter
public enum Okres {

    // Hl.mesto Praha
    PRAHA("CZ0100"),

    // Stredocesky kraj
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
    RAKOVNIK("CZ020C"),

    // Jihocesky kraj
    CESKE_BUDEJOVICE("CZ0311"),
    CESKY_KRUMLOV("CZ0312"),
    JINDRICHUV_HRADEC("CZ0313"),
    PISEK("CZ0314"),
    PRACHATICE("CZ0315"),
    STRAKONICE("CZ0316"),
    TABOR("CZ0317"),

    // Plzensky kraj
    DOMAZLICE("CZ0321"),
    KLATOVY("CZ0322"),
    PLZEN_MESTO("CZ0323"),
    PLZEN_JIH("CZ0324"),
    PLZEN_SEVER("CZ0325"),
    ROKYCANY("CZ0326"),
    TACHOV("CZ0327"),

    // Karlovarsky kraj
    CHEB("CZ0411"),
    KARLOVY_VARY("CZ0412"),
    SOKOLOV("CZ0413"),

    // Ustecky kraj
    DECIN("CZ0421"),
    CHOMUTOV("CZ0422"),
    LITOMERICE("CZ0423"),
    LOUNY("CZ0424"),
    MOST("CZ0425"),
    TEPLICE("CZ0426"),
    USTI_NAD_LABEM("CZ0427"),

    // Liberecky kraj
    CESKA_LIPA("CZ0511"),
    JABLONEC_NAD_NISOU("CZ0512"),
    LIBEREC("CZ0513"),
    SEMILY("CZ0514"),

    // Kralovehradecky kraj
    HRADEC_KRALOVE("CZ0521"),
    JICIN("CZ0522"),
    NACHOD("CZ0523"),
    RYCHNOV_NAD_KNEZNOU("CZ0524"),
    TRUTNOV("CZ0525"),

    // Pardubicky kraj
    CHRUDIM("CZ0531"),
    PARDUBICE("CZ0532"),
    SVITAVY("CZ0533"),
    USTI_NAD_ORLICI("CZ0534"),

    // Vysocina
    HAVLICKUV_BROD("CZ0631", "CZ0611"),
    JIHLAVA("CZ0632", "CZ0612"),
    PELHRIMOV("CZ0633", "CZ0613"),
    TREBIC("CZ0634", "CZ0614"),
    ZDAR_NAD_SAZAVOU("CZ0635", "CZ0615"),

    // Jihomoravsky kraj
    BLANSKO("CZ0641", "CZ0621"),
    BRNO_MESTO("CZ0642", "CZ0622"),
    BRNO_VENKOV("CZ0643", "CZ0623"),
    BRECLAV("CZ0644", "CZ0624"),
    HODONIN("CZ0645", "CZ0625"),
    VYSKOV("CZ0646", "CZ0626"),
    ZNOJMO("CZ0647", "CZ0627"),

    // Olomoucky kraj
    JESENIK("CZ0711"),
    OLOMOUC("CZ0712"),
    PROSTEJOV("CZ0713"),
    PREROV("CZ0714"),
    SUMPERK("CZ0715"),

    // Zlinsky kraj
    KROMERIZ("CZ0721"),
    UHERSKE_HRADISTE("CZ0722"),
    VSETIN("CZ0723"),
    ZLIN("CZ0724"),

    // Moravskoslezky kraj
    BRUNTAL("CZ0801"),
    FRYDEK_MISTEK("CZ0802"),
    KARVINA("CZ0803"),
    NOVY_JICIN("CZ0804"),
    OPAVA("CZ0805"),
    OSTRAVA_MESTO("CZ0806");

    private final String code;
    private final String code2006;

    Okres(String code) {
        this.code = code;
        this.code2006 = code;
    }

    Okres(String code, String code2006) {
        this.code = code;
        this.code2006 = code2006;
    }
}
