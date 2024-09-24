package Graphics;

import javax.swing.*;

public class Window extends JFrame {
    public Window(){
        this.setTitle("myProgram");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,700);
        this.add(new Panel());
        this.setVisible(true);

    }
}
