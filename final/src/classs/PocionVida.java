package classs;

import enumm.ETipoDePocion;

public class PocionVida extends pociones {

    public PocionVida(ETipoDePocion TIPO) {
        super("Pocion de salud","una pocion creada para la recuperacion rapida de salud", TIPO);
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
