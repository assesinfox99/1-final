package classs;

import Interfaces.niveles;

import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public abstract class Personajes implements niveles {

    private UUID id;
    private String nombre;
    private double HP;
    private double HPActual;
    private double ATK;
    private double DEF;
    private double VEL;

    public Personajes(String nombre, double HP, double ATK, double DEF, double VEL) {
        this.nombre = nombre;
        this.HP = HP;
        this.HPActual = HP;
        this.ATK = ATK;
        this.DEF = DEF;
        this.VEL = VEL;
        id = UUID.randomUUID();
    }

    public String getNombre() {
        return nombre;
    }

    public double getDEF() {
        return DEF;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public void setATK(double ATK) {
        this.ATK = ATK;
    }

    public void setDEF(double DEF) {
        this.DEF = DEF;
    }

    public void setVEL(double VEL) {
        this.VEL = VEL;
    }

    public double getHP() {
        return HP;
    }

    public double getHPActual() {
        return HPActual;
    }

    public void setHPActual(double HPActual) {
        this.HPActual = HPActual;
    }

    public double getATK() {
        return ATK;
    }

    public double getVEL() {
        return VEL;
    }
    private int probabilidad()
    {
        Random aliatorio = new Random();
        return aliatorio.nextInt(100)+1;
    }

    public void ataque(Personajes VELE)
    {
        double num = HPActual;
        if (VELE.getVEL() > VEL)
        {
            if (probabilidad()<=75){HPActual = HPActual - (VELE.getATK() - DEF * VELE.getATK()/100);}
        } else if (VELE.getVEL() == VEL)
        {
            if (probabilidad()<=50){HPActual = HPActual - (VELE.getATK() - DEF* VELE.getATK()/100);}
        }else if (VELE.getVEL() < VEL)
        {
            if (probabilidad()<=25){HPActual = HPActual - (VELE.getATK() - DEF* VELE.getATK()/100);}
        }
        if (num == HPActual){System.out.println(nombre +" esquivo");}
    }




    @Override
    public String toString() {
        return "nombre: " + nombre +
                 "\nHP "+ HPActual + "/" + HP +
                "   ATK " + ATK +
                "\nDEF " + DEF +
                "         VEL " + VEL;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personajes that)) return false;
        return Objects.equals(id, that.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public void NivelesPersonajes(){};
}
