public class cubeattempt2 {
    /* make a class that represents a cube.
    have a constructor that initilizes the side
    method initilixes the volume
    method that initilizes the outside surface area
    function that grows the side
    function that reduces a side by a double
     */
    private int side;
    public cubeattempt2(int side){
        this.side = side;
    }
    public int volume(int side){
        return side * side * side;
    }
    public int serfaceArea(int side){
        return 6 * side * side;
    }
    public void growSide(int input){
        side += input;
    }
    public void reduceSide(int input){
        side -= input;
    }
}
