public class General {
    public boolean doubleEqual(double a, double b){
        return Math.abs(a-b) <= 0.0001;
    }
    public boolean doubleEqual(double a, double b, double epsilon){
        return Math.abs(a-b) <= epsilon;
    }
}
