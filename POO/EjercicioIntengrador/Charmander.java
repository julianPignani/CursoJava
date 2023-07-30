package EjercicioIntengrador;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("soy Charmander y estoy atacando con ataque placaje!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("soy Charmander y estoy atacando con ataque araniazo!!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("soy Charmander y estoy atacando con ataque mordisco!!");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("soy Charmander y estoy atacando con ataque punio de fuego!!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("soy Charmander y estoy atacando con ataque ascuas!!");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("soy Charmander y estoy atacando con ataque lanzallamas!!");
    }
}
