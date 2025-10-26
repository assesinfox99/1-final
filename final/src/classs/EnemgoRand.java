package classs;

import classs.enemigos.Esqueleto;
import classs.enemigos.Lobo;
import classs.enemigos.Lobo_J;

import java.util.Random;

public class EnemgoRand {

    public static Enemigos generarEnemigo(int nivel) {
        if (nivel % 10 == 0) {
            return new Lobo_J();
        } else {
            Random rand = new Random();
            int tipo = rand.nextInt(2) + 1;
            switch (tipo) {
                case 1: return new Lobo();
                case 2: return new Esqueleto();
                default: return new Lobo();
            }
        }
    }
}
