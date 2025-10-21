package classs;

import Interfaces.IusarObjeto;

import java.util.ArrayList;
import java.util.List;

public class Jugador extends Personajes implements IusarObjeto {

    private List<objeto> inventario;
    public Jugador(String nombre) {
        super(nombre,10000,200,10,10);
        this.inventario = new ArrayList<>();
    }
    public boolean agregar(objeto objeto)
    {
        return inventario.add(objeto);
    }
    public boolean eliminar(objeto objeto)
    {
        return inventario.remove(objeto);
    }



    @Override
    public void usarobjeto(objeto objeto) {

        if (objeto instanceof pociones)
        {
            double num = ((pociones) objeto).usarPocion() + getHPActual();
            if (num > getHP())
            {setHPActual(getHP());}
            else {setHPActual(num);}
        }

    }

    @Override
    public void NivelesPersonajes() {

        setHP(getHP()+10);
        setHPActual(getHPActual()+10);
        setATK(getATK()+1);
        setDEF(getDEF()+1);
        setVEL(getVEL()+1);
    }
}
