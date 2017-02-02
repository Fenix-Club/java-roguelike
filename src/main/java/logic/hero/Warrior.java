package logic.hero;

import java.util.ArrayList;

/**
 * Created by Jan Nowiński on 05.01.17.
 */
public class Warrior extends Hero {
/* DEFAULT VALUES that vary between professions :
armor = 0
strength = 10
agility = 10
health = 100
maxHealth = 400
mana = 0
maxMana = 0
*/
    public Warrior() {
        armor = 20;
        health = 150;
        strength = 20;
        agility = 10;
        maxHealth = 500;
        mana = 0;
        maxMana = 0;

        inventory = new ArrayList<>();
    }
}

