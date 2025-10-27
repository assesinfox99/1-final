package classs;

import enumm.ETipoDePocion;

public abstract class pociones extends Objeto {
    ETipoDePocion TIPO;
    public pociones(String nombre, String descripcion,ETipoDePocion TIPO) {
        super(nombre, descripcion);
        this.TIPO = TIPO;
    }
    public ETipoDePocion getTIPO() {
        return TIPO;
    }

    public void setTIPO(ETipoDePocion TIPO) {
        this.TIPO = TIPO;
    }

    public abstract double usarPocion();
}
