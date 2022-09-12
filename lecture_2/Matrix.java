public class Matrix {
  public static void main(String[] args)
  {
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    
    for (int i = 1; i <= m; i++)
    {
      System.out.println();
      for (int j = 1; j <= n; j++)
      {
        System.out.print("*  ");
      }
    }
    System.out.println();
  }
}
