public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(){}
    Character(String name, int lvl, int hp, int mp){
        characterName = name;
        level = lvl;
        healthPoints = hp;
        manaPoints = mp;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void displayName(Character Name){
        System.out.println("Character Initialized " + Name.characterName);
    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter, int damagePoints, int manaCost){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */
        if (enemyCharacter.healthPoints <= 0){
            System.out.println("You " + enemyCharacter.characterName + " are defeated");
        }
    }
    public void levelUp(Character name){
        name.level += 10;
        System.out.println("Good Job " + name.characterName + " you levelled up by 10!!!");
    }

}