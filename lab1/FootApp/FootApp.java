import java.util.Scanner;
public class FootApp {
    public static void main(String[] args) {
      FootShape footShape = new FootShape();  
      Foot foot = new Foot(footShape);
      Scanner inp = new Scanner(System.in);
      System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
      int type = inp.nextInt();
      switch(type) {
          case 1:
              foot.draw("Ellipse");
              break;
          case 2:
              foot.draw("Rectangle");
              break;
          default:
              System.out.println("Please choose only 1 or 2");
      }
    }
    
}
