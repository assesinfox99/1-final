package classs.enemigos;

import classs.Enemigos;
import classs.Objeto;
import classs.PocionVida;
import enumm.ETipoDePocion;

import java.util.Random;

public class Esqueleto extends Enemigos {

    public Esqueleto() {
        super("Esqueleto", 75, 12, 5, 11);
    }


    @Override
    public Objeto Drop() {
        Random rand = new Random();
        int tipo = rand.nextInt(100) + 1;
        if (tipo <= 60){return new PocionVida(ETipoDePocion.chica);}
        else if (tipo <= 80) {return new PocionVida(ETipoDePocion.mediana);}
        else {return new PocionVida(ETipoDePocion.grande);}
    }
}
