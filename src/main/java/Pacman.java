import javax.swing.*;
import java.awt.*;


public class Pacman {
    private int xAxis ;
    private int yAxis ;
    private String imagePath ;
    private boolean isAlive ;

    public Pacman( int xAxis, int yAxis, String imagePath, boolean isAlive){

        this.setAlive(isAlive);
        this.setImagePath(imagePath);
        this.setxAxis(xAxis);
        this.setyAxis(yAxis);

    }
    public int getxAxis(){
        return  xAxis ;
    }
    public void setxAxis(int xAxis){
        if(isAlive){
            if (this.xAxis >730) this.xAxis = 730;
            else if(this.xAxis <0) this.xAxis =0 ;
            else  this.xAxis = xAxis ;
        }
        else this.xAxis = xAxis ;

    }
    public int getyAxis(){
        return  yAxis ;
    }
    public void setyAxis(int yAxis){
        if(isAlive){
            if (this.yAxis >430) this.yAxis = 430 ;
            else if(this.yAxis <0) this.yAxis =0 ;
            else  this.yAxis = yAxis ;
        }
        else this.yAxis = yAxis ;
    }
    public String getImagePath(){
        return  imagePath;
    }
    public void setImagePath(String imagePath){ //set imagePacman
        if (imagePath == null){
            JOptionPane.showMessageDialog(null,"Invalid string!");
            System.exit(1);
        }
        else this.imagePath = imagePath;

    }
    public boolean isAlive(){
        return isAlive;
    }
    public void setAlive(boolean isAlive){
        this.isAlive = isAlive;
    } // check life

    public void drawPacman(Graphics g){ // for call Pacman image
        ImageIcon img = new ImageIcon(imagePath);
        g.drawImage(img.getImage(),xAxis,yAxis,null);
    }

}