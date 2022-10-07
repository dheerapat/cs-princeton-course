public class DiscreteDistribution {
	public static void main(String[] args)
	{
		int m = Integer.parseInt(args[0]);
		int[] a = new int[args.length - 1];
		int[] S = new int[a.length + 1];
		
		// parse command line argument into array
		for (int i = 1; i <= a.length; i++)
		{
		  a[i-1] = Integer.parseInt(args[i]);
	  }
	  
	  // System.out.println(m);
	  // System.out.println(a[0]);
	  
	  for (int j = 1; j < S.length; j++)
	  {
	    S[j] = S[j-1] + a[j-1];
	  }
	  
	  // for (int k = 0; k < S.length; k++)
	  // {
	  //   System.out.println(S[k]);
	  // }
	  // System.out.println(S.length);
	  // System.out.println(a.length);
	  for (int k = 0; k < m; k++)
	  {
	    int r = (int) (Math.random() * S[S.length-1]);
	    int l = 0;
	    while (l < S.length)
	    {
	      if ((r < S[l]) && (r >= S[l-1]))
	        System.out.print(l + " ");
	      l++;
	    }
	  }
	  System.out.println();
	}
}
