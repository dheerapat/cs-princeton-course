public class ThueMorse {
  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    int[] seq = new int[n];
    
    for (int m = 0; m < n; m++ )
    {
      if (m == 0) seq[m] = 0;
      else if (m%2 == 0) seq[m] = seq[m/2];
      else if (m%2 != 0) seq[m] = 1- seq[m-1];
    }
    
    // for (int p = 0; p < n; p++)
    // {
    //   System.out.print(seq[p]);
    // }
    
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        if (seq[i] == seq[j])
          System.out.print("+  ");
        else
          System.out.print("-  ");
      }
      System.out.println();
    }
  }
}
