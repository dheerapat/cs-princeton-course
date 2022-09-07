public class CMYKtoRGB {
  public static void main(String[] args)
  {
    double c = Double.parseDouble(args[0]);
    double m = Double.parseDouble(args[1]);
    double y = Double.parseDouble(args[2]);
    double k = Double.parseDouble(args[3]);
    
    double white = 1 - k;
    double red = 255 * white * (1-c);
    double green = 255 * white * (1-m);
    double blue = 255 * white * (1-y);
    
    long r = Math.round(red);
    long g = Math.round(green);
    long b = Math.round(blue);
    
    System.out.println("red   = " + r);
    System.out.println("green = " + g);
    System.out.println("blue  = " + b);
  }
}
