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

    public void calculatePenetrationForMagicDamage(){

    }

    public void calculatePenetrationForMeleeDamage() {

    }

}
