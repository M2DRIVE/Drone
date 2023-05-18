import javax.swing.*;
import java.awt.event.*;

public class Remote extends JFrame {
    private JLabel GUI = new JLabel();
    private KeyListener listener = new KeyListener();

    public Remote() {
        setSize(640, 395);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        addKeyListener(listener);
        loadAssets();
    }

    public void loadAssets() {
        ImageIcon backgroundImage = new ImageIcon("src/images/Background.png");
        JLabel background = new JLabel("", backgroundImage, JLabel.CENTER);
        background.setBounds(0,0,640,360);

        GUI.setBounds(getBounds());
        GUI.add(background);
        add(GUI);
    }

    private class KeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
           System.out.println(e.getKeyChar());
        }
     }
}
