public class RandomWalkers {
  public static void main(String[] args)
  {
    int r = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);
    double aggstep = 0;
    
    for (int i = 0; i < trials; i++)
    {
      int x0 = 0;
      int y0 = 0;
      int x1 = 0;
      int y1 = 0;
      int x2 = 0;
      int y2 = 0;
      int step = 0;
      int distance = 0;
      
      while (distance != r)
      {
        int rand = (int) (Math.random() * 4);
        if (rand == 0) x2 = x1+1;
        else if (rand == 1) x2 = x1-1;
        else if (rand == 2) y2 = y1+1;
        else if (rand == 3) y2 = y1-1;
        step = step + 1;
        distance = (int) (Math.abs(x0-x2) + Math.abs(y0-y2));
        x1 = x2;
        y1 = y2;
      }
      aggstep = aggstep + step;
    }
    double avgstep = aggstep/trials;
    System.out.println("average number of steps = " + avgstep);
  }
}
