package exercicio;

import java.util.Scanner;

public class Programa {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        double valor;

        do {
            System.out.println("""
                    --------------------------------------------------
                    1. KM para MILHAS
                    2. MILHAS para KM
                    3. CM para PÉS
                    4. PÉS para CM
                    5. CM para POLEGADAS
                    6. POLEGADAS para CM
                    7. SAIR""");
            System.out.print("Opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println();
                    System.out.print("KM: ");
                    valor = scan.nextDouble();
                    System.out.println(Conversoes.kmForMilha(valor) + " milhas");
                }
                case 2 -> {
                    System.out.println();
                    System.out.print("MILHAS: ");
                    valor = scan.nextDouble();
                    System.out.println(Conversoes.milhaForKm(valor) + " km");
                }
                case 3 -> {
                    System.out.println();
                    System.out.print("CM: ");
                    valor = scan.nextDouble();
                    System.out.println(Conversoes.cmforPes(valor) + " pés");
                }
                case 4 -> {
                    System.out.println();
                    System.out.print("PÉS: ");
                    valor = scan.nextDouble();
                    System.out.println(Conversoes.pesForCm(valor) + " cm");
                }
                case 5 -> {
                    System.out.println();
                    System.out.print("CM: ");
                    valor = scan.nextDouble();
                    System.out.println(Conversoes.cmForPolegada(valor) + " polegadas");
                }
                case 6 -> {
                    System.out.println();
                    System.out.print("POLEGADAS: ");
                    valor = scan.nextDouble();
                    System.out.println(Conversoes.polegadaForCm(valor) + " cm");
                }
                case 7 -> System.out.println("Finalizando programa...");
            }
        } while (opcao != 7);
    }
}
