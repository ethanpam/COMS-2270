package lab2;

/**
 * Try out the Basketball class.
 */
public class BasketballTest
{
  /**
   * Entry point.
   */
  public static void main(String[] args)
  {
    Basketball b;
    b = new Basketball(4.0);

    System.out.println(b.getDiameter());
    System.out.println(b.isDribbleable());

    Basketball b2 = new Basketball(6.0);

    b.inflate();
   // returns true
    System.out.println(b.isDribbleable());

   // returns false
    System.out.println(b2.isDribbleable());

    b.deflate();
    System.out.println("Deflate method returns: " + b.isDribbleable());
  }
}