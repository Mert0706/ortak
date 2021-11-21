package com.bilgeadam.ortak;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ortak {

    private static Locale localeTr = new Locale("tr", "TR");

    public static String buyukHarfeCevir(String p_kelime){

        return p_kelime.toUpperCase(localeTr);
    }

    public static String kucukHarfeCevir(String p_kelime){

        return p_kelime.toLowerCase(localeTr);
    }

    public static String tarihToStr(Date p_tarih) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(p_tarih);
    }

    public static Date stringToTarih(String p_tarih) throws ParseException{

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(p_tarih);
    }


}
