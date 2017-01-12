package program;

import logic.Hero.Warrior;
import logic.item.armor.LeatherArmor;
import logic.item.potion.LevelPotion;
import logic.map.GameLevel;

import java.util.Random;

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

        GameLevel level1 = new GameLevel(5);
        //items laying methods test
        LevelPotion lvl = new LevelPotion();
        level1.layItem(0,0,lvl);
        System.out.print(level1);
        level1.removeItem(0,0);
        System.out.print(level1);

        GameLevel level2 = new GameLevel(5, "random");
        System.out.print(level2);

    }
}
