import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MSMain extends JPanel implements MouseListener, KeyListener
{
    private JFrame frame;
    private JLabel label2;
    private int clicks = 0;

    public static void main(String[] args) {
        MSMain main = new MSMain();
    }

    private MSMain()
    {
        int monitorY = Toolkit.getDefaultToolkit().getScreenSize().height;
        int monitorX = Toolkit.getDefaultToolkit().getScreenSize().width;
        int labelHeight = 200;
        int labelWidth = 1200;

        frame = new JFrame("Mouse Supender");
        frame.setBounds(0, 0, monitorX, monitorY);
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        this.setLayout(null);

        JLabel label = new JLabel("<html><body>Feel free to do as you please!<br>Press space to exit application...</body></html>");
        label.setBounds(monitorX /2 - labelWidth /2, monitorY /2 - labelHeight /2, labelWidth, labelHeight);
        Font bigFont = new Font("Monospaced", Font.BOLD, 50);
        label.setFont(bigFont);

        label2 = new JLabel("Current number of clicks: 0");
        Font smallFont = new Font("Serif", Font.PLAIN, 20);
        label2.setFont(smallFont);
        label2.setBounds(0, 0, 300, 20);

        this.setBounds(0,0, monitorX, monitorY);
        this.add(label);
        this.add(label2);
        frame.add(this);
        frame.addKeyListener(this);
        frame.addMouseListener(this);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        label2.setText("Current number of clicks: " + ++clicks);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        //Ignored
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        //Ignored
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        //Ignored
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        //Ignored
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode() == KeyEvent.VK_SPACE)
        {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
