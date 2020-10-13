import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Move implements KeyListener {

    private  Pacman pacman ;
    private  Level level ;
    private int speed = 1 ;

    public Move(Pacman pacman,Level level ){
        this.level = level ;
        this.pacman = pacman ;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void  keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            pacman.setxAxis(pacman.getxAxis() + speed);
            pacman.setImagePath("assets//ghost1.png");
            level.repaint();
        }
        else if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            pacman.setxAxis(pacman.getxAxis() - speed);
            pacman.setImagePath("assets//ghost1.png");
            level.repaint();
        }
        else if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            pacman.setyAxis(pacman.getyAxis() - speed);
            pacman.setImagePath("assets//ghost1.png");
            level.repaint();
        }
        else if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            pacman.setyAxis(pacman.getyAxis() + speed);
            pacman.setImagePath("assets//ghost1.png");
            level.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
