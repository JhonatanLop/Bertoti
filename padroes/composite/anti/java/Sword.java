package composite.anti.java;

import java.util.List;
import java.util.Optional;

public class Sword {
    private String name;
    private String description;
    private List<Parts> parts;
    private List<SwordSkills> skills;
    private double dammage;

    public Sword(String name, String description, double dammage) {
        this.name = name;
        this.description = description;
        this.dammage = dammage;
    }

    public void describe() {
        System.out.printf("Name: %s\n",getName());
        System.out.printf("Description: %s\n",getDescription());
        System.out.printf("Dammage: %s\n",getDammage());
    }

    public void addParts(Parts part) {
        parts.add(part);
    }

    public void addSkills(SwordSkills skill) {
        skills.add(skill);
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getDammage() { return dammage; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setDammage(double dammage) { this.dammage = dammage; }

    public static void main(String[] args) {
        Sword sword1 = new Sword("SoulCalibur", "a master piece sword", 50.0);
        System.out.printf("Dano total de %s: %s", sword1.getName(), sword1.getDammage());
    }
}
