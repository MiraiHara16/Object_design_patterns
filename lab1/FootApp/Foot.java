public class Foot {
    private FootShape footShape;
    public Foot(FootShape footShape) {
        this.footShape = footShape;
    }
    public void draw(String shape) {
        switch (shape) {
            case "Rectangle":
                footShape.drawAsRectangle();
                break;
            case "Ellipse":
                footShape.drawAsEllipse();
                break;
            default:
                System.out.println("cannnot draw this shape");
                break;
        }
    }
}
