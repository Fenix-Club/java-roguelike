package logic.item.armor;

import logic.hero.Hero;


/**
 * Created by kvothe on 22.12.16.
 */
public class PlateArmor extends Armor {

    private static final int ARMOR_VALUE = 30;

    public String getShortItemName(){return "PlAr";}
    @Override
    protected int getArmorValue() {
        return ARMOR_VALUE;
    }

    @Override
    public String getItemName() {
        return "Player Armor";
    }

    @Override
    public void equip(Hero hero) {
        hero.setArmor(hero.getArmor() + getArmorValue());
    }
}

