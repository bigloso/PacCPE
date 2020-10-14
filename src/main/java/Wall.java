import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;
import java.awt.*;

public class Wall  {
    private int xAis;
    private int yAis;
    private String imagePat ;

    public Wall(int xAis ,int yAis , String imagePat){
        this.setImagePat(imagePat);
        this.setxAis(xAis);
        this.setyAis(yAis);
    }

    public int getxAis() {
        return xAis ;
    }

    public void setxAis(int xAis){
         this.xAis = xAis ;
    }

    public int getyAis(){
        return yAis ;
    }

    public void setyAis(int yAis){
        this.yAis = yAis ;
    }

    public void setImagePat(String imagePat){ //set imageWall
        if (imagePat == null){
            JOptionPane.showMessageDialog(null,"Invalid string");
            System.exit(1);
        }
        else this.imagePat = imagePat ;

    }
    public String getImagePat(){
        return imagePat ;
    }

    public void drawWall(Graphics w) {  // for call image
        ImageIcon wall = new ImageIcon(imagePat);
        w.drawImage(wall.getImage(),xAis,yAis,null);

    }

}

