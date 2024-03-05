public class SwordStrategy implements Strategy{

    private Sword sword;

    public SwordStrategy(Sword sword) {
        this.sword = sword;
    }

    public double action(){
        if (getSword().getDurability() == 0) {
            return 0.1 * getSword().getDamage();
        }
        return getSword().getDamage();
    }

    public void repair(int parts){
        getSword().repair(parts);
    }

    public Sword getSword() { return sword; }
    public void setSword(Sword sword) { this.sword = sword; }
}
