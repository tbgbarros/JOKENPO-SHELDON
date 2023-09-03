package domain;

public class Pedra implements Algoritmo {

    @Override
    public void executar(TipoAlgoritmo tipo) {
        System.out.println("----------------------------------------- ");
        System.out.println("---- Pedra ----");
        System.out.println("----------------------------------------- ");
        // TODO Auto-generated method stub
        switch (tipo) {
            case TESOURA:
                System.out.println("----------------------------------------- ");
                System.out.println("Ganhou: Pedra quebra tesoura");
                System.out.println("----------------------------------------- ");
                break;
            case PAPEL:
                System.out.println("----------------------------------------- ");
                System.out.println("Perdeu: Papel embrulha preda");
                System.out.println("----------------------------------------- ");
                break;
            case LAGARTO:
                System.out.println("----------------------------------------- ");
                System.out.println("Perdeu: Largato derrete preda");
                System.out.println("----------------------------------------- ");
                break;
            case SPOCK:
                System.out.println("----------------------------------------- ");
                System.out.println("Papel refuta spock");
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
