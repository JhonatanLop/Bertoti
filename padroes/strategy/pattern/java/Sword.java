public class Sword extends Weapon{
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

    public boolean isTwoHands() { return isTwoHands; }
    public void setTwoHands(boolean isTwoHands) { this.isTwoHands = isTwoHands; }
}