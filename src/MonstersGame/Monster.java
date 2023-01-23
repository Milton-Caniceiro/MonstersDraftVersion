package MonstersGame;

public abstract class Monster {
    public enum MonsterList {
        VAMPIRE("VAMPIRE"), MUMMY("MUMMY"), WEREWOLF("WEREWOLF");

        public String name;
        private MonsterList(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    MonsterList typeOfMonster;
    private int damage;
    private int health;
    private boolean isAlive = true;

    private static int monsterCounter;

    public Monster(MonsterList typeOfMonster, int damage, int health) {
        this.typeOfMonster = typeOfMonster;
        this.damage = damage;
        this.health = health;
        monsterCounter++;
    }

    public abstract void attack(Monster monster);

    public boolean isAlive() {
        return isAlive;
    }



    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void loseHealth(int hitPoints) {
        this.health -= hitPoints;
        if(this.health<=0)
            this.health=0;
    }
    public void recoverHealth(int hitPoints) {
        this.health += hitPoints;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "typeOfMonster=" + typeOfMonster +
                ", damage=" + damage +
                ", health=" + health +
                '}';
    }
}
