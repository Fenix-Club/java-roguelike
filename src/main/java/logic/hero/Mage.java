package logic.hero;

import java.util.ArrayList;

/**
 * Created by dev on 05.01.17.
 */
/* DEFAULT VALUES that vary between professions :
    armor = 0
    health = 100
    strength = 10
    agility = 10
    maxHealth = 400
    mana = 0
    maxMana = 0
*/
public class Mage extends Hero
{
    public Mage(){
        armor = 5;
        strength = 8;
        agility = 15;
        maxHealth = 300;
        mana = 150;
        maxMana = 300;

        inventory = new ArrayList<>();
    }

}
