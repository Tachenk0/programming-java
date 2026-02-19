
public class rectangle {
    public double width = -1;
    public double height = -1;
    public rectangle(){

    }
    public rectangle(double _width, double _height){
        width=_width;
        height=_height;
    }
    public double getarea(){
        return width * height;
    }
    public double getperimetr(){
        return (width+height)*2;
    }
    @Override
    public String toString() {
        return ""+height+","+width+","+getarea()+","+getperimetr();
    }
}

