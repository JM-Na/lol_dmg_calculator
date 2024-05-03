public class PenetrationCalculator {

    public Offense offense;
    public Defense defense;

    PenetrationCalculator(Offense offense, Defense defense) {
        this.offense = offense;
        this.defense = defense;
    }

    public long func(){
        Long type = offense.getType();
        long actualStat = 3;
        if(type==0L){
            actualStat = calculatePenetrationForMeleeDamage();
        }
        else if (type==1L) {
            actualStat = calculatePenetrationForMagicDamage();
        } else if (type == 3L) {
            actualStat = 0;
        }

        return actualStat;
    }

    private long calculatePenetrationForMeleeDamage() {
        long armor = defense.getArmor();
        long lethality = offense.getLethality();
        long[] armorPenetrations = offense.getArmorPenetration();
        long[] armorReductions = offense.getArmorReduction();

        return calculatePenetration(armor, lethality, armorPenetrations, armorReductions);
    }

    private long calculatePenetrationForMagicDamage(){
        long magicResist = defense.getMagicResist();
        long magicPenetration = offense.getMagicPenetration();
        long[] magicPenetrationPercents = offense.getMagicPenetrationPercent();
        long[] magicResistReductions = offense.getMagicResistReduction();

        return calculatePenetration(magicResist, magicPenetration, magicPenetrationPercents, magicResistReductions);
    }

    private long calculatePenetration(long currentStat, long statReductionByValue, long[] statPenetrations,
                                      long[] statReductionsByPercent) {
        long actualStat;
        long tempStat;

        // Adapt lethality or magic penetration
        tempStat = currentStat - statReductionByValue;

        // Adapt armor penetration or magic penetration(percent)
        for (long statPenetration : statPenetrations) {
            tempStat = tempStat * (1 - statPenetration);
        }

        // Adapt armor reduction of magic reduction
        for (long statReduction : statReductionsByPercent) {
            tempStat = tempStat * (1 - statReduction);
        }
        actualStat = tempStat;

        System.out.println("actualStat = " + actualStat);

        return actualStat;
    }
}
