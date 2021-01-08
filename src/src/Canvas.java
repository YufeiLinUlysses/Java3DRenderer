public class Canvas {
    int width = 0;
    int height = 0;
    Color[][] canv;

    public Canvas(int width, int height){
        this.width = width;
        this.height = height;
        this.canv = new Color[width][height];
        for (int i = 0; i <this.width;i++){
            for (int j = 0; j < this.height;j++){
                this.canv[i][j] = new Color();
            }
        }
    }

    public void writePixel(int i, int j, Color col){
        this.canv[i][j] = col;
    }

    public Color getPixel(int i, int j){
        return this.canv[i][j];
    }

    public String writeToPPM(){
        String result = "P3" + "\n" + this.width + " " + this.height + "\n" + 255+"\n";
        for(int i = 0; i < this.width; i++){
            String temp="";
            for (int j = 0; j <this.height; j++){
                Color c = this.getPixel(i,j);
                String red = (int)(c.col.x*255) + " ";
                String green = (int)(c.col.y*255)+ " ";
                String blue = String.valueOf((int)(c.col.z * 255));
                if (j==this.height - 1){
                    blue += "\n";
                }
                else{
                    blue += " ";
                }
                if(temp.length()+red.length()<=70){
                    temp += red;
                }
                else{
                    result += temp + "\n";
                    temp = red;
                }
                if(temp.length()+green.length()<=70){
                    temp += green;
                }
                else{
                    result += temp + "\n";
                    temp = green;
                }
                if(temp.length()+blue.length()<=70){
                    temp += blue;
                }
                else{
                    result += temp + "\n";
                    temp = blue;
                }
            }
            result += temp;
        }
        return result;
    }


}
