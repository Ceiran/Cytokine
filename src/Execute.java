public class Execute {
    public static void main(String[] args) {
        Game game = new Game(0);
        long initial = System.currentTimeMillis();
        while (true) {
            while (Math.abs(initial - System.currentTimeMillis()) < 1000) { /* Hold thread for one second. */ }
            if (!game.runTurn()) { break; }
            initial = System.currentTimeMillis();
        }
        System.out.println("TERMINATE GAME"); // End condition reached, patient is dead or pathogen is destroyed.
    }
}
