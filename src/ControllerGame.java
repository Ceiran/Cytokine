import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.TitledPane;

import java.util.LinkedList;
import java.util.Queue;

public class ControllerGame {

    @FXML private TitledPane fxGlobalHP;
    public Queue<Integer> queue = new LinkedList<>();

    @FXML
    public void execRun() {
        Thread thread1 = new Thread() {
            Game game = new Game(0);
            long initial = System.currentTimeMillis();
            public void run() {
                while (game.runTurn()) {
                    while (Math.abs(initial - System.currentTimeMillis()) < 1000) { /* Hold thread for one second. */ }
                    initial = System.currentTimeMillis();
                    queue.clear();
                    queue.add(Game.turnNumber);
                }
                System.out.println("TERMINATE GAME"); // End condition reached, patient is dead or pathogen is destroyed.
            }
        };
        thread1.setDaemon(true);
        thread1.start();

        Task task = new Task<Void>() {
            @Override
            public Void call() throws Exception {
                while (true) {
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            if (queue.size() > 0) { setFxGlobalHP(Integer.toString(queue.remove())); }
                        }
                    });
                }
            }
        };
        Thread thread2 = new Thread(task);
        thread2.setDaemon(true);
        thread2.start();
    }

    public void setFxGlobalHP(String value){
        fxGlobalHP.setText(value);
    }
}
