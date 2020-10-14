import javax.swing.*;
import java.awt.*;
public class Level extends JPanel {

         JFrame window = new JFrame("PAC CPE") ; // add title
         Pacman pacman = new Pacman(0,0,"assets//ghost1.png",true); // add pacman.png
         Wall wall = new Wall(0,0,"assets//Wall.png");// add wall.png
         Move move =new Move(pacman,this); // Call move form class move
        public  Level(){ // Map 1
                window.addKeyListener(move);
                window.setFocusable(true);
                window.add(this);
                window.setSize(800,533); // edit windowsize
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setVisible(true);
        }

        public void paint(Graphics g){ // call picture
                ImageIcon background = new ImageIcon("assets//background.jpg");
                g.drawImage(background.getImage(),0,0,null);
                wall.drawWall(g);
                pacman.drawPacman(g);
        }

}


