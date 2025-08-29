/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myapp.ui;

/**
 *
 * @author admin
 */

import java.awt.*;
import javax.swing.*;

public class NeumorphicPanel extends JPanel {
    
       public NeumorphicPanel() {
        setOpaque(false); // We'll paint our own background
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int arc = 100; // corner radius

        // Background color
        Color baseColor = new Color(255, 255, 255);

        // --- Simulated "neumorphic" shadows ---
        // --- Dark shadow (bottom-right) ---
        g2.setColor(new Color(163, 177, 198, 100));
        g2.fillRoundRect(6, 6, width - 6, height - 6, arc, arc);

        // --- Light shadow (top-left) ---
        g2.setColor(new Color(163, 177, 198, 100));
        g2.fillRoundRect(-6, -6, width - 4, height - 4, arc, arc);

        // --- Main panel ---
        g2.setColor(baseColor);
        g2.fillRoundRect(0, 0, width - 6, height - 6, arc, arc);

        g2.dispose();
        super.paintComponent(g);
    }
}
