public class Offense {

    private Long type; // 0: 마법, 1: 물리, 2: 고정
    private int AP; // 마법 데미지 보정 스탯
    private int AD; // 물리 데미지 보정 스탯
    private int CritChance; // 치명타 확률
    private int CritMod; // 치명타 피해량
    private int Lethality; // 물리 관통력
    private long ArmorReduction; // 방어력 감소
    private long ArmorPenetration; // 방어구 관통력
    private long MagicResistReduction; // 마법 저항력 감소
    private long MagicPenetration; // 마법 관통력

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

    public long getArmorReduction() {
        return ArmorReduction;
    }

    public long getArmorPenetration() {
        return ArmorPenetration;
    }

    public long getMagicResistReduction() {
        return MagicResistReduction;
    }

    public long getMagicPenetration() {
        return MagicPenetration;
    }
}
