package org.idx.window;

import org.idx.items.Item;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ItemPanel extends JPanel {


    private Item item;
    private BufferedImage image;

    public ItemPanel(Item item) {
        this.item = item;

        setPreferredSize(new Dimension(300, 64));
        setBackground(new Color(30, 30, 50));

        try {
            image = ImageIO.read(new File("res/assets/" + item.getMaterial() + ".png"));
        } catch (Exception e) {
            image = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the item image
        if (image != null) {
            g.drawImage(image, 0, 0, 64, 64, null);
        }

        // Draw the item name
        g.setColor(Theme.TEXT_COLOR);
        g.drawString(item.getName(), 70, 20);

        // Draw the item description
        g.setColor(Color.LIGHT_GRAY);
        g.drawString(item.getDescription(), 70, 40);
    }
}
