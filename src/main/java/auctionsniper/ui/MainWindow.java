package auctionsniper.ui;

import auctionsniper.Main;
import auctionsniper.SniperState;
import auctionsniper.SnipersTableModel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import static auctionsniper.SnipersTableModel.textFor;

public class MainWindow extends JFrame {
    private final JLabel sniperStatus = createLabel(textFor(SniperState.JOINING));
    private final SnipersTableModel snipers;

    public MainWindow(SnipersTableModel snipers) {
        super("Auction sniper");
        // The model must be assigned here, before creating the JTable
        this.snipers = snipers;
        setName(Main.MAIN_WINDOW_NAME);
        fillContentPane(makeSnipersTable());
        add(sniperStatus);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private static JLabel createLabel(String initialText) {
        JLabel result = new JLabel(initialText);
        result.setName(Main.SNIPER_STATUS_NAME);
        result.setBorder(new LineBorder(Color.BLACK));
        return result;
    }

    private void fillContentPane(JTable snipersTable) {
        final Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        contentPane.add(new JScrollPane(snipersTable), BorderLayout.CENTER);
    }

    private JTable makeSnipersTable() {
        final JTable snipersTable = new JTable(snipers);
        snipersTable.setName(Main.SNIPERS_TABLE_NAME);
        return snipersTable;
    }
}
