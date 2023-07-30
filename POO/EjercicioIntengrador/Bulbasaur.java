package EjercicioIntengrador;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    @Override
    public void atacarParalizar() {
        System.out.println("soy Bulbasaur   y estoy atacando con ataque paralizador!!");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("soy Bulbasaur y estoy atacando con ataque drenaje!!");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("soy Bulbasaur y estoy atacando con ataque hojas afiladas!!");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("soy Bulbasaur y estoy atacando con ataque latigoo!!");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("soy Bulbasaur y estoy atacando con ataque placaje!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("soy Bulbasaur y estoy atacando con ataque araniazo!!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("soy Bulbasaur y estoy atacando con ataque Mordisco!!");
    }
}