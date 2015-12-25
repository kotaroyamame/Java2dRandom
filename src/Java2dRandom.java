import javax.swing.*;

public class Java2dRandom extends JPanel{
  
  public static void main(String[] args){
    JFrame frame = new JFrame();

    Java2dRandom app = new Java2dRandom();
    frame.getContentPane().add(app);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 800, 1100);
    frame.setTitle("ランダム可視化");
    frame.setVisible(true);
    frame.setResizable(false);
    
    PaintOrisinal pa=new PaintOrisinal(frame);
    for(int i=0;i<1000000;i++){
      pa.paintComponent(frame.getGraphics());
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
    }
  }
    
}