package singleton.java;

public class StartApp {
    private ConfigurationManager configurationApp;

    public static void main(String[] args) {
        System.out.println("variaveis de ambiente");
        ConfigurationManager instance1 = ConfigurationManager.getInstance("name form database", "https://link_of_website", 6969, 10000);
        ConfigurationManager instance2 = ConfigurationManager.getInstance("other name diferent", "https://link_to_another_website", 7272, 9000);

        // instance 1
        System.out.println(instance1.getName());
        System.out.println(instance1.getLink());
        System.out.println(instance1.getStock());
        System.out.println(instance1.getGoal());

        // instance 2
        System.out.println(instance2.getName());
        System.out.println(instance2.getLink());
        System.out.println(instance2.getStock());
        System.out.println(instance2.getGoal());
        
    }
}
