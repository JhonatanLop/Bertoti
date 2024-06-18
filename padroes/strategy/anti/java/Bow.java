
public class Bow extends Weapon {
    private double damage;
    private int ammo;


    public Bow(String name, double damage, int durability, int ammo) {
        this.name = name;
        this.damage = damage;
        this.durability = durability;
        this.ammo = ammo;
    }

    public double use() {
        if (getAmmo() == 0) {
            return 0;
        }
        if (getDurability() == 0) {
            return 0.1 * getDamage();
        }
        return getDamage();
    }

    public void repair(int parts){
        setDurability(parts + getDurability());
    }

    public String getName() { return name; }
    public double getDamage() { return damage; }
    public int getDurability() { return durability; }
    public int getAmmo() { return ammo; }
    public void setName(String name) { this.name = name; }
    public void setDamage(double damage) { this.damage = damage; }
    public void setDurability(int durability) { this.durability = durability; }
    public void setAmmo(int ammo) { this.ammo = ammo; }
}