package program;

import logic.Hero.Warrior;
import logic.item.armor.LeatherArmor;
import logic.item.potion.LevelPotion;

public class Program {

    public static void main(String[] args) {
        Warrior hero = new Warrior();
        System.out.println(hero);

        hero.useItem(new LevelPotion());
        System.out.println(hero);

        hero.equipItem(new LeatherArmor());
        System.out.println(hero);

        hero.useItem(new LevelPotion());
        System.out.println(hero);
    }
}
