import classs.EnemgoRand;
import classs.Enemigos;
import classs.Jugador;
import classs.PocionVida;
import classs.enemigos.Lobo;
import enumm.ETipoDePocion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nivel = 1;
        Scanner leer = new Scanner(System.in);
        System.out.println("elija un nombre");
        String nombre = leer.nextLine();
        Jugador A = new Jugador(nombre);
        PocionVida vida = new PocionVida(ETipoDePocion.chica);
        do {
            System.out.println("NIVEL "+ nivel);
            int opcion;
            Enemigos B = EnemgoRand.generarEnemigo(nivel);
            System.out.println("aparece un "+B.getNombre());
            for (int i = 2; i<=nivel; i++){B.NivelesPersonajes(i);}
            do {
                System.out.println(A.toString());
                System.out.println("que quieres hacer?");
                System.out.println("1. Atacar");
                System.out.println("2. tomar pocion");
                opcion = leer.nextInt();
                leer.nextLine();
                switch (opcion)
                {
                    case 1:
                        B.ataque(A);
                        break;
                    case 2:
                        A.usarobjeto(vida);
                        break;
                    default:
                        System.out.println("no hisiste nada");
                        break;
                }
                if (B.getHPActual()>0){
                    System.out.println(B.toString());
                    A.ataque(B);}
                else {System.out.println("el enemigo fue derrotado");}
            }while (B.getHPActual()>0 && A.getHPActual()>0);
            A.NivelesPersonajes();
            nivel++;
        }while (A.getHPActual()>0);
        System.out.println("fuiste derrotado");
        }
    }