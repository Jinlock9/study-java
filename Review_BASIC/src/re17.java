public class re17 extends Player{

    public static void main(String[] args) {

        re17 re = new re17();
        re.play("Sultan Of The Disco - Neon Light");
        re.pause();
        re.stop();

    }

    @Override
    void play(String songName) {
        System.out.println(songName);
    }

    @Override
    void pause() {
        System.out.println("Pause");
    }

    @Override
    void stop() {
        System.out.println("Stop");
    }

}
