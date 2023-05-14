public class re23 {

    public static void main(String[] args) {

        Hero[] heros = new Hero[3];

        heros[0] = new Warrior("WA");
        heros[1] = new Archers("AR");
        heros[2] = new Wizard("WI");

        for(int i = 0; i < heros.length; i++) {
            heros[i].attack();

            if(heros[i] instanceof Warrior) {
                Warrior temp = (Warrior) heros[i];
                temp.swordAttack();
            }
            else if(heros[i] instanceof Archers) {
                Archers temp = (Archers) heros[i];
                temp.fireArrow();
            }
            else if(heros[i] instanceof Wizard) {
                Wizard temp = (Wizard) heros[i];
                temp.freezing();
            }
        }
    }

}
