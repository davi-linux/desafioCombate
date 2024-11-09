package entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public String getName() {
        return name;
    }

    public void setLife(int life) {
        this.life = life;
    }
      public int getLife() {
        return life;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    
      public int getAttack() {
        return attack;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    
        public int getArmor() {
        return armor;
    }

    public void takeDamage(Champion attacker) {
        int damage = attacker.attack - this.armor;
        if (damage < 1) {
            damage = 1; 
        }
        this.life -= damage;

        if (this.life < 0) {
            this.life = 0;
        }
    }
    

    public String status() {
        return this.name + ": " + this.life + " de vida" + (this.life == 0 ? " (morreu)" : "");
    }

 
    public String toString() {
        return status();
    }

}