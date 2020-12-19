package Recursion;

import javafx.scene.paint.Color;
import java.awt.*;

public class PaintFill {

    public boolean fillHelper(Color[][] colors, Point toChange, Color oldColor, Color newColor) {
        if (toChange.x < 0 || toChange.y < 0 ||
                toChange.y >= colors.length ||
                toChange.x >= colors[0].length ||
                colors[toChange.x][toChange.y] != oldColor) {
            return false;
        }

        colors[toChange.x][toChange.y] = newColor;

        fillHelper(colors, new Point(toChange.x + 1, toChange.y), oldColor, newColor);
        fillHelper(colors, new Point(toChange.x - 1, toChange.y), oldColor, newColor);
        fillHelper(colors, new Point(toChange.x, toChange.y + 1), oldColor, newColor);
        fillHelper(colors, new Point(toChange.x, toChange.y - 1), oldColor, newColor);

        return true;
    }

    public boolean fill(Color[][] colors, Point clicked, Color newColor) {
        if (colors[clicked.x][clicked.y] == newColor) {
            return false;
        }
        return fillHelper(colors, clicked, colors[clicked.x][clicked.y], newColor);
    }
}
