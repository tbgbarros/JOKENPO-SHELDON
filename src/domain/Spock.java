package domain;

public class Spock implements Algoritmo {
    @Override
    public void executar(TipoAlgoritmo tipo) {
        System.out.println("----------------------------------------- ");
        System.out.println("--- Spock ---");
        System.out.println("----------------------------------------- ");
        switch (tipo) {
            case PEDRA:
                System.out.println("----------------------------------------- ");
                System.out.println("Ganhou: Spock pulveriza a pedra");
                System.out.println("----------------------------------------- ");
                break;
            case PAPEL:
                System.out.println("----------------------------------------- ");
                System.out.println("Papel: Papel refuta Spock");
                System.out.println("----------------------------------------- ");
                break;
            case LAGARTO:
                System.out.println("----------------------------------------- ");
                System.out.println("Perdeu: Lagarto envenena Spock");
                System.out.println("----------------------------------------- ");
                break;
            case TESOURA:
                System.out.println("----------------------------------------- ");
                System.out.println("Ganhou: Spock derrete Tesoura");
                System.out.println("----------------------------------------- ");
                break;
            default:
                System.out.println("----------------------------------------- ");
                System.out.println("Empatou!!!");
                System.out.println("----------------------------------------- ");
                break;
        }

    }

}
