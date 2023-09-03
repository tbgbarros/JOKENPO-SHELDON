package domain;

public class Tesoura implements Algoritmo {

    @Override
    public void executar(TipoAlgoritmo tipo) {
        System.out.println("----------------------------------------- ");
        System.out.println("Tesoura");
        System.out.println("----------------------------------------- ");
        switch (tipo) {
            case PEDRA:
                System.out.println("----------------------------------------- ");
                System.out.println("Perdeu: Pedra quebra tesoura");
                System.out.println("----------------------------------------- ");
                break;
            case PAPEL:
                System.out.println("----------------------------------------- ");
                System.out.println("Ganhou: Tesoura corta papel");
                System.out.println("----------------------------------------- ");
                break;
            case LAGARTO:
                System.out.println("----------------------------------------- ");
                System.out.println("Perdeu: Largato derrete tesoura");
                System.out.println("----------------------------------------- ");
                break;
            case SPOCK:
                System.out.println("----------------------------------------- ");
                System.out.println("Perdeu: Spock vaporiza tesoura");
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
