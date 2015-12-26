
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import com.sun.prism.paint.Color;

import net.goui.util.MTRandom;

import java.security.SecureRandom;
public class PaintOrisinal extends JPanel{
  private static int[][] ar={{600,400},{600,400}};
  private static int old;
  int ran=0,ran2=0;
  JFrame frame;
  Random rnd = new Random();
  Random rnd2 = new MTRandom();
//  public PaintOrisinal() {
//    // TODO Auto-generated constructor stub
//    super();
//    this.render();
//  }
  public PaintOrisinal(JFrame frame_) {
    // TODO Auto-generated constructor stub
    super();
    frame=frame_;
    //this.render();
  }
//  private void render(){
//    frame = new JFrame();
//
//    Java2dRandom app = new Java2dRandom();
//    frame.getContentPane().add(app);
//
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setBounds(10, 10, 1200, 800);
//    frame.setTitle("ランダム可視化");
//    frame.setVisible(true);
//  }
  public void paint1(Graphics g,int i2){

//    Random rnd = new Random();
//    Random rnd2 = new MTRandom();
//    int ran = (int)(Math.random()*600);
//    int ran2 = (int)(Math.random()*600);
    
//    for(int i=0;i<10;i++){
//     if(i==5)
      ran = rnd2.nextInt(1200);
//     if(i==5)
      ran2= rnd2.nextInt(600);
      
//    }
      System.out.println(ran);
      g.drawRect(i2%800, ran, 1, 1);
      g.dispose();
  }
  public void paintComponent(Graphics g_){
    Graphics2D g = (Graphics2D)g_;
   // Random rnd = new SecureRandom();
    Random rnd = new MTRandom();
    //Random rnd = new Random();
    //for(int i=0;i<10;i++){
    int ran;
    //do{
      //ran = (int)(Math.random()*8);
      ran = rnd.nextInt(8);
      System.out.println(ran);
      //Math.floor(ran);
    //}while(Math.abs(old-ran)==2);//一回前の道を逆戻りしない設定
    old=ran;
      this.ando(ran);
      g.draw(new Line2D.Double(ar[0][0], ar[0][1], ar[1][0], ar[1][1]));
    //}
      g.dispose();

    
  }
  public void clear(){
    frame.repaint();
  }
  public void ando(int a){
    for(int[] xd:ar){
      for(int x:xd){
        if(x<0||x>1200){
          ar[0][0]=600;
          ar[0][1]=400;
          ar[1][0]=600;
          ar[1][1]=400;
        }
      }
    }
    
    ar[0][0]=ar[1][0];
    ar[0][1]=ar[1][1];
    switch(a){
      case 0:
        ar[1][0]-=2;
        break;
      case 1:
        ar[1][0]-=2;
        ar[1][1]+=2;
        break;
      case 2:
        ar[1][1]+=2;
        break;
      case 3:
        ar[1][0]+=2;
        ar[1][1]+=2;
        break;
      case 4:
        ar[1][0]+=2;
        break;
      case 5:
        ar[1][0]+=2;
        ar[1][1]-=2;
        break;
      case 6:
        ar[1][1]-=2;
        break;
      case 7:
        ar[1][0]-=2;
        ar[1][1]-=2;
        break;
    }
  }
}
