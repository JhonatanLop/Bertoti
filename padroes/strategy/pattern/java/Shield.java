public class Shield extends Weapon{
    private double defeat;

    public Shield (
        String name,
        double damage,
        double defeat,
        int durability
        ){
            this.name = name;
            this.damage = damage;
            this.defeat= defeat;
            this.durability = durability;
        }

        public double getDefeat() { return defeat; }
        public void setDefeat(double defeat) { this.defeat = defeat; }
    }
