public class re20 implements Doggy, Kitty {

    public static void main(String[] args) {
        re20 re = new re20();
        re.crying();
        re.show();
        re.one();
        re.two();
    }

    @Override
    public void crying() {
        System.out.println("Woof!");
    }

    @Override
    public void show() {
        System.out.println("This is Doggy.");
    }

    @Override
    public void one() {
        System.out.println("one");
    }

    @Override
    public void two() {
        System.out.println("two");
    }
}