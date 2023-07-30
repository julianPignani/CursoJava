package EjercicioIntengrador;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("soy Pikachu y estoy atacando con ataque placaje!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("soy Pikachu y estoy atacando con ataque araniazo!!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("soy Pikachu y estoy atacando con ataque mordisco!!");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("soy Pikachu y estoy atacando con ataque impacTrueno!!");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("soy Pikachu y estoy atacando con ataque punio de trueno!!");
    }

    @Override
    public void atacarIRayo() {
        System.out.println("soy Pikachu y estoy atacando con ataque de rayos!!");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("soy Pikachu y estoy atacando con ataque rayos cargados!!");
    }
}
