public class Shield extends Weapon implements Strategy{
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

        public double action() {
            if (getDurability() == 0) {
                return (getDamage() * 0.1);
            }
            return getDamage();
        }

        public double defeat(double damage){
            if (getDurability() == 0) {
                return (damage * 0.9);
            }
            return ((damage - getDefeat() <= 0) ? 0 : damage - getDefeat() );
        }

        public double getDefeat() { return defeat; }
        public void setDefeat(double defeat) { this.defeat = defeat; }
    }
