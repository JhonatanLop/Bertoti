package singleton.java;

import java.util.Date;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String name;
    private Date date;
    private int stock;
    private String goal;

    private ConfigurationManager(String name, Date date, int stock, String goal){
        this.name = name;
        this.date = date;
        this.stock = stock;
        this.goal = goal;
    }

    public static ConfigurationManager getInstance(String name, Date date, int stock, String goal){
        if (instance == null) {
            instance = new ConfigurationManager("name form database", new Date(), 155, "teste");
        }
        return instance;
    }

    public static ConfigurationManager getInstance() { return instance; }
    public String getName() { return name; }
    public Date getDate() { return date; }
    public int getStock() { return stock; }
    public String getGoal() { return goal; }
    public static void setInstance(ConfigurationManager instance) { ConfigurationManager.instance = instance; }
    public void setName(String name) { this.name = name; }
    public void setDate(Date date) { this.date = date; }
    public void setStock(int stock) { this.stock = stock; }
    public void setGoal(String goal) { this.goal = goal; }
}
