

import javax.naming.Context;

public class Player {
    
    private String name;
    private int parts;
    private Context context;
    
    public Player(String name, int parts, Context context) {
        this.name = name;
        this.parts = parts;
        this.context = context;
    }

    public void setWeapon(Weapon weapon){
        
    }

    public void attack(){
        context.executeStrategy();
    }

    public static void main(String[] args) {
        Sword foo = new Sword();
        
    }
}
