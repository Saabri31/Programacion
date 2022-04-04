package tetrisconsole;

import tetrisconsole.window.Window;
import com.googlecode.lanterna.TextColor;
import java.io.IOException;

/**
 * @author Ismael Magro
 */
public class Game {

    public static void main(String[] args) throws IOException, InterruptedException {
        Window window = new Window();

        window.createGameWindow();
        
        Logic logic = new Logic(window.getScreen());
        logic.startGameLogic();
    }
}