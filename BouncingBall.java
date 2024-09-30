public class BouncingBall {

  public static double totalDistance(double height, double velocity, int bounces) {
      double en = velocity / bounces;
      double totalDist = height * Math.pow(en, 2);
      return totalDist;
  }

  public static void main(String[] args) {
      double height = 10;
      double velocity = 30;
      int bounces = 5;

      int result = (int)(totalDistance(height, velocity, bounces));
      System.out.println(result);
  }
}
