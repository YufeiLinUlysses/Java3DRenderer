public class Color{
    Vector col = new Vector();
    public Color(){
    }
    public Color(double r, double g, double b){
        if (r > 1){
            r = 1;
        }
        if(r<0){
            r = 0;
        }
        if(g>1){
            g=1;
        }
        if(g<0){
            g=0;
        }
        if(b>1){
            g=1;
        }
        if(b<0){
            g=0;
        }
        this.col = new Vector(r,g,b);
    }

    public Color add(Color c2){
        Tuple sum = this.col.add(c2.col);
        return new Color(sum.x, sum.y,sum.z);
    }

    public Color subtract(Color c2){
        Tuple diff = this.col.subtract(c2.col);
        return new Color(diff.x, diff.y,diff.z);
    }

    public Color multiply(double d){
        Tuple sum = this.col.multiScalar(d);
        return new Color(sum.x, sum.y,sum.z);
    }

    public Color multiply(Color c2){
        return new Color(this.col.x * c2.col.x,
                         this.col.y * c2.col.y,
                         this.col.z * c2.col.z);
    }
}
