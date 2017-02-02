package logic.hero;

import java.util.ArrayList;

/**
 * Created by Jan Nowiński on 05.01.17.
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
public class Hunter extends Hero
{

    public Hunter(){
        armor = 10;
        health = 125;
        strength = 15;
        agility = 20;
        maxHealth = 400;
        mana = 0;
        maxMana = 0;

        inventory = new ArrayList<>();
    }
}
