public class Shield extends Weapon {
    private double defeat;


    public Shield(String name, double defeat, int durability) {
        this.name = name;
        this.defeat = defeat;
        this.durability = durability;
    }

    public double use() {
        if (getDurability() == 0) {
            return (getDefeat() * 0.1);
        }
        return getDefeat();
    }

    public String getName() { return name; }
    public double getDefeat() { return defeat; }
    public int getDurability() { return durability; }
    public void setName(String name) { this.name = name; }
    public void setDefeat(double defeat) { this.defeat = defeat; }
    public void setDurability(int durability) { this.durability = durability; }

}