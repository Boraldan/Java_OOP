package Leksii.L1.Ex007;

public class Fight {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());

        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Medic hero3 = new Medic();
        System.out.println(hero3.getInfo());

        hero1.Attack(hero2);
        System.out.println("Атака 1 " + hero2.getInfo());

        hero3.healed(hero2);
        System.out.println("после лечения " + hero2.getInfo());

        hero3.Attack(hero3); // атакует сам себя
        System.out.println(hero3.getInfo());

        hero3.Attack(hero1);

    }
}
