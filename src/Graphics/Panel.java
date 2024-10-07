package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panel extends JPanel implements MouseListener {
    public Panel() {
        this.setBackground(Color.PINK);
        this.setSize(500, 500);
        this.setVisible(true);


    }

    public void drawComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(100, 100, 300, 300);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.repaint();


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}


// @author LivNTI