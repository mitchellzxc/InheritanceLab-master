public class Wizard extends Character{
    Wizard(String name, int lvl, int hp, int mp){
        super(name,lvl,hp,mp);
    }
    public void quas(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Quas (Damage - 25)(Mana Cost - 50)");
        int damagePoints = 25;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void wex(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Wex (Damage - 25)(Mana Cost - 50)");
        int damagePoints = 25;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void invoke(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Invoke (Damage - 50)(Mana Cost - 100)");
        int damagePoints = 50;
        int manaCost = 100;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void heal(){
        super.healthPoints += 50;
        System.out.println("Healing!!!");
    }
    /**
     * Display character data
     */
    public void display(){
        System.out.println("Wizard: " + super.characterName);
        System.out.println("HealthPoints: " + super.healthPoints);
        System.out.println("ManaPoints: " + super.manaPoints);
        System.out.println("Level " + super.level);
    }
}