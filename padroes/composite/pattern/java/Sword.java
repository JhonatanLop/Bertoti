package composite.pattern.java;

import java.util.ArrayList;
import java.util.List;

public class Sword implements Component{

    private String name;
    private String description;
    private List<Component> parts;
    private double dammage;

    public Sword(String name, String Description, List<Component> parts, double dammage) {
        this.name = name;
        this.description = description;
        this.parts = parts;
        this.dammage = dammage;
    }

    public void addPart(Component part){
        parts.add(part);
        setDammage(getDammage() + part.getDammage());
    }

    public void removePart(Parts part){
        parts.remove(part);
    }

    public void describe(){
        for (Component part : this.parts) {
            System.out.println(part.getClass());
        }
    }

    public double use(){
        return getDammage();
    }

    public static void main(String[] args) {
        // cria espada
        Sword sword1Sword = new Sword("SoulCalibur", "a master piece sword", new ArrayList<Component>(), 50.0);

        // cria uma nova part
        Parts p1 = new Parts("iron guard",15.0,"it is a iron guard for a long sword", 12.5);
        Parts p2 = new Parts("silver pomo",30.0,"it is a silver pomo for better acuraty", 20.2);
        
        sword1Sword.addPart(p1);
        sword1Sword.addPart(p2);

        // cria uma nova habilidade
        SwordSkills deadEye = new SwordSkills("Dead Eye", "time go slowly for 5 seconds", sword1Sword.getDammage());
        SwordSkills lastWish = new SwordSkills("Last Wish", "double dammage when you have 5% of life", 100.0);
        
        sword1Sword.addPart(deadEye);
        sword1Sword.addPart(lastWish);

        System.out.printf("Dano total de %s: %s", sword1Sword.getName(), sword1Sword.use());

    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public List<Component> getParts() { return parts; }
    public double getDammage() { return dammage; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setParts(List<Component> parts) { this.parts = parts; }
    public void setDammage(double dammage) { this.dammage = dammage; }

}
