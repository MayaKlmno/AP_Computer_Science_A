public class readcubeAttempt2{
    private static void main(String[] args){
        cube cube1 = new cube(8);
        cube cube3 = new cube(10);
        cube1.growSide(5);
        cube1.growSide(6);
        cube cube2;
        cube2 = cube1;
        System.out.println(cube1.volume());
        System.out.println(cube2.volume());
        System.out.println(cube3.surfaceArea());
    }
}