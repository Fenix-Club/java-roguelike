package logic.item.armor;

import logic.hero.Hero;

public class LeatherArmor extends Armor {

    private static final int ARMOR_VALUE = 15;

    public String getShortItemName(){return "LeAr";}

    @Override
    protected int getArmorValue() {
        return ARMOR_VALUE;
    }

    @Override
    public String getItemName() {
        return "Leather Armor";
    }

    @Override
    public void equip(Hero hero) {
        hero.setArmor(hero.getArmor() + getArmorValue());
    }
}
