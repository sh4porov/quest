package com.mposhatov.entity;

import javax.persistence.*;

@Entity
@Table(name = "CHARACTERISTICS")
public class DbCharacteristics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "inventory")
    private DbClient client;

    @Column(name = "EXPERIENCE", nullable = false)
    private long experience;

    @Column(name = "LEVEL", nullable = false)
    private long level;

    @Column(name = "ATTACK", nullable = false)
    private long attack;

    @Column(name = "DEFENSE", nullable = false)
    private long defense;

    @Column(name = "SPELL_POWER", nullable = false)
    private long spellPower;

    @Column(name = "KNOWLEDGE", nullable = false)
    private long knowledge;

    @Column(name = "STRENGTH", nullable = false)
    private long strength;

    @Column(name = "HEALTH", nullable = false)
    private long health;

    @Column(name = "MANA", nullable = false)
    private long mana;

    @Column(name = "MIN_DAMAGE", nullable = false)
    private long minDamage;

    @Column(name = "MAX_DAMAGE", nullable = false)
    private long maxDamage;

    @Column(name = "AVAILABLE_CHARACTERISTICS", nullable = false)
    private long availableCharacteristics;

    @Column(name = "AVAILABLE_SKILLS", nullable = false)
    private long availableSkills;

    protected DbCharacteristics() {
    }

    public DbCharacteristics(long attack, long defense, long spellPower,
                             long knowledge, long strength,
                             long minDamage, long maxDamage,
                             long availableCharacteristics, long availableSkills) {
        this.experience = 0;
        this.level = 1;
        this.attack = attack;
        this.defense = defense;
        this.spellPower = spellPower;
        this.knowledge = knowledge;
        this.strength = strength;
        this.health = strength * 100;
        this.mana = knowledge * 10;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;

        this.availableCharacteristics = availableCharacteristics;
        this.availableSkills = availableSkills;
    }

    public DbCharacteristics addExperience(long experience) {
        this.experience += experience;
        return this;
    }

    public DbCharacteristics upLevel() {
        this.level++;
        return this;
    }

    public DbCharacteristics addAttack(long attack) {
        this.attack += attack;
        return this;
    }

    public DbCharacteristics minusAttack(long attack) {
        this.attack -= attack;
        return this;
    }

    public DbCharacteristics addDefense(long defense) {
        this.defense += defense;
        return this;
    }

    public DbCharacteristics minusDefense(long defense) {
        this.defense -= defense;
        return this;
    }

    public DbCharacteristics addSpellPower(long spellPower) {
        this.spellPower += spellPower;
        return this;
    }

    public DbCharacteristics minusSpellPower(long spellPower) {
        this.spellPower -= spellPower;
        return this;
    }

    public DbCharacteristics addKnowledge(long knowledge) {
        this.knowledge += knowledge;
        this.mana += knowledge * 10;
        return this;
    }

    public DbCharacteristics minusKnowledge(long knowledge) {
        this.knowledge -= knowledge;
        this.mana -= knowledge * 10;
        return this;
    }

    public DbCharacteristics addStrength(long strength) {
        this.strength += strength;
        this.health += strength * 100;
        return this;
    }

    public DbCharacteristics minusStrength(long strength) {
        this.strength -= strength;
        this.health -= strength * 100;
        return this;
    }


    public DbCharacteristics addDamage(long minDamage, long maxDamage) {
        this.minDamage += minDamage;
        this.maxDamage += maxDamage;
        return this;
    }

    public DbCharacteristics minusDamage(long minDamage, long maxDamage) {
        this.minDamage -= minDamage;
        this.maxDamage -= maxDamage;
        return this;
    }

    public DbCharacteristics addAvailableCharacteristics(long availableCharacteristics) {
        this.availableCharacteristics += availableCharacteristics;
        return this;
    }

    public DbCharacteristics minusAvailableCharacteristics(long availableCharacteristics) {
        this.availableCharacteristics -= availableCharacteristics;
        return this;
    }

    public DbCharacteristics addAvailableSkills(long availableSkills) {
        this.availableSkills += availableSkills;
        return this;
    }

    public DbCharacteristics minusAvailableSkills(long availableSkills) {
        this.availableSkills -= availableSkills;
        return this;
    }

    public Long getId() {
        return id;
    }

    public long getExperience() {
        return experience;
    }

    public long getLevel() {
        return level;
    }

    public long getAttack() {
        return attack;
    }

    public long getDefense() {
        return defense;
    }

    public long getSpellPower() {
        return spellPower;
    }

    public long getKnowledge() {
        return knowledge;
    }

    public long getStrength() {
        return strength;
    }

    public long getHealth() {
        return health;
    }

    public long getMana() {
        return mana;
    }

    public long getMinDamage() {
        return minDamage;
    }

    public long getMaxDamage() {
        return maxDamage;
    }

    public DbClient getClient() {
        return client;
    }

    public long getAvailableCharacteristics() {
        return availableCharacteristics;
    }

    public long getAvailableSkills() {
        return availableSkills;
    }
}
