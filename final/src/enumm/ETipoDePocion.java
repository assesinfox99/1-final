package enumm;

public enum ETipoDePocion {
    elixir("elexir"),
    grande("Grande"),
    mediana("mediana"),
    chica("chica");

    String nombre;

    ETipoDePocion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

