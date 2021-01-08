public class Tuple extends General{
    double x;
    double y;
    double z;
    double w;//0-vector, 1-point

    public Tuple(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.w = 0;
    }

    public Tuple(double x, double y, double z, double w){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public Tuple add(Tuple t2){
        return new Tuple(
                x+t2.x,
                y+t2.y,
                z+t2.z,
                w+t2.w
        );
    }
    public Tuple subtract(Tuple t2){
        return new Tuple(
                x-t2.x,
                y-t2.y,
                z-t2.z,
                w-t2.w
        );
    }

    public Tuple multiScalar(double s){
        return new Tuple(
                x*s,
                y*s,
                z*s,
                w*s
        );
    }

    public Tuple divide(double s){
        if(s != 0){
            return new Tuple(
                    x/s,
                    y/s,
                    z/s,
                    w/s
            );
        }
        else {
            return new Tuple(0, 0, 0, 0);
        }
    }

    public Tuple negate(){
        if(w == 1){
            return new Tuple(-x, -y, -z, 1);
        }
        return new Tuple(-x, -y, -z, 0);
    }

    public double magnitude(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public boolean equals(Tuple t2){
        return doubleEqual(this.x,t2.x) && doubleEqual(this.y,t2.y) && doubleEqual(this.z,t2.z) && doubleEqual(this.w,t2.w);
    }

    public Tuple normalize(){
        return this.divide(this.magnitude());
    }

    public double dot(Vector t2) {
        return this.x * t2.x + this.y * t2.y + this.z * t2.z + this.w * t2.w;
    }
    public Vector cross(Vector v2){
        return new Vector(this.y*v2.z - this.z*v2.y,
                this.z*v2.x-this.x*v2.z,
                this.x*v2.y-this.y*v2.x);
    }
}
