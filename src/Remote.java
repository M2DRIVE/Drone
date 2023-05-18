import javax.swing.*;
import java.awt.Image;
import java.awt.event.*;

public class Remote extends JFrame {
    private JLabel GUI = new JLabel();
    private KeyListener listener = new KeyListener();

    private JLabel triangleUp, triangleDown, triangleLeft, triangleRight;

    public Remote() {
        setSize(640, 395);
        setIconImage(getIcon("icon.png").getImage());
        setTitle("Tello Drone Contoller");
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

        JLabel joystick = new JLabel();
        joystick.setBounds(0,0,640,360);

        JLabel triangleUp = new JLabel(getIcon("joysticks/shapes/TriangleUP.png"));
        triangleUp.setBounds(89, 121, 143, 102);

        JLabel triangleDown = new JLabel(getIcon("joysticks/shapes/TriangleBottom.png"));
        triangleDown.setBounds(90, 220, 141, 100);

        JLabel triangleLeft = new JLabel(getIcon("joysticks/shapes/TriangleLeft.png"));
        triangleLeft.setBounds(58, 145, 107, 152);

        JLabel triangleRight = new JLabel(getIcon("joysticks/shapes/TriangleRight.png"));
        triangleRight.setBounds(159, 150, 101, 142);
        
        joystick.add(triangleUp);
        joystick.add(triangleDown);
        joystick.add(triangleLeft);
        joystick.add(triangleRight);
        
        triangleUp.setVisible(false);
        triangleDown.setVisible(false);
        triangleLeft.setVisible(false);
        triangleRight.setVisible(false);

        GUI.setBounds(getBounds());
        GUI.add(joystick);
        GUI.add(background);
        

        add(GUI);
    }

    public ImageIcon getIcon(String filename) {
        return new ImageIcon("src/images/" + filename);
    }

    private class KeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
           switch(e.getKeyChar()) {
                case 'w' : triangleUp.setVisible(true); break;
                case 'a' : triangleLeft.setVisible(true); break;
                case 's' : triangleDown.setVisible(true); break;
                case 'd' : triangleRight.setVisible(true); break;
           }
        }
     }
}
