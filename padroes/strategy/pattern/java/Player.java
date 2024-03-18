public class Player {
    
    private String name;
    private int parts;
    private Weapon weapon;
    
    public Player(String name, int parts, Weapon weapon) {
        this.name = name;
        this.parts = parts;
        this.weapon = weapon;
    }
    
    public double attack(){
        return getWeapon().use();
    }
    
    public static void main(String[] args) {
        Sword foo = new Sword("Darkrepulser",false,900,1100);
        Player joe = new Player("jhonatan",50,foo);
        double dmg = joe.attack();
        System.out.println(dmg);
        Shield shield = new Shield("snake",700,98000);
        joe.setWeapon(shield);
        double defeat = joe.attack();
        System.out.println(defeat);
        
    }
    
    public String getName() { return name; }
    public Weapon getWeapon() { return weapon; }
    public int getParts() { return parts; }
    public void setName(String name) { this.name = name; }
    public void setWeapon(Weapon weapon) { this.weapon = weapon; }
    public void setParts(int parts) { this.parts = parts; }
}