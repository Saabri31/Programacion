package tetrisconsole;

import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.TerminalScreen;

public class Logic extends Thread {

    private final TerminalScreen screen;
    private static Input input;
    private static KeyStroke key;

    public Logic(TerminalScreen screen) {
        this.screen = screen;
        input = new Input(screen);
    }

    public void startGameLogic() throws InterruptedException {
        input.start();

        while (true) {
            Thread.sleep(MAX_PRIORITY);

            processInput();
        }
    }

    private static void processInput() {
        key = input.getKeyStroke();

        if (key != null) {
            if (key.getKeyType() == Config.LEFT_KEY)
                System.out.println("Left!");
            if (key.getKeyType() == Config.RIGHT_KEY)
                System.out.println("Right!");
            if (key.getKeyType() == Config.DOWN_KEY)
                System.out.println("Down!");

            if (key.getKeyType() == KeyType.Character) {
                if (key.getCharacter() == Config.ROTATE_COUNTERCLOCKWISE_KEY) 
                    System.out.println("Counter-clockwise!");

                if (key.getCharacter() == Config.ROTATE_CLOCKWISE_KEY)
                    System.out.println("Clockwise!");

                if (key.getCharacter() == Config.DROP_KEY)
                    System.out.println("Drop!");
            }
        }
    }
}
