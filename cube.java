public class cube {
    /* make a class that represents a cube.
    have a constructor that initilizes the side
    method initilixes the volume
    method that initilizes the outside surface area
    function that grows the side
    function that reduces a side by a double
     */
    public static int numOfFaces;
    private double side;
    public cube(double side){
        this.side = side;
    }
    public double surfaceArea(){
        return side * side * 6;
    }
    public double volume(){
        return side * side * side;
    }
    public void growSide(double input){
        side += input;
    }
    public void reduceSide(double input){
        side -= input;
    }
}

