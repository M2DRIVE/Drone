import javax.swing.*;
import java.awt.event.*;

public class Remote extends JFrame {
    private JLabel GUI = new JLabel();
    private KeyListener listener = new KeyListener();

    private JLabel triangleUp, triangleDown, triangleLeft, triangleRight;
    private JLabel arrowUp, arrowDown, arrowLeft, arrowRight;
    

    public Remote() {
        setSize(640, 395);
        setIconImage(getIcon("icon.png").getImage());
        setTitle("Tello Drone Contoller");
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        addKeyListener(listener);
        loadAssets();
        setVisible(true);
    }

    public void loadAssets() {
        ImageIcon backgroundImage = new ImageIcon("src/images/Background.png");
        JLabel background = new JLabel("", backgroundImage, JLabel.CENTER);
        background.setBounds(0,0,640,360);

        JLabel joystick = new JLabel();
        joystick.setBounds(getBounds());

        JLabel arrows = new JLabel(getIcon("joysticks/Arrows.png"));
        arrows.setBounds(getBounds());

        int Yoffset = 20;
        int Xoffset = 318;

        triangleUp = new JLabel(getIcon("joysticks/shapes/TriangleUP.png"));
        triangleUp.setBounds(89, 121+Yoffset, 143, 102);

        triangleDown = new JLabel(getIcon("joysticks/shapes/TriangleBottom.png"));
        triangleDown.setBounds(90, 220+Yoffset, 141, 100);

        triangleLeft = new JLabel(getIcon("joysticks/shapes/TriangleLeft.png"));
        triangleLeft.setBounds(58, 145+Yoffset, 107, 152);

        triangleRight = new JLabel(getIcon("joysticks/shapes/TriangleRight.png"));
        triangleRight.setBounds(159, 150+Yoffset, 101, 142);

        arrowUp = new JLabel(getIcon("joysticks/shapes/TriangleUP.png"));
        arrowUp.setBounds(89+Xoffset, 121+Yoffset, 143, 102);

        arrowDown = new JLabel(getIcon("joysticks/shapes/TriangleBottom.png"));
        arrowDown.setBounds(90+Xoffset, 220+Yoffset, 141, 100);

        arrowLeft = new JLabel(getIcon("joysticks/shapes/TriangleLeft.png"));
        arrowLeft.setBounds(58+Xoffset, 145+Yoffset, 107, 152);

        arrowRight = new JLabel(getIcon("joysticks/shapes/TriangleRight.png"));
        arrowRight.setBounds(159+Xoffset, 150+Yoffset, 101, 142);

        joystick.add(triangleUp);
        joystick.add(triangleDown);
        joystick.add(triangleLeft);
        joystick.add(triangleRight);
        joystick.add(arrowUp);
        joystick.add(arrowDown);
        joystick.add(arrowLeft);
        joystick.add(arrowRight);
        
        triangleUp.setVisible(false);
        triangleDown.setVisible(false);
        triangleLeft.setVisible(false);
        triangleRight.setVisible(false);
        arrowUp.setVisible(false);
        arrowDown.setVisible(false);
        arrowLeft.setVisible(false);
        arrowRight.setVisible(false);
        
        GUI.setBounds(getBounds());
        GUI.add(arrows);
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

            switch(e.getKeyCode()) {
                case 38 : arrowUp.setVisible(true); break;
                case 37 : arrowLeft.setVisible(true); break;
                case 40 : arrowDown.setVisible(true); break;
                case 39 : arrowRight.setVisible(true); break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            switch(e.getKeyChar()) {
                case 'w' : triangleUp.setVisible(false); break;
                case 'a' : triangleLeft.setVisible(false); break;
                case 's' : triangleDown.setVisible(false); break;
                case 'd' : triangleRight.setVisible(false); break;
            }

            switch(e.getKeyCode()) {
                case 38 : arrowUp.setVisible(false); break;
                case 37 : arrowLeft.setVisible(false); break;
                case 40 : arrowDown.setVisible(false); break;
                case 39 : arrowRight.setVisible(false); break;
            }
        }
     }
}
