package composite.pattern.java;

public class SwordSkills implements Component {
    private String name;
    private String effect;
    private double dammage;

    public SwordSkills(String name, String effect, double dammage) {
        this.name = name;
        this.effect = effect;
        this.dammage = dammage;
    }

    public void describe(){
        System.out.printf("Name: %s\n", getName());
        System.out.printf("Effect: %s\n", getDescription());
        System.out.printf("Dammage: %s\n", getDammage());
    }

    public String getName() { return name; }
    public String getDescription() { return effect; }
    public double getDammage() { return dammage; }
    public void setName(String name) { this.name = name; }
    public void setEffect(String effect) { this.effect = effect; }
    public void setDammage(double dammage) { this.dammage = dammage; }
    
}