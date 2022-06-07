public class Warlock extends Character{
    Warlock(String name, int lvl, int hp, int mp){
        super(name,lvl,hp,mp);
    }
    /**
     * Skills and Regen 
     */
    public void tornado(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Tornado (Damage - 15) (Mana cost - 30)");
        int damagePoints = 15;
        int manaCost = 30;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void icewall(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Ice Wall (Damage - 25) (Mana cost - 50)");
        int damagePoints = 25;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void chaosmeteor(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Chaos Meteor (Damage - 60) (Mana cost - 100)");
        int damagePoints = 60;
        int manaCost = 100;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    /**
     * Display character data
     */
    public void display(){
        System.out.println("Warlock: " + super.characterName);
        System.out.println("HealthPoints: " + super.healthPoints);
        System.out.println("ManaPoints: " + super.manaPoints);
        System.out.println("Level " + super.level);
    }
}