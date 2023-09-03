package domain;

public enum TipoAlgoritmo {
    PAPEL(1), TESOURA(2), PEDRA(3), LAGARTO(4), SPOCK(5);

    private int id;

    TipoAlgoritmo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static TipoAlgoritmo getTipo(int pId) {
        for (TipoAlgoritmo t : TipoAlgoritmo.values()) {
            if (t.getId() == pId)
                return t;

        }
        throw new RuntimeException("Tipo não encontrado");
    }

}
