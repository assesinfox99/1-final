package classs;

public class Enemigos extends Personajes{

    public Enemigos(String nombre, double HP, double ATK, double DEF, double VEL) {
        super(nombre, HP, ATK, DEF, VEL);
    }
    public void NivelesPersonajes(int nivel) {

        if (nivel % 10 == 0)
        {
            setHP(getHP()+15);
            setHPActual(getHPActual()+15);
            setATK(getATK()+4);
            setDEF(getDEF()+3);
            setVEL(getVEL()+2);
        }else{
        setHP(getHP()+12);
        setHPActual(getHPActual()+12);
        setATK(getATK()+2);
        setDEF(getDEF()+2);
        setVEL(getVEL()+2);}
    }
}
