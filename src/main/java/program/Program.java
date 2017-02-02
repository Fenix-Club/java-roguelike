package program;

import asciiPanel.AsciiPanel;
import logic.map.GameLevel;
import logic.persistance.Saver;

import javax.swing.*;

public class Program extends JFrame {

    static private AsciiPanel terminal;

    private Program() {
        terminal = new AsciiPanel(24, 24);
        add(terminal);
        pack();
    }

    public static void main(String[] args) {
        Program app = new Program();
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);

        GameLevel level1 = new GameLevel(5, "random");
        for (int i = 0; i < level1.map.length; i++) {
            for (int j = 0; j < level1.map[i].length; j++) {
                terminal.write(level1.map[i][j].getGround().getMapDisplay(), i, j);
            }
        }
        Saver saver = new Saver();
        saver.saveMap(level1);
    }
}
