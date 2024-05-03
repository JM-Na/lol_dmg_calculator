public class Defense {
    private long Armor; // 방어력
    private long MagicResist; // 마법 저항력
    private int Health; // 체력

    public long getArmor() {
        return Armor;
    }

    public long getMagicResist() {
        return MagicResist;
    }

    public int getHealth() {
        return Health;
    }

    public void setArmor(int armor) {
        Armor = armor;
    }

    public void setMagicResist(int magicResist) {
        MagicResist = magicResist;
    }

    public void setHealth(int health) {
        Health = health;
    }
}
