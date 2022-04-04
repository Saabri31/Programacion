package tetrisconsole;

import com.googlecode.lanterna.TextColor;


public class Color {
    public static final TextColor WHITE;
    public static final TextColor DIM_WHITE;
    public static final TextColor GREY;
    public static final TextColor RED;
    public static final TextColor GREEN;
    public static final TextColor BLUE;
    public static final TextColor MAGENTA;
    public static final TextColor CYAN;

    static {        
        WHITE = TextColor.ANSI.WHITE_BRIGHT;
        GREY = new TextColor.RGB(70, 70, 70);
        DIM_WHITE = TextColor.ANSI.WHITE;
        RED = TextColor.ANSI.RED;
        GREEN = TextColor.ANSI.GREEN;
        BLUE = TextColor.ANSI.BLUE;
        MAGENTA = TextColor.ANSI.MAGENTA;
        CYAN = TextColor.ANSI.CYAN;
    }
}