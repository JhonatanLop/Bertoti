public abstract class Weapon{
    protected String name;
    protected double damage;
    protected int durability;

    public void repair(int parts){
        durability += parts;
    }

    public abstract double action();
    public abstract double defeat(double damage);

    public String getName() { return name; }
    public double getDamage() { return damage; }
    public int getDurability() { return durability; }
    public void setName(String name) { this.name = name; }
    public void setdamage(double damage) { this.damage = damage; }
    public void setDurability(int durability) { this.durability = durability; }
}