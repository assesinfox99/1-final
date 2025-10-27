import classs.*;
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
        Inventario in = A.getInventario();
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
                System.out.println("2. inventario");
                opcion = leer.nextInt();
                leer.nextLine();
                switch (opcion)
                {
                    case 1:
                        A.ataque(B);
                        break;
                    case 2:
                        in.mostrar();
                        int op;
                        System.out.println("\n");
                        System.out.println("1.Pocion Chica");
                        System.out.println("2.Pocion Mediana");
                        System.out.println("3.Pocion Grande");
                        System.out.println("4.Elixir");
                        System.out.println("0.salir");
                        op = leer.nextInt();
                        leer.nextLine();
                        if (op == 1){
                            PocionVida pocionAux = new PocionVida(ETipoDePocion.chica);
                            A.usarobjeto(pocionAux);
                        } else if (op == 2) {
                            PocionVida pocionAux = new PocionVida(ETipoDePocion.mediana);
                            A.usarobjeto(pocionAux);
                        }else if (op == 3){
                            PocionVida pocionAux = new PocionVida(ETipoDePocion.grande);
                            A.usarobjeto(pocionAux);
                        }else if (op == 4){
                            PocionVida pocionAux = new PocionVida(ETipoDePocion.elixir);
                            A.usarobjeto(pocionAux);
                        }else if (op == 0){A.ataque(B);}
                        break;
                    default:
                        break;
                }
                if (B.getHPActual()>0){
                    System.out.println(B.toString());
                    B.ataque(A);}
                else {System.out.println("el enemigo fue derrotado");}
            }while (B.getHPActual()>0 && A.getHPActual()>0);
            A.NivelesPersonajes();
            in.agregar(B.Drop());
            nivel++;
        }while (A.getHPActual()>0);
        System.out.println("GAME OVER :c");
        }
    }