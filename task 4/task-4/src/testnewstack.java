public class testnewstack implements Comparable<testnewstack> {

    public int width = -1;
    public int height = -1;

    public testnewstack() {

    }
    public testnewstack(int _width, int _height) {
        this.width = _width;
        this.height = _height;
    }

    public int compareTo(testnewstack obj) {
        return (this.width*this.height) - (obj.width*obj.height);
    }

    @Override
    public String toString() {
        return "(" + width + ", " + height + ")";
    }
}