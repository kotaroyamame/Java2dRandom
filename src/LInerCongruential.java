import java.security.SecureRandom;
public class LInerCongruential {

  public LInerCongruential() {
    // TODO Auto-generated constructor stub
  }
  public double Uniform(int xd){
    int x=10;
    int a=1103515245,b=12345,c=2147483647;
    x = (a*x + b)&c;
     
    return xd*((double)x+1.0) / ((double)c+2.0);
}

}
