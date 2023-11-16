package com.workintech.model;

public enum Weapon {
    SWORD(10,1.8),
    AXE(12,1.6),
    MACE(15,1.0);

   private int damage;
   private double firingSpeed;

   private Weapon(int damage, double firingSpeed){
        this.firingSpeed=firingSpeed;
        this.damage=damage;
    }

    public int getDamage() {
        return damage;
    }

    public double getFiringSpeed() {
        return firingSpeed;
    }
}
