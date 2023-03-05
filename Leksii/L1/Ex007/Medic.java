package Leksii.L1.Ex007;

public class Medic extends BaseHero {

    private int bint;
    private int maxBint;

    public Medic() {
        super(String.format("Hero_Medict #%d", ++number),
                r.nextInt(100, 200));
        this.maxBint = r.nextInt(50, 150);
        this.bint = maxBint;
    }

    public String getInfo() {
        return String.format("%s  Bint: %d", super.getInfo(), this.bint);
    }

    public void healed(BaseHero target) {
        int bint = 20;
        if (this.bint - bint < 0) return;
        if (target.hp + bint <= target.maxHp) {
            target.hp = target.hp + bint;
            System.out.println("Лечение + 20");
            }
        else {
            target.hp = target.maxHp;
        }
    }
}


