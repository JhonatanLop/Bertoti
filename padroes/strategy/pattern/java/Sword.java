

public class Sword implements Weapon{
    private String name;
    private boolean isTwoHands;
    private int durability;
    private double damage;

    public Sword(String name, boolean isTwoHands, int durability, double damage) {
        this.name = name;
        this.isTwoHands = isTwoHands;
        this.durability = durability;
        this.damage = damage;
    }

    public double use(){
        if (getDurability() == 0) {
            return 0.1 * getDamage();
        }
        if (isTwoHands()) {
            return getDamage()*2;
        }
        return getDamage();
    }

    public void repair(int parts) {
        setDurability(getDurability() + parts);
    }

    public String getName() { return name;}
    public boolean isTwoHands() { return isTwoHands;}
    public int getDurability() { return durability;}
    public double getDamage() { return damage;}
    public void setName(String name) { this.name = name;}
    public void setTwoHands(boolean isTwoHands) { this.isTwoHands = isTwoHands;}
    public void setDurability(int durability) { this.durability = durability;}
    public void setDamage(double damage) { this.damage = damage;}
}