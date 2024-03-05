public class ShieldStrategy implements Strategy{

    private Shield shield;
    
    public ShieldStrategy(Shield shield) {
        this.shield = shield;
    }

    public double action() {
        if (getShield().getDurability() == 0) {
            return (getShield().getDamage() * 0.1);
        }
        return getShield().getDamage();
    }

    public void repair(int parts) {
        getShield().repair(parts);;
    }
    
    public double defeat(double damage){
        if (getShield().getDurability() == 0) {
            return (damage * 0.9);
        }
        return (damage - getShield().getDefeat());
    }

    public Shield getShield() { return shield; }
    public void setShield(Shield shield) { this.shield = shield; }
    
}
