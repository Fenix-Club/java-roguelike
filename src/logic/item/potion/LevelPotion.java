package logic.item.potion;

import logic.Hero.Hero;

public class LevelPotion extends Potion {

    @Override
    public String getItemName() {
        return "Potion of Level Up";
    }

    @Override
    public void use(Hero hero) {
        hero.setLevel(hero.getLevel() + 1);
    }
}
