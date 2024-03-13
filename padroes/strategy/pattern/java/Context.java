public class Context {
    private Weapon weapon;

    public Context(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void executeStrategy() {
        weapon.use();
    }
}