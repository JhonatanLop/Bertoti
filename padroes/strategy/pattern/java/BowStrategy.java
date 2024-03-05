public class BowStrategy implements Strategy{

    private Bow bow;

    public BowStrategy(Bow bow) {
        this.bow = bow;
    }

    public double action(){
        // sem munição
        if (getBow().getAmmo() == 0) {
            return 0.0;
        }
        // arma quebrada retorna 10% do dano
        if (getBow().getDurability() == 0) {
            return 0.1 * getBow().getDamage();
        }
        return getBow().getDamage();
    }

    public void repair(int parts){
        getBow().repair(parts);
    }

    public Bow getBow() { return bow; }
    public void setBow(Bow bow) { this.bow = bow; }
}