package tetrisconsole;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.input.KeyType;

public class Config {
    public static final int SCREEN_WIDTH;
    public static final int SCREEN_HEIGHT;
    public static final int MAIN_BOARD_WIDTH;
    public static final int MAIN_BOARD_HEIGHT;
    public static final int BOARD_GAP;
    public static final int PIECE_BOARD_WIDTH;
    public static final int PIECE_BOARD_HEIGHT;

    
    public static final TextColor VOID_COLOR;
    public static final TextColor BOARD_FRAME_COLOR;

    
    public static final KeyType LEFT_KEY;
    public static final KeyType RIGHT_KEY;
    public static final KeyType DOWN_KEY;
    
    public static final char DROP_KEY;
    public static final char ROTATE_COUNTERCLOCKWISE_KEY;
    public static final char ROTATE_CLOCKWISE_KEY;

    
    
    static {
        
        MAIN_BOARD_WIDTH = 20;
        MAIN_BOARD_HEIGHT = 40;
        BOARD_GAP = 3;
        PIECE_BOARD_WIDTH = 7;
        PIECE_BOARD_HEIGHT = 7;
        
        SCREEN_WIDTH = MAIN_BOARD_WIDTH + BOARD_GAP + PIECE_BOARD_WIDTH;
        SCREEN_HEIGHT = MAIN_BOARD_HEIGHT + 1;

        
        VOID_COLOR = Color.GREY;
        BOARD_FRAME_COLOR = Color.WHITE;
        

        LEFT_KEY = KeyType.ArrowLeft;
        RIGHT_KEY = KeyType.ArrowRight;
        DOWN_KEY = KeyType.ArrowDown;
        
        DROP_KEY = ' ';
        ROTATE_COUNTERCLOCKWISE_KEY = 'z';
        ROTATE_CLOCKWISE_KEY = 'x';
    }
}
