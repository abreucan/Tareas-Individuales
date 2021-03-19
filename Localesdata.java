package com.company;

public class Localesdata {

    //variables de la clase
    String locales, newLocales;

    // constructor
    // información de los terrenos
    Localesdata() {
        locales = "Los siguientes locales están disponibles:" +
                "\n\nOpción 1:\nFecha de construcción: 18 de febrero de 2017\nFecha de Inspección: 5 de abril de 2017\nÚltimo dueño: Robert Downey\nFecha de Adquisición: 20 de Octubre de 2019\nNúmero de lote: 51235\nNúmero de registro: REGT-00268" +
                "\n\nOpción 2:\nFecha de construcción: 3 de agosto de 2019\nFecha de Inspección: 14 de septiembre de 2019\nÚltimo dueño: Will Smith\nFecha de Adquisición: 20 de Octubre de 2019\nNúmero de lote: 51236\nNúmero de registro: REGT-00269";
    }
    //getter
    public String getLocales()
    {
        return locales;
    }

    //setter
    public String setLocales() {
        this.locales = newLocales;
        return newLocales;
    }

}
