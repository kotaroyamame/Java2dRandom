import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintOrisinal extends JPanel{
  private static int[][] ar={{600,400},{600,400}};
  private static int old;
  JFrame frame;
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
  public void paintComponent(Graphics g){
    //Graphics2D g = (Graphics2D) frame.getGraphics();
    
//    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
//                        RenderingHints.VALUE_ANTIALIAS_ON);
    Random rnd = new Random();
    //for(int i=0;i<10;i++){
    int ran;
    //do{
      ran = rnd.nextInt(8);
      Math.floor(ran);
    //}while(Math.abs(old-ran)==2);//一回前の道を逆戻りしない設定
    old=ran;
      this.ando(ran);
      ((Graphics2D) g).draw(new Line2D.Double(ar[0][0], ar[0][1], ar[1][0], ar[1][1]));
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
          Arrays.fill(ar[0], 400);
          Arrays.fill(ar[1], 600);
        }
      }
    }
    
    ar[0][0]=ar[1][0];
    ar[0][1]=ar[1][1];
    switch(a){
      case 0:
        ar[1][0]-=1;
        break;
      case 1:
        ar[1][0]-=1;
        ar[1][1]+=1;
        break;
      case 2:
        ar[1][1]+=1;
        break;
      case 3:
        ar[1][0]+=1;
        ar[1][1]+=1;
        break;
      case 4:
        ar[1][0]+=1;
        break;
      case 5:
        ar[1][0]+=1;
        ar[1][1]-=1;
        break;
      case 6:
        ar[1][1]-=1;
        break;
      case 7:
        ar[1][0]-=1;
        ar[1][1]-=1;
        break;
    }
  }
}
