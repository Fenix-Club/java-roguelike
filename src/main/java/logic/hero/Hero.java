package logic.hero;

import logic.item.Equippable;
import logic.item.Item;
import logic.item.Usable;

import java.util.List;

public abstract class Hero {

    int armor;
    int strength;
    int agility;
    int health;
    int mana;
    List<Item> inventory;
    int maxHealth;
    int maxMana;
    int level = 1;

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
