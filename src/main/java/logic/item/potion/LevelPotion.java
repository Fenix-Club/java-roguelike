package logic.item.potion;

import logic.hero.Hero;

public class LevelPotion extends Potion {

    public String getShortItemName(){return "LePo";}

    @Override
    public String getItemName() {
        return "Potion of Level Up";
    }

    @Override
    public void use(Hero hero) {
        hero.setLevel(hero.getLevel() + 1);
    }
}
