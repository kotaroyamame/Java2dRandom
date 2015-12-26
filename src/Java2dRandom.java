import javax.swing.*;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Java2dRandom extends JPanel{
  
  public static void main(String[] args){
    JFrame frame = new JFrame();

    Java2dRandom app = new Java2dRandom();
    frame.getContentPane().add(app);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(0, 0, 1200, 800);
    frame.setTitle("ランダム可視化");
    frame.setVisible(true);
    frame.setResizable(false);
    
    PaintOrisinal pa=new PaintOrisinal(frame);
    for(int i=0;i<100000;i++){
      pa.paintComponent(frame.getGraphics());
      //pa.paint1(frame.getGraphics(),i);
//      try {
//        Thread.sleep(0);
//      } catch (InterruptedException e) {
//          e.printStackTrace();
//      }
    }
  }
    
}