package tetrisconsole.window;

import tetrisconsole.Color;
import tetrisconsole.Config;
import tetrisconsole.window.Draw;
import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.swing.SwingTerminalFrame;
import java.io.IOException;

public class Window {

    private static TerminalScreen screen;
    private static Draw draw;

    private static int width;
    private static int height;
    
    private static TextColor borderColor;
    private static int mainBoardWidth;
    private static int mainBoardHeight;
    
    private static int boardGap;

    private static int pieceBoardWidth;
    private static int pieceBoardHeight;

    public Window() {
        Window.width = (Config.SCREEN_WIDTH * 2) + 1;
        Window.height = Config.SCREEN_HEIGHT;

        Window.mainBoardWidth = Config.MAIN_BOARD_WIDTH;
        Window.mainBoardHeight = Config.MAIN_BOARD_HEIGHT;
        
        Window.boardGap = Config.BOARD_GAP;

        Window.pieceBoardWidth = Config.PIECE_BOARD_WIDTH;
        Window.pieceBoardHeight = Config.PIECE_BOARD_HEIGHT;
        Window.borderColor = Config.BOARD_FRAME_COLOR;
    }

    public void createGameWindow() throws IOException, InterruptedException {
        createScreen();

        Draw draw = new Draw(screen);

        Draw.drawBoard(0, 0, mainBoardWidth, mainBoardHeight, borderColor);
        Draw.drawBoard(20 + boardGap, 0, pieceBoardWidth, pieceBoardHeight, borderColor);
        //draw.string(0, mainBoardHeight, "Created by Ismael Magro", Color.CYAN, SGR.BOLD);
        screen.refresh();
    }

    private static void createScreen() throws IOException {
        DefaultTerminalFactory factory = new DefaultTerminalFactory()
                .setInitialTerminalSize(new TerminalSize(width, height))
                .setTerminalEmulatorTitle("T I T S T R I S   modosexo");

        SwingTerminalFrame terminal = (SwingTerminalFrame) factory.createTerminal();
        terminal.setResizable(false);
        terminal.setDefaultCloseOperation(SwingTerminalFrame.EXIT_ON_CLOSE);

        screen = new TerminalScreen(terminal);
        screen.setCursorPosition(null);

        screen.startScreen();
    }

    private static void createBoard(int width, int height) throws IOException {
        screen.clear();
                
        
        screen.refresh();
    }

    public TerminalScreen getScreen() {
        return this.screen;
    }
}