package org.idx.window;

import org.idx.Main;
import org.idx.items.ItemBase;

import javax.swing.*;
import java.awt.*;

public class Window {

    public Window() {

        JFrame frame = new JFrame("IDX Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Theme.BACKGROUND_COLOR);

//        JLabel label = new JLabel("Welcome to IDX!", SwingConstants.CENTER);
//        label.setFont(label.getFont().deriveFont(24f));
//        label.setForeground(Theme.TEXT_COLOR);
//        frame.add(label, BorderLayout.CENTER);


        JPanel listPanel = new JPanel();
        listPanel.setLayout(new OverlayLayout(listPanel));
        listPanel.setBackground(Theme.BACKGROUND_COLOR);

        for (ItemBase item : Main.dataManager.getItems()) {
            listPanel.add(new ItemPanel(item));
        }

        JScrollPane scrollPane = new JScrollPane(listPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setBackground(Theme.BACKGROUND_COLOR);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.pack();
        frame.setResizable(true);

    }

}
