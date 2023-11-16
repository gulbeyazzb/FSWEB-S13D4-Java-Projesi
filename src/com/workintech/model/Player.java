package com.workintech.model;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        checkHealth(healthPercentage);
        this.weapon = weapon;
    }

    public void checkHealth(int healthPercentage) {
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        }
        if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println(name + "player has been knocked out of game");
        }
        checkHealth(healthPercentage);
    }

    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        checkHealth(healthPercentage);
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
