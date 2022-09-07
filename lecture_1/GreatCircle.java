public class GreatCircle {
  public static void main(String[] args)
  {
    //input latitude and longitude
    double x1 = Double.parseDouble(args[0]);
    double y1 = Double.parseDouble(args[1]);
    double x2 = Double.parseDouble(args[2]);
    double y2 = Double.parseDouble(args[3]);
    
    //mean radius of earth
    double r = 6371.0;
    
    //convert degree to radians
    x1 = Math.toRadians(x1);
    y1 = Math.toRadians(y1);
    x2 = Math.toRadians(x2);
    y2 = Math.toRadians(y2);
    
    //Haversine formula
    double a = Math.pow(Math.sin((x2-x1)/2), 2) + (Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2-y1)/2), 2));
    double x = Math.sqrt(a);
    
    double distance = 2 * r * Math.asin(x);
    System.out.println(distance + " kilometers");
  }
}
