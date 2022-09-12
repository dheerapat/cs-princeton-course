public class GeneralizedHarmonic {
  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);
    int r = Integer.parseInt(args[1]);
    double a = 0;
    
    if (N <= 0)
      System.out.println("invalid");
    else
      for (int i = 1; i <= N; i++)
      {
        a = a + (1/(Math.pow(i,r)));
      }
    System.out.println(a);
  }
}
