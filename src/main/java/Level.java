import javax.swing.*;
import java.awt.*;
public class Level extends JPanel {

         JFrame window = new JFrame("PAC CPE") ;
         Pacman pacman = new Pacman(0,0,"assets//ghost1.png",true);
         Wall wall = new Wall(0,0,"assets//Wall.png");
         Move move =new Move(pacman,this);
        public  Level(){
                window.addKeyListener(move);
                window.setFocusable(true);
                window.add(this);
                window.setSize(800,533);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setVisible(true);
        }

        public void paint(Graphics g){
                ImageIcon background = new ImageIcon("assets//background.jpg");
                g.drawImage(background.getImage(),0,0,null);
                wall.drawWall(g);
                pacman.drawPacman(g);
        }

}


