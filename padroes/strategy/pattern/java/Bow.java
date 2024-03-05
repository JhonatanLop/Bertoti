public class Bow extends Weapon{
    private int ammo;

    public Bow(String name, int ammo, double damage, int durability) {
        this.name = name;
        this.ammo = ammo;
        this.damage = damage;
        this.durability = durability;
    }

    public int getAmmo() { return ammo; }
    public void setAmmo(int ammo) { this.ammo = ammo; }
    
}
