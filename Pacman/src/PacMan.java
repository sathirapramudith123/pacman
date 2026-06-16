import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import javax.swing.*;
import java.util.Random;

public class PacMan{
    private int rowCount = 21;
    private int columnCount = 19;
    private int tileSize = 32;
    private int boardWidth = columnCount * tileSize;
    private int boardHeight = rowCount * tileSize;

    PacMan(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);
    }
}