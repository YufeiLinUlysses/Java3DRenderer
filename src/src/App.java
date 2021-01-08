public class App {
    public static void main(String[] args){
        Canvas c = new Canvas(5,3);

        Color c1 = new Color(1.5,0,0);
        Color c2 = new Color(0,0.5,0);
        Color c3 = new Color(-0.5,0,1);

        c.writePixel(0,0,c1);
        c.writePixel(2,1,c2);
        c.writePixel(4,2,c3);

        System.out.println(c.writeToPPM());
    }
}