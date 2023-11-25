public class testCube{
    public static void main(String[] args){
        cube cube1 = new cube(7);
        cube cube2 = new cube(4);
        cube cube3;
        cube3 = cube1;
        cube1.growSide(0.5);
        cube2.reduceSide(1.2);
        cube1.growSide(5);
        System.out.println(cube3.volume());
        System.out.println(cube1.volume());
        System.out.println(cube1.volume() - cube2.volume());
        cube.numOfFaces = 9;
    }

}