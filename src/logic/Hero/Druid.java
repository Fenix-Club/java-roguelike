package logic.Hero;

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
public class Druid extends Hero
{
    public Druid(){
        armor = 8;
        health = 100;
        strength = 10;
        agility = 20;
        maxHealth = 350;
        mana  = 100;
        maxMana = 200;

        inventory = new ArrayList<>();
    }
}
