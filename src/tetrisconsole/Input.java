package tetrisconsole;

import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.TerminalScreen;
import java.io.IOException;

public class Input extends Thread {

    // Polling for holding the key pressed
    public static final int POLL_INTERVAL = 1000 / 60;

    private final TerminalScreen screen;
    private KeyStroke keyStroke = null;

    public Input(TerminalScreen screen) {
        this.screen = screen;
    }

    public KeyStroke getKeyStroke() {
        KeyStroke keyStroke = this.keyStroke;
        this.keyStroke = null;
        return keyStroke;
    }

    @Override
    public void run() {
        while (true) {
            try {
                KeyStroke keyStroke = screen.pollInput();
                if (keyStroke != null) {
                    this.keyStroke = keyStroke;                  
                }
            } catch (IOException e) {
                System.err.println(e);
            }

            // Polling the key after press
            try {
                Thread.sleep(POLL_INTERVAL);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}