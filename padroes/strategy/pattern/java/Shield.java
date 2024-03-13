

public class Shield implements Weapon {
    private String name;
    private double defeat;
    private int durability;


    public double use() {
        if (getDurability() == 0) {
            return (getDefeat() * 0.1);
        }
        return getDefeat();
    }

    public void repair(int parts) {
        setDurability(getDurability() + parts);
    }

    public String getName() { return name; }
    public double getDefeat() { return defeat; }
    public int getDurability() { return durability; }
    public void setName(String name) { this.name = name; }
    public void setDefeat(double defeat) { this.defeat = defeat; }
    public void setDurability(int durability) { this.durability = durability; }

}