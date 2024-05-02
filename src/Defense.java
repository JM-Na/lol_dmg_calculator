public class Defense {
    private int Armor; // 방어력
    private int MagicResist; // 마법 저항력
    private int Health; // 체력

    public int getArmor() {
        return Armor;
    }

    public int getMagicResist() {
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
