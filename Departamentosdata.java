package com.company;

public class Departamentosdata {

    //variables de la clase
    String departamentos, newDepartamentos;

    // constructor
    // información de los terrenos
    Departamentosdata() {
        departamentos = "Los siguientes departamentos están disponibles:" +
                "\n\nOpción 1:\nUbicación: Coco Place, Coco del Mar, Panamá, Panamá\nHabitaciones: 2\nBaños: 2\nAmenidades:\n- Tanque de Agua\n- Planta Eléctrica\n- Gimnasio completo\n- Piscina\n- Sauna\n- Depósitos disponibles\n- Yoga & Zen Rooftop\nPrecio: $300,000.00 (no negociable,contáctanos para calcular la hipoteca)\nÚltimo dueño: Black Widow\nFecha de Adquisición: 9 de julio de 2020\nNúmero de lote: 51232\nNúmero de registro: REGT-00265"+
                "\n\nOpción 2:\nUbicación: Marey, Punta Pacífica, Panamá, Panamá\nHabitaciones: 2\nBaños: 3\nAmenidades:\n- Piscina\n- Seguridad 24/7\n- Gimansio\n- Valet Parking\n- Área de Juegos Infantiles\nPrecio: $315,000.00 (no negociable, contáctanos para calcular hipoteca)\nÚltimo dueño: Hannah Montana\nFecha de Adquisición: 7 de abril de 2021\nNúmero de lote: 51233\nNúmero de registro: REGT-00266" +
                "\n\nOpción 3:\nUbicación: Sea Point, Punta Paitilla, Panamá, Panamá\nHabitaciones: 3\nBaños: 3\nAmenidades:\n- Piscina\n- Jacuzzi\n- Facilidad para personas con discapacidades\n- Planta de emergencia\n- Valet Parking\n- Spa\nPrecio: $928,000.00 (contáctanos para negociaciones)\nÚltimo dueño: Margaret Carter\nFecha de Adquisición: 15 de mayo de 2020\nNúmero de lote: 51234\nNúmero de registro: REGT-00267";

    }
    //getter
    public String getDepartamentos()
    {
        return departamentos;
    }

    //setter
    public String setDepartamentos() {
        this.departamentos = newDepartamentos;
        return newDepartamentos;
    }

}
