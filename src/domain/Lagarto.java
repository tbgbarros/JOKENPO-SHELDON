package domain;

public class Lagarto implements Algoritmo {
    @Override
    public void executar(TipoAlgoritmo tipo) {
        System.out.println("----------------------------------------- ");
        System.out.println("--- Lagarto ---");
        System.out.println("----------------------------------------- ");
        switch (tipo) {
            case PEDRA:
                System.out.println("----------------------------------------- ");
                System.out.println("Perdeu: Pedra esmaga lagarto");
                System.out.println("----------------------------------------- ");
                break;
            case PAPEL:
                System.out.println("----------------------------------------- ");
                System.out.println("Ganhou: Lagarto derrete papel");
                System.out.println("----------------------------------------- ");
                break;
            case TESOURA:
                System.out.println("----------------------------------------- ");
                System.out.println("Perdeu: Tesoura decapita lagarto");
                System.out.println("----------------------------------------- ");
                break;
            case SPOCK:
                System.out.println("----------------------------------------- ");
                System.out.println("Ganhou: Lagarto envenena Spock");
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
