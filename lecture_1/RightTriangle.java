public class RightTriangle {
  public static void main(String[] args)
  {
    //input a,b,c at runtime
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    
    double a2 = Math.pow(a, 2);
    double b2 = Math.pow(b, 2);
    double c2 = Math.pow(c, 2);
    
    //check if right triangle and a,b,c is all positive value
    boolean isRightTriangle = (((a2+b2) == c2) || ((a2+c2) == b2) || ((c2+b2) == a2)) && (a >= 0) && (b >= 0) && (c >= 0);
    System.out.println(isRightTriangle);
  }
}
