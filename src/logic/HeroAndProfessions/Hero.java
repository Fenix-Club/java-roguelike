package logic.hero;

import logic.item.Equippable;
import logic.item.Item;
import logic.item.Usable;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero {

    private static final int DEFAULT_ARMOR = 0;
    private static final int DEFAULT_HEALTH = 100;
    private static final int DEFAULT_MANA = 100;
    private static final int DEFAULT_LEVEL = 1;
    private static final int DEFAULT_MAX_HEALTH = 100;
    private static final int DEFAULT_MAX_MANA = 100;

    private int armor;
    private int health;
    private int mana;
    private List<Item> inventory;
    private int maxHealth;
    private int maxMana;
    private int level;

    public Hero() {
        armor = DEFAULT_ARMOR;
        health = DEFAULT_HEALTH;
        maxHealth = DEFAULT_MAX_HEALTH;
        level = DEFAULT_LEVEL;
        mana = DEFAULT_MANA;
        maxMana = DEFAULT_MAX_MANA;

        inventory = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("Armor: %d, health: %d, level: %d\n", armor, health, level);
    }

    public void addToInventory(Item item) {
        inventory.add(item);
    }

    public void useItem(Usable item) {
        item.use(this);
    }

    public void equipItem(Equippable item) {
        item.equip(this);
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }
}
