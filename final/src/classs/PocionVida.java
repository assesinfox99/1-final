package classs;

import enumm.ETipoDePocion;

public class PocionVida extends pociones {

    private static int IDpocion = 25;
    public PocionVida(ETipoDePocion TIPO) {
        super("Pocion de salud " + TIPO.getNombre() ,"una pocion creada para la recuperacion rapida de salud", TIPO);
    }

    public static int getIDpocion() {
        return IDpocion;
    }

    public static void setIDpocion(int IDpocion) {
        PocionVida.IDpocion = IDpocion;
    }

    @Override
    public double usarPocion() {

        if (this.getTIPO().equals(ETipoDePocion.grande)){return 150;}
        else if (this.getTIPO().equals(ETipoDePocion.mediana)){return 100;}
        else if (this.getTIPO().equals(ETipoDePocion.chica)){return 50;}
        else if (this.getTIPO().equals(ETipoDePocion.elixir)){return 9999999;}
        return 0;
    }
}
