public abstract class Weapon {
    protected String name;
    protected int durability;

    public void repair(int parts) {
        setDurability(getDurability() + parts);
    }

    public abstract double use();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}