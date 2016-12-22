package logic.item.potion;


import logic.hero.Hero;

public class ManaPotion extends Potion{

    private static final int MANA_VALUE = 10;

    @Override
    public String getItemName() {
        return "Potion of Mana";
    }

    @Override
    public void use(Hero hero) {
        if (hero.getMaxMana() - hero.getMana() >= MANA_VALUE) {
            hero.setHealth(hero.getMana() + MANA_VALUE);
        }
    }
}
