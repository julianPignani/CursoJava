package EjercicioIntengrador;

public class Squitle extends Pokemon implements IAgua{

    public Squitle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("soy Squitle y estoy atacando con ataque placaje!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("soy Squitle y estoy atacando con ataque araniazo!!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("soy Squitle y estoy atacando con ataque mordisco!!");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("soy Squitle y estoy atacando con ataque hidrobomba!!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("soy Squitle y estoy atacando con ataque pistola de agua!!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("soy Squitle y estoy atacando con ataque burbujas!!");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("soy Squitle y estoy atacando con ataque Hidropulso!!");
    }
}
