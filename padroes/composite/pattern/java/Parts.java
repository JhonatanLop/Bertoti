package composite.pattern.java;

public class Parts implements Component {
    private String name;
    private double price;
    private String description;
    private double dammage;

    public Parts(String name, double price, String description, double dammage) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.dammage = dammage;
    }
    
    @Override
    public void describe() {
        System.out.printf("Name: %s\n",getName());
        System.out.printf("Description: %s\n",getDescription());
        System.out.printf("Price: %s\n",getPrice());
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }
    public double getDammage() { return dammage; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setDescription(String description) { this.description = description; }
    public void setDammage(double dammage) { this.dammage = dammage; }

}