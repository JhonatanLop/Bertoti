package singleton.java;

import java.util.Date;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String name;
    private String link;
    private int stock;
    private int goal;

    private ConfigurationManager(String name, String link, int stock, int goal){
        this.name = name;
        this.link = link;
        this.stock = stock;
        this.goal = goal;
    }

    public static ConfigurationManager getInstance(String name, String link, int stock, int goal){
        if (instance == null) {
            instance = new ConfigurationManager(name, link, stock, goal);
        }
        return instance;
    }

    public static ConfigurationManager getInstance() { return instance; }
    public String getName() { return name; }
    public String getLink() { return link; }
    public int getStock() { return stock; }
    public int getGoal() { return goal; }
    public static void setInstance(ConfigurationManager instance) { ConfigurationManager.instance = instance; }
    public void setName(String name) { this.name = name; }
    public void setLink(String link) { this.link = link; }
    public void setStock(int stock) { this.stock = stock; }
    public void setGoal(int goal) { this.goal = goal; }
}
