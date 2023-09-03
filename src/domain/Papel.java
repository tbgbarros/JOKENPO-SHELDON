package domain;

public class Papel implements Algoritmo {

    @Override
    public void executar(TipoAlgoritmo tipo) {
        System.out.println("----------------------------------------- ");
        System.out.println("--- Papel ---");
        System.out.println("----------------------------------------- ");
        // TODO Auto-generated method stub
        switch (tipo) {
            case PEDRA:
                System.out.println("----------------------------------------- ");
                System.out.println("Ganhou: Papel embrlha pedra");
                System.out.println("----------------------------------------- ");
                break;
            case TESOURA:
                System.out.println("----------------------------------------- ");
                System.out.println("Perdeu: Tesoura corta papel");
                System.out.println("----------------------------------------- ");
                break;
            case LAGARTO:
                System.out.println("----------------------------------------- ");
                System.out.println("Perdeu: Lagato come papel");
                System.out.println("----------------------------------------- ");
                break;
            case SPOCK:
                System.out.println("----------------------------------------- ");
                System.out.println("Ganhou: Papel refuta spock");
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
