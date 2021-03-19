package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //variables
        int actiontaken, propertychoice, categorychosen;
        String newTerrenos, newLocales, newDepartamentos;
        System.out.println("*******************************************\n* Bienvenido a la Inmobiliaria HomeFinder *\n*******************************************");

        System.out.println("\nPor favor elija una opción: " +
            "\n[1] Conócenos" +
            "\n[2] Ver propiedades disponibles" +
            "\n[3] Contáctanos" +
            "\n[4] Acceso para el personal (registro de viviendas)");
	    Scanner choice = new Scanner(System.in);
	    actiontaken = choice.nextByte();

        switch(actiontaken){
            case 1 -> {
                // breve reseña de la compañía
                System.out.println("Acerca de Inmobiliaria HomeFinder: " +
                        "\nA diferencia del modelo de bienes raíces tradicional, la estructura única de HomeFinder permite al corredor mayor libertad y más éxito en la gestión de su propio negocio." +
                        "\nLlevamos en el mercado al rdedor de 10 años, en donde hemos podido construir una reputación de credibilidad, confianza y proceso rápido en la compra de sus propiedades");
            }
            case 2 -> {
                //se muestran las propiedades con los datos de las clases
                System.out.println("Elige la categoría que te interesa: " +
                        "\n\n[1] Locales Comerciales   | 2 disponibles" +
                        "\n[2] Departamentos         | 3 disponibles" +
                        "\n[3] Terrenos              | 5 disponibles");
                Scanner property = new Scanner(System.in);
                propertychoice = property.nextByte();


                switch(propertychoice){
                    case 1 -> {
                        Localesdata infolocales = new Localesdata();
                        System.out.println(infolocales.getLocales());
                    }
                    case 2 -> {
                        Departamentosdata infodept = new Departamentosdata();
                        System.out.println(infodept.getDepartamentos());
                    }
                    case 3 -> {
                        Terrenosdata infoterrenos = new Terrenosdata();
                        System.out.println(infoterrenos.getTerrenos());
                    }

                }

            }
            case 3 -> {
                // Se muestra el contacto de la empresa
                System.out.println("Para contactarnos te brindamos la siguiente información:" +
                        "\n\nTeléfono: +507 235-8456" +
                        "\nCelular: +507 4859-8956" +
                        "\nCorreo: asistencia@homefinder.pa" +
                        "\nInstagram: @homefinder.pa" +
                        "\n\n¡Gracias por tu confianza!");
            }
            case 4 -> {
                //cambio de información de viviendas
                System.out.println("Categoría que desea actualizar");
                System.out.println("\n\n[1] Locales Comerciales" +
                        "\n[2] Departamentos" +
                        "\n[3] Terrenos");
                Scanner catchange = new Scanner(System.in);
                categorychosen = catchange.nextByte();
                switch(categorychosen){
                    case 1 ->{
                        Scanner newdatalocales = new Scanner(System.in);
                        Localesdata newinfo = new Localesdata();
                               newinfo.newLocales = newdatalocales.nextLine();
                    }
                    case 2 ->{
                        Scanner newdatadept = new Scanner(System.in);
                        Departamentosdata newinfo = new Departamentosdata();
                        newinfo.newDepartamentos = newdatadept.nextLine();
                    }
                    case 3 ->{
                        Scanner newdataterreno = new Scanner(System.in);
                        Terrenosdata newinfo = new Terrenosdata();
                        newinfo.newTerrenos = newdataterreno.nextLine();
                    }
                }
            }
        }
    }
}
