public class re22 {

    public static void main(String[] args) {

        Archer archer1 = new Archer("A", "High");
        Archer archer2 = new Archer("B", "Middle");
        Archer archer3 = new Archer("A", "High");
        System.out.println(archer1 == archer2);
        System.out.println(archer1 == archer3);
        // Instance 자체가 서로 다르므로 직접적으로 같냐 물어보면 False

        System.out.println(archer1.equals(archer2));
        System.out.println(archer1.equals(archer3));
    }

}
