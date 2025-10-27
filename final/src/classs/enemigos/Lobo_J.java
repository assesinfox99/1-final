package classs.enemigos;

import classs.Enemigos;
import classs.Objeto;
import classs.PocionVida;
import enumm.ETipoDePocion;

import java.util.Random;

public class Lobo_J extends Enemigos {

    public Lobo_J() {
        super("Lobo Gris Alfa", 60, 25, 15, 50);
    }

    @Override
    public Objeto Drop() {
        Random rand = new Random();
        int tipo = rand.nextInt(100) + 1;
               if (tipo <= 40 ){return new PocionVida(ETipoDePocion.chica);}
               else if (tipo <= 70) {return new PocionVida(ETipoDePocion.mediana);}
               else if (tipo <= 95) {return new PocionVida(ETipoDePocion.grande);}
               else {return new PocionVida(ETipoDePocion.elixir);}
    }
}
