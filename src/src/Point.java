public class Point extends Tuple{
    public Point(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.w = 1;
    }
    public Point(double x, double y, double z){
        this.x= x;
        this.y = y;
        this.z = z;
        this.w = 1;
    }
}
