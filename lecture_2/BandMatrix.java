public class BandMatrix {
  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);
    
    // row i
    for (int i = 1; i <= n; i++)
    {
      // column j
      for (int j = 1; j <= n; j++)
      {
        if (Math.abs(i-j) <= width)
          System.out.print("*  ");
        else
          System.out.print("0  ");
      }
      System.out.println();
    }
  }
}
