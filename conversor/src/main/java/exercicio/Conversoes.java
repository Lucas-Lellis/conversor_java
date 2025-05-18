package exercicio;

public class Conversoes {

    static double kmForMilha(double km) {
        return km / 1.609;
    }

    static double milhaForKm(double milha) {
        return milha * 1.609;
    }

    static double cmforPes(double cm) {
        return cm / 30.48;
    }

    static double pesForCm(double pes) {
        return pes * 30.48;
    }

    static double cmForPolegada(double cm) {
        return cm / 2.54;
    }

    static double polegadaForCm(double polegada) {
        return polegada * 2.54;
    }
}