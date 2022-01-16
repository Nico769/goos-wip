package auctionsniper;

import auctionsniper.ui.MainWindow;

import javax.swing.*;

public class Main {
    public static final String STATUS_JOINING = "Joining";
    public static final String STATUS_LOST = "Lost";
    public static final String MAIN_WINDOW_NAME = "Auction Sniper Name";
    public static final String SNIPER_STATUS_NAME = "sniper status";

    private MainWindow ui;

    public Main() throws Exception {
        startUserInterface();
    }

    public static void main(String... args) throws Exception {
        Main main = new Main();
    }

    private void startUserInterface() throws Exception {
        SwingUtilities.invokeAndWait(() -> ui = new MainWindow());
    }
}
