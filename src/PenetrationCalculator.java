public class PenetrationCalculator {

    public Offense offense;
    public Defense defense;

    PenetrationCalculator(Offense offense, Defense defense) {
        this.offense = offense;
        this.defense = defense;
    }

    public void func(){
        Long type = offense.getType();

        if(type==0L){

        }
        else if (type==1L) {
            
        }
        else if (type==2L) {
            
        }
    }

    private long calculatePenetrationForMagicDamage(){
        long actualMagicResist;
        long tempMagicResist;

        int magicResist = defense.getMagicResist();
        long magicPenetration = offense.getMagicPenetration();
        long[] magicPenetrationPercents = offense.getMagicPenetrationPercent();
        long[] magicResistReductions = offense.getMagicResistReduction();

        // Adapt MagicPenetration
        tempMagicResist = magicResist - magicPenetration;

        // Adapt MagicPenetrationPercent
        for (long magicPenetrationPercent : magicPenetrationPercents) {
            tempMagicResist = tempMagicResist * (1 - magicPenetrationPercent);
        }

        // Adapt MagicReductions
        for (long magicResistReduction : magicResistReductions) {
            tempMagicResist = tempMagicResist * (1 - magicResistReduction);
        }

        actualMagicResist = tempMagicResist;
        System.out.println("actualMagicResist = " + actualMagicResist);

        return actualMagicResist;
    }

    private long calculatePenetrationForMeleeDamage() {
        long actualArmor;
        long tempArmor;

        int armor = defense.getArmor();
        int lethality = offense.getLethality();
        long[] armorPenetrations = offense.getArmorPenetration();
        long[] armorReductions = offense.getArmorReduction();

        // Adapt Lethality
        tempArmor = armor - lethality;

        // Adapt ArmorPenetration
        for (long armorPenetration : armorPenetrations) {
            tempArmor = tempArmor * (1 - armorPenetration);
        }

        // Adapt ArmorReduction
        for (long armorReduction : armorReductions) {
            tempArmor = tempArmor * (1 - armorReduction);
        }

        actualArmor = tempArmor;
        System.out.println("actualArmor = " + actualArmor);

        return actualArmor;
    }

}
