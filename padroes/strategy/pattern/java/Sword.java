public class Sword extends Weapon implements Strategy{
    private boolean isTwoHands;

    public Sword (
        String name,
        double damage,
        boolean isTwoHands,
        int durability
    ){
        this.name = name;
        this.damage = damage;
        this.isTwoHands= isTwoHands;
        this.durability = durability;
    }

    public double action(){
        if (getDurability() == 0) {
            return 0.1 * getDamage();
        }
        if (isTwoHands) {
            return (getDamage() + (getDamage() * 0.3));
        }
        return getDamage();
    }

    public double defeat(double damage){
        if (getDurability() == 0) {
            return (damage * 0.9);
        }
        return (damage - (damage * 0.8));
    }

    public boolean isTwoHands() { return isTwoHands; }
    public void setTwoHands(boolean isTwoHands) { this.isTwoHands = isTwoHands; }
}