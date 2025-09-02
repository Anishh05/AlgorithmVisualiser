package sortvisualiser.screens;

import java.awt.Dimension;

import javax.swing.JPanel;

import sortvisualiser.MainApp;
import static sortvisualiser.MainApp.WIN_HEIGHT;
import static sortvisualiser.MainApp.WIN_WIDTH;


public abstract class Screen extends JPanel {
    protected MainApp app;
    
    public Screen(MainApp app) {
        this.app = app;
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIN_WIDTH, WIN_HEIGHT);
    }
    
    public abstract void onOpen();
}
