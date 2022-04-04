package tetrisconsole.window;

import tetrisconsole.Color;
import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.screen.TerminalScreen;
import java.io.IOException;

public class Draw {

    private static TerminalScreen screen;

    public Draw(TerminalScreen screen) {
        this.screen = screen;
    }
    
    public static void drawBoard(int x, int y, int width, int height, TextColor borderColor) {
        // Creates main board without borders
        for (int i = y; i < height; i++) {
            int xPos = x;
            for (int j = x; j <= width; j++) {
                character(xPos, i, ' ');
                character(xPos + 1, i, '*', Color.GREY);
                if (x == width) {
                    Draw.character(xPos + 2, i, ' ');
                }
                xPos += 2;
            }
        }
        
        width = (width * 2) - 1; // Width is doubled because there's two characters in the board per width unit
        // Creates horizontal borders
        for (int i = x; i <= width; i++) {
            if (i == x) {
                character(i, y, '╔', borderColor);
                character(i, height - 1, '╚', borderColor);
            } else if (i == width) {
                character(i, y, '╗', borderColor);
                character(i, height - 1, '╝', borderColor);
            } else {
                character(i, y, '═', borderColor);
                character(i, height - 1, '═', borderColor);
            }
        }

        // Creates vertical borders
        for (int i = y + 1; i <= height; i++) {
            if (i < height - 1) {
                character(x, i, '║', borderColor);
                character(width, i, '║', borderColor);
            }
        }
    }

    /**
     * Draws char with specified color.Does NOT refresh de screen.
     *
     * @param x
     * @param y
     * @param ch
     * @param color
     */
    public static void character(int x, int y, char ch, TextColor color) {
        screen.setCharacter(x, y, TextCharacter.fromCharacter(ch)[0]
                .withForegroundColor(color));
    }

    /**
     * Draws char with specified color and style.Does NOT refresh de screen.
     *
     * @param x
     * @param y
     * @param ch
     * @param color
     * @param style
     */
    public static void character(int x, int y, char ch, TextColor color, SGR style) {
        screen.setCharacter(x, y, TextCharacter.fromCharacter(ch)[0]
                .withForegroundColor(color).withModifier(style));
    }

    /**
     * Draws char with BRIGHT WHITE color as default.Does NOT refresh de screen.
     *
     * @param x
     * @param y
     * @param ch
     */
    public static void character(int x, int y, char ch) {
        screen.setCharacter(x, y, TextCharacter.fromCharacter(ch)[0]
                .withForegroundColor(Color.WHITE));
    }

    /**
     * Draws char with BRIGHT WHITE color as default, and specified style.Does
     * NOT refresh de screen.
     *
     * @param x
     * @param y
     * @param ch
     * @param style
     */
    public static void character(int x, int y, char ch, SGR style) {
        screen.setCharacter(x, y, TextCharacter.fromCharacter(ch)[0]
                .withForegroundColor(Color.WHITE).withModifier(style));
    }

    /**
     * Draws every character from a given string starting at (x,y) with
     * specified color.Does NOT refresh de screen
     *
     * @param x The starting x for the string
     * @param y
     * @param st
     * @throws java.io.IOException
     */
    public static void string(int x, int y, String st) throws IOException {
        char chList[] = st.toCharArray();
        for (char ch : chList) {
            character(x, y, ch);
            x++;
        }
    }

    /**
     * Draws every character from a given string starting at (x,y) with
     * specified color. Does NOT refresh de screen
     *
     * @param x The starting x for the string
     * @param y
     * @param st
     * @param color
     * @throws java.io.IOException
     */
    public static void string(int x, int y, String st, TextColor color) throws IOException {
        char chList[] = st.toCharArray();
        for (char ch : chList) {
            character(x, y, ch, color);
            x++;
        }
    }

    /**
     * Draws every character from a given string starting at (x,y) with
     * specified color.Does NOT refresh de screen
     *
     * @param x The starting x for the string
     * @param y
     * @param st
     * @param style
     * @throws java.io.IOException
     */
    public static void string(int x, int y, String st, SGR style) throws IOException {
        char chList[] = st.toCharArray();
        for (char ch : chList) {
            character(x, y, ch, style);
            x++;
        }
    }

    /**
     * Draws every character from a given string starting at (x,y) with
     * specified color.Does NOT refresh de screen
     *
     * @param x The starting x for the string
     * @param y
     * @param st
     * @param color
     * @param style
     * @throws java.io.IOException
     */
    public static void string(int x, int y, String st, TextColor color, SGR style) throws IOException {
        char chList[] = st.toCharArray();
        for (char ch : chList) {
            character(x, y, ch, color, style);
            x++;
        }
    }
}