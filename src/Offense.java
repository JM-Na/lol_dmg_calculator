public class Offense {

    private Long type; // 0: 마법, 1: 물리, 2: 고정
    private int AP; // 마법 데미지 보정 스탯
    private int AD; // 물리 데미지 보정 스탯
    private int CritChance; // 치명타 확률
    private int CritMod; // 치명타 피해량
    private int Lethality; // 물리 관통력
    private long[] ArmorReduction; // 방어력 감소
    private long[] ArmorPenetration; // 방어구 관통력
    private long[] MagicResistReduction; // 마법 저항력 감소
    private long MagicPenetration; // 마법 관통력
    private long[] MagicPenetrationPercent;
    public Long getType() {
        return this.type;
    }

    public int getAP() {
        return AP;
    }

    public int getAD() {
        return AD;
    }

    public int getCritChance() {
        return CritChance;
    }

    public int getCritMod() {
        return CritMod;
    }

    public int getLethality() {
        return Lethality;
    }

    public long[] getArmorReduction() {
        return ArmorReduction;
    }

    public long[] getArmorPenetration() {
        return ArmorPenetration;
    }

    public long[] getMagicResistReduction() {
        return MagicResistReduction;
    }

    public long getMagicPenetration() {
        return MagicPenetration;
    }

    public long[] getMagicPenetrationPercent() {
        return MagicPenetrationPercent;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }

    public void setAD(int AD) {
        this.AD = AD;
    }

    public void setCritChance(int critChance) {
        CritChance = critChance;
    }

    public void setCritMod(int critMod) {
        CritMod = critMod;
    }

    public void setLethality(int lethality) {
        Lethality = lethality;
    }

    public void setArmorReduction(long[] armorReduction) {
        ArmorReduction = armorReduction;
    }

    public void setArmorPenetration(long[] armorPenetration) {
        ArmorPenetration = armorPenetration;
    }

    public void setMagicResistReduction(long[] magicResistReduction) {
        MagicResistReduction = magicResistReduction;
    }

    public void setMagicPenetration(long magicPenetration) {
        MagicPenetration = magicPenetration;
    }

    public void setMagicPenetrationPercent(long[] magicPenetrationPercent) {
        MagicPenetrationPercent = magicPenetrationPercent;
    }
}
