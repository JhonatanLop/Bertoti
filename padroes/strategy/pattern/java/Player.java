/**
 * Player
 */
public class Player {

    private String name;
    private Weapon hand1;
    private Weapon hand2;
    private int parts;
    
    public Player(String name, Weapon hand1, Weapon hand2, int parts) {
        this.name = name;
        this.parts = parts;
        this.hand1 = hand1;
        this.hand2 = hand2;
    }

    public static void main(String[] args) {
        // criando espada, escudo e arco
        Sword swordWeapon = new Sword("darkrepulser",714.0,false,100);
        Shield snakShield = new Shield("Snake Shield",50.8, 650.4, 200);
        Bow bambooBow = new Bow("Bamboo bow", 30, 795.8, 80);

        Player p1 = new Player("jhow",swordWeapon, snakShield, 50);

        System.out.printf("Atacando com: %s\nDano: %f\n", p1.getHand1().getName(),p1.getHand1().action());
        System.out.println("Defendendo com Escudo");
        System.out.printf("Dano recebido: %f",p1.getHand2().defeat(542.4));
    }

    public String getName() { return name; }
    public Weapon getHand1() { return hand1; }
    public Weapon getHand2() { return hand2; }
    public int getParts() { return parts; }
    public void setName(String name) { this.name = name; }
    public void setHand1(Weapon hand1) { this.hand1 = hand1; }
    public void setHand2(Weapon hand2) { this.hand2 = hand2; }
    public void setParts(int parts) { this.parts = parts; }}