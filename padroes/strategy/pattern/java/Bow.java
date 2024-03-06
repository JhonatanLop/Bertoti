public class Bow extends Weapon implements Strategy{
    private int ammo;

    public Bow(String name, int ammo, double damage, int durability) {
        this.name = name;
        this.ammo = ammo;
        this.damage = damage;
        this.durability = durability;
    }

    public double action(){
        // sem munição
        if (getAmmo() == 0) {
            return 0.0;
        }
        // arma quebrada retorna 10% do dano
        if (getDurability() == 0) {
            return 0.1 * getDamage();
        }
        return getDamage();
    }
    
    public double defeat(double damage){
        if (getDurability() == 0) {
            return (damage * 0.9);
        }
        return (damage - (damage * 0.5));
    }

    public int getAmmo() { return ammo; }
    public void setAmmo(int ammo) { this.ammo = ammo; }
    
}
