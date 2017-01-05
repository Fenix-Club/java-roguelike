package logic.item.armor;

import logic.HeroAndProfessions.Hero;


/**
 * Created by kvothe on 22.12.16.
 */
public class PlateArmor extends Armor {

    private static final int ARMOR_VALUE = 30;

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

